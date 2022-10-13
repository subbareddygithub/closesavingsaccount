package com.ibm.dip.model.servicingorder;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveServicingOrderProcedureResponseServicingOrderProcedure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T05:14:10.696Z[GMT]")

public class RetrieveServicingOrderProcedureResponseServicingOrderProcedure   {
  @JsonProperty("ThirdPartyReference")
  private Object thirdPartyReference;

  @JsonProperty("ThirdPartyServicingMandateReference")
  private Object thirdPartyServicingMandateReference;

  @JsonProperty("CustomerReference")
  private Object customerReference;

  @JsonProperty("CustomerEligibilityAssessmentInstanceReference")
  private Object customerEligibilityAssessmentInstanceReference;

  @JsonProperty("ServicingOrderType")
  private String servicingOrderType;

  @JsonProperty("ServicingOrderTaskRecord")
  private String servicingOrderTaskRecord;

  @JsonProperty("ServicingOrderDescription")
  private String servicingOrderDescription;

  @JsonProperty("EmployeeOrBusinessUnitReference")
  private Object employeeOrBusinessUnitReference;

  @JsonProperty("ServicingOrderWorkProduct")
  private String servicingOrderWorkProduct;

  @JsonProperty("ServicingOrderWorkTaskResult")
  private String servicingOrderWorkTaskResult;

  public RetrieveServicingOrderProcedureResponseServicingOrderProcedure thirdPartyReference(Object thirdPartyReference) {
    this.thirdPartyReference = thirdPartyReference;
    return this;
  }

  /**
   * Get thirdPartyReference
   * @return thirdPartyReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getThirdPartyReference() {
    return thirdPartyReference;
  }

  public void setThirdPartyReference(Object thirdPartyReference) {
    this.thirdPartyReference = thirdPartyReference;
  }

  public RetrieveServicingOrderProcedureResponseServicingOrderProcedure thirdPartyServicingMandateReference(Object thirdPartyServicingMandateReference) {
    this.thirdPartyServicingMandateReference = thirdPartyServicingMandateReference;
    return this;
  }

  /**
   * Get thirdPartyServicingMandateReference
   * @return thirdPartyServicingMandateReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getThirdPartyServicingMandateReference() {
    return thirdPartyServicingMandateReference;
  }

  public void setThirdPartyServicingMandateReference(Object thirdPartyServicingMandateReference) {
    this.thirdPartyServicingMandateReference = thirdPartyServicingMandateReference;
  }

  public RetrieveServicingOrderProcedureResponseServicingOrderProcedure customerReference(Object customerReference) {
    this.customerReference = customerReference;
    return this;
  }

  /**
   * Get customerReference
   * @return customerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(Object customerReference) {
    this.customerReference = customerReference;
  }

  public RetrieveServicingOrderProcedureResponseServicingOrderProcedure customerEligibilityAssessmentInstanceReference(Object customerEligibilityAssessmentInstanceReference) {
    this.customerEligibilityAssessmentInstanceReference = customerEligibilityAssessmentInstanceReference;
    return this;
  }

  /**
   * Get customerEligibilityAssessmentInstanceReference
   * @return customerEligibilityAssessmentInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerEligibilityAssessmentInstanceReference() {
    return customerEligibilityAssessmentInstanceReference;
  }

  public void setCustomerEligibilityAssessmentInstanceReference(Object customerEligibilityAssessmentInstanceReference) {
    this.customerEligibilityAssessmentInstanceReference = customerEligibilityAssessmentInstanceReference;
  }

  public RetrieveServicingOrderProcedureResponseServicingOrderProcedure servicingOrderType(String servicingOrderType) {
    this.servicingOrderType = servicingOrderType;
    return this;
  }

  /**
   * Get servicingOrderType
   * @return servicingOrderType
  */
  @ApiModelProperty(value = "")


  public String getServicingOrderType() {
    return servicingOrderType;
  }

  public void setServicingOrderType(String servicingOrderType) {
    this.servicingOrderType = servicingOrderType;
  }

  public RetrieveServicingOrderProcedureResponseServicingOrderProcedure servicingOrderTaskRecord(String servicingOrderTaskRecord) {
    this.servicingOrderTaskRecord = servicingOrderTaskRecord;
    return this;
  }

  /**
   * Get servicingOrderTaskRecord
   * @return servicingOrderTaskRecord
  */
  @ApiModelProperty(value = "")


  public String getServicingOrderTaskRecord() {
    return servicingOrderTaskRecord;
  }

  public void setServicingOrderTaskRecord(String servicingOrderTaskRecord) {
    this.servicingOrderTaskRecord = servicingOrderTaskRecord;
  }

  public RetrieveServicingOrderProcedureResponseServicingOrderProcedure servicingOrderDescription(String servicingOrderDescription) {
    this.servicingOrderDescription = servicingOrderDescription;
    return this;
  }

  /**
   * Get servicingOrderDescription
   * @return servicingOrderDescription
  */
  @ApiModelProperty(value = "")


  public String getServicingOrderDescription() {
    return servicingOrderDescription;
  }

  public void setServicingOrderDescription(String servicingOrderDescription) {
    this.servicingOrderDescription = servicingOrderDescription;
  }

  public RetrieveServicingOrderProcedureResponseServicingOrderProcedure employeeOrBusinessUnitReference(Object employeeOrBusinessUnitReference) {
    this.employeeOrBusinessUnitReference = employeeOrBusinessUnitReference;
    return this;
  }

  /**
   * Get employeeOrBusinessUnitReference
   * @return employeeOrBusinessUnitReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getEmployeeOrBusinessUnitReference() {
    return employeeOrBusinessUnitReference;
  }

  public void setEmployeeOrBusinessUnitReference(Object employeeOrBusinessUnitReference) {
    this.employeeOrBusinessUnitReference = employeeOrBusinessUnitReference;
  }

  public RetrieveServicingOrderProcedureResponseServicingOrderProcedure servicingOrderWorkProduct(String servicingOrderWorkProduct) {
    this.servicingOrderWorkProduct = servicingOrderWorkProduct;
    return this;
  }

  /**
   * Get servicingOrderWorkProduct
   * @return servicingOrderWorkProduct
  */
  @ApiModelProperty(value = "")


  public String getServicingOrderWorkProduct() {
    return servicingOrderWorkProduct;
  }

  public void setServicingOrderWorkProduct(String servicingOrderWorkProduct) {
    this.servicingOrderWorkProduct = servicingOrderWorkProduct;
  }

  public RetrieveServicingOrderProcedureResponseServicingOrderProcedure servicingOrderWorkTaskResult(String servicingOrderWorkTaskResult) {
    this.servicingOrderWorkTaskResult = servicingOrderWorkTaskResult;
    return this;
  }

  /**
   * Get servicingOrderWorkTaskResult
   * @return servicingOrderWorkTaskResult
  */
  @ApiModelProperty(value = "")


  public String getServicingOrderWorkTaskResult() {
    return servicingOrderWorkTaskResult;
  }

  public void setServicingOrderWorkTaskResult(String servicingOrderWorkTaskResult) {
    this.servicingOrderWorkTaskResult = servicingOrderWorkTaskResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveServicingOrderProcedureResponseServicingOrderProcedure retrieveServicingOrderProcedureResponseServicingOrderProcedure = (RetrieveServicingOrderProcedureResponseServicingOrderProcedure) o;
    return Objects.equals(this.thirdPartyReference, retrieveServicingOrderProcedureResponseServicingOrderProcedure.thirdPartyReference) &&
        Objects.equals(this.thirdPartyServicingMandateReference, retrieveServicingOrderProcedureResponseServicingOrderProcedure.thirdPartyServicingMandateReference) &&
        Objects.equals(this.customerReference, retrieveServicingOrderProcedureResponseServicingOrderProcedure.customerReference) &&
        Objects.equals(this.customerEligibilityAssessmentInstanceReference, retrieveServicingOrderProcedureResponseServicingOrderProcedure.customerEligibilityAssessmentInstanceReference) &&
        Objects.equals(this.servicingOrderType, retrieveServicingOrderProcedureResponseServicingOrderProcedure.servicingOrderType) &&
        Objects.equals(this.servicingOrderTaskRecord, retrieveServicingOrderProcedureResponseServicingOrderProcedure.servicingOrderTaskRecord) &&
        Objects.equals(this.servicingOrderDescription, retrieveServicingOrderProcedureResponseServicingOrderProcedure.servicingOrderDescription) &&
        Objects.equals(this.employeeOrBusinessUnitReference, retrieveServicingOrderProcedureResponseServicingOrderProcedure.employeeOrBusinessUnitReference) &&
        Objects.equals(this.servicingOrderWorkProduct, retrieveServicingOrderProcedureResponseServicingOrderProcedure.servicingOrderWorkProduct) &&
        Objects.equals(this.servicingOrderWorkTaskResult, retrieveServicingOrderProcedureResponseServicingOrderProcedure.servicingOrderWorkTaskResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thirdPartyReference, thirdPartyServicingMandateReference, customerReference, customerEligibilityAssessmentInstanceReference, servicingOrderType, servicingOrderTaskRecord, servicingOrderDescription, employeeOrBusinessUnitReference, servicingOrderWorkProduct, servicingOrderWorkTaskResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveServicingOrderProcedureResponseServicingOrderProcedure {\n");
    
    sb.append("    thirdPartyReference: ").append(toIndentedString(thirdPartyReference)).append("\n");
    sb.append("    thirdPartyServicingMandateReference: ").append(toIndentedString(thirdPartyServicingMandateReference)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    customerEligibilityAssessmentInstanceReference: ").append(toIndentedString(customerEligibilityAssessmentInstanceReference)).append("\n");
    sb.append("    servicingOrderType: ").append(toIndentedString(servicingOrderType)).append("\n");
    sb.append("    servicingOrderTaskRecord: ").append(toIndentedString(servicingOrderTaskRecord)).append("\n");
    sb.append("    servicingOrderDescription: ").append(toIndentedString(servicingOrderDescription)).append("\n");
    sb.append("    employeeOrBusinessUnitReference: ").append(toIndentedString(employeeOrBusinessUnitReference)).append("\n");
    sb.append("    servicingOrderWorkProduct: ").append(toIndentedString(servicingOrderWorkProduct)).append("\n");
    sb.append("    servicingOrderWorkTaskResult: ").append(toIndentedString(servicingOrderWorkTaskResult)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

