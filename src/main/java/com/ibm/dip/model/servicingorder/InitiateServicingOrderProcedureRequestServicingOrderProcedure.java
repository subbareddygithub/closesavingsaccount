package com.ibm.dip.model.servicingorder;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateServicingOrderProcedureRequestServicingOrderProcedure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T05:14:10.696Z[GMT]")

public class InitiateServicingOrderProcedureRequestServicingOrderProcedure   {
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

  @JsonProperty("EmployeeOrBusinessUnitReference")
  private Object employeeOrBusinessUnitReference;

  public InitiateServicingOrderProcedureRequestServicingOrderProcedure thirdPartyReference(Object thirdPartyReference) {
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

  public InitiateServicingOrderProcedureRequestServicingOrderProcedure thirdPartyServicingMandateReference(Object thirdPartyServicingMandateReference) {
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

  public InitiateServicingOrderProcedureRequestServicingOrderProcedure customerReference(Object customerReference) {
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

  public InitiateServicingOrderProcedureRequestServicingOrderProcedure customerEligibilityAssessmentInstanceReference(Object customerEligibilityAssessmentInstanceReference) {
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

  public InitiateServicingOrderProcedureRequestServicingOrderProcedure servicingOrderType(String servicingOrderType) {
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

  public InitiateServicingOrderProcedureRequestServicingOrderProcedure servicingOrderTaskRecord(String servicingOrderTaskRecord) {
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

  public InitiateServicingOrderProcedureRequestServicingOrderProcedure employeeOrBusinessUnitReference(Object employeeOrBusinessUnitReference) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateServicingOrderProcedureRequestServicingOrderProcedure initiateServicingOrderProcedureRequestServicingOrderProcedure = (InitiateServicingOrderProcedureRequestServicingOrderProcedure) o;
    return Objects.equals(this.thirdPartyReference, initiateServicingOrderProcedureRequestServicingOrderProcedure.thirdPartyReference) &&
        Objects.equals(this.thirdPartyServicingMandateReference, initiateServicingOrderProcedureRequestServicingOrderProcedure.thirdPartyServicingMandateReference) &&
        Objects.equals(this.customerReference, initiateServicingOrderProcedureRequestServicingOrderProcedure.customerReference) &&
        Objects.equals(this.customerEligibilityAssessmentInstanceReference, initiateServicingOrderProcedureRequestServicingOrderProcedure.customerEligibilityAssessmentInstanceReference) &&
        Objects.equals(this.servicingOrderType, initiateServicingOrderProcedureRequestServicingOrderProcedure.servicingOrderType) &&
        Objects.equals(this.servicingOrderTaskRecord, initiateServicingOrderProcedureRequestServicingOrderProcedure.servicingOrderTaskRecord) &&
        Objects.equals(this.employeeOrBusinessUnitReference, initiateServicingOrderProcedureRequestServicingOrderProcedure.employeeOrBusinessUnitReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thirdPartyReference, thirdPartyServicingMandateReference, customerReference, customerEligibilityAssessmentInstanceReference, servicingOrderType, servicingOrderTaskRecord, employeeOrBusinessUnitReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateServicingOrderProcedureRequestServicingOrderProcedure {\n");
    
    sb.append("    thirdPartyReference: ").append(toIndentedString(thirdPartyReference)).append("\n");
    sb.append("    thirdPartyServicingMandateReference: ").append(toIndentedString(thirdPartyServicingMandateReference)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    customerEligibilityAssessmentInstanceReference: ").append(toIndentedString(customerEligibilityAssessmentInstanceReference)).append("\n");
    sb.append("    servicingOrderType: ").append(toIndentedString(servicingOrderType)).append("\n");
    sb.append("    servicingOrderTaskRecord: ").append(toIndentedString(servicingOrderTaskRecord)).append("\n");
    sb.append("    employeeOrBusinessUnitReference: ").append(toIndentedString(employeeOrBusinessUnitReference)).append("\n");
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

