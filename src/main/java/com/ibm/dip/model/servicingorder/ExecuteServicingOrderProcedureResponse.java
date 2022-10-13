package com.ibm.dip.model.servicingorder;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.servicingorder.InitiateServicingOrderProcedureResponseServicingOrderProcedure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecuteServicingOrderProcedureResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T05:14:10.696Z[GMT]")

public class ExecuteServicingOrderProcedureResponse   {
  @JsonProperty("ServicingOrderProcedure")
  private InitiateServicingOrderProcedureResponseServicingOrderProcedure servicingOrderProcedure;

  public ExecuteServicingOrderProcedureResponse servicingOrderProcedure(InitiateServicingOrderProcedureResponseServicingOrderProcedure servicingOrderProcedure) {
    this.servicingOrderProcedure = servicingOrderProcedure;
    return this;
  }

  /**
   * Get servicingOrderProcedure
   * @return servicingOrderProcedure
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateServicingOrderProcedureResponseServicingOrderProcedure getServicingOrderProcedure() {
    return servicingOrderProcedure;
  }

  public void setServicingOrderProcedure(InitiateServicingOrderProcedureResponseServicingOrderProcedure servicingOrderProcedure) {
    this.servicingOrderProcedure = servicingOrderProcedure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteServicingOrderProcedureResponse executeServicingOrderProcedureResponse = (ExecuteServicingOrderProcedureResponse) o;
    return Objects.equals(this.servicingOrderProcedure, executeServicingOrderProcedureResponse.servicingOrderProcedure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servicingOrderProcedure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteServicingOrderProcedureResponse {\n");
    
    sb.append("    servicingOrderProcedure: ").append(toIndentedString(servicingOrderProcedure)).append("\n");
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

