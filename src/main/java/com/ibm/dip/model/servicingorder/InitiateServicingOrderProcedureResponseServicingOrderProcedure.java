package com.ibm.dip.model.servicingorder;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateServicingOrderProcedureResponseServicingOrderProcedure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T05:14:10.696Z[GMT]")

public class InitiateServicingOrderProcedureResponseServicingOrderProcedure   {
  @JsonProperty("ServicingOrderTaskRecord")
  private String servicingOrderTaskRecord;

  @JsonProperty("ServicingOrderDescription")
  private String servicingOrderDescription;

  @JsonProperty("ServicingOrderWorkProduct")
  private String servicingOrderWorkProduct;

  @JsonProperty("ServicingOrderWorkTaskResult")
  private String servicingOrderWorkTaskResult;

  public InitiateServicingOrderProcedureResponseServicingOrderProcedure servicingOrderTaskRecord(String servicingOrderTaskRecord) {
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

  public InitiateServicingOrderProcedureResponseServicingOrderProcedure servicingOrderDescription(String servicingOrderDescription) {
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

  public InitiateServicingOrderProcedureResponseServicingOrderProcedure servicingOrderWorkProduct(String servicingOrderWorkProduct) {
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

  public InitiateServicingOrderProcedureResponseServicingOrderProcedure servicingOrderWorkTaskResult(String servicingOrderWorkTaskResult) {
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
    InitiateServicingOrderProcedureResponseServicingOrderProcedure initiateServicingOrderProcedureResponseServicingOrderProcedure = (InitiateServicingOrderProcedureResponseServicingOrderProcedure) o;
    return Objects.equals(this.servicingOrderTaskRecord, initiateServicingOrderProcedureResponseServicingOrderProcedure.servicingOrderTaskRecord) &&
        Objects.equals(this.servicingOrderDescription, initiateServicingOrderProcedureResponseServicingOrderProcedure.servicingOrderDescription) &&
        Objects.equals(this.servicingOrderWorkProduct, initiateServicingOrderProcedureResponseServicingOrderProcedure.servicingOrderWorkProduct) &&
        Objects.equals(this.servicingOrderWorkTaskResult, initiateServicingOrderProcedureResponseServicingOrderProcedure.servicingOrderWorkTaskResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servicingOrderTaskRecord, servicingOrderDescription, servicingOrderWorkProduct, servicingOrderWorkTaskResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateServicingOrderProcedureResponseServicingOrderProcedure {\n");
    
    sb.append("    servicingOrderTaskRecord: ").append(toIndentedString(servicingOrderTaskRecord)).append("\n");
    sb.append("    servicingOrderDescription: ").append(toIndentedString(servicingOrderDescription)).append("\n");
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

