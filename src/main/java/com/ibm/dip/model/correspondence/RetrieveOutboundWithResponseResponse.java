package com.ibm.dip.model.correspondence;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.correspondence.InitiateOutboundRequestCorrespondenceOperatingSession;
import com.ibm.dip.model.correspondence.InitiateOutboundWithResponseRequestOutbound;
import com.ibm.dip.model.correspondence.InitiateOutboundWithResponseRequestOutboundWithResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveOutboundWithResponseResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T05:14:31.601Z[GMT]")

public class RetrieveOutboundWithResponseResponse   {
  @JsonProperty("CorrespondenceOperatingSession")
  private InitiateOutboundRequestCorrespondenceOperatingSession correspondenceOperatingSession;

  @JsonProperty("Outbound")
  private InitiateOutboundWithResponseRequestOutbound outbound;

  @JsonProperty("OutboundWithResponse")
  private InitiateOutboundWithResponseRequestOutboundWithResponse outboundWithResponse;

  public RetrieveOutboundWithResponseResponse correspondenceOperatingSession(InitiateOutboundRequestCorrespondenceOperatingSession correspondenceOperatingSession) {
    this.correspondenceOperatingSession = correspondenceOperatingSession;
    return this;
  }

  /**
   * Get correspondenceOperatingSession
   * @return correspondenceOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateOutboundRequestCorrespondenceOperatingSession getCorrespondenceOperatingSession() {
    return correspondenceOperatingSession;
  }

  public void setCorrespondenceOperatingSession(InitiateOutboundRequestCorrespondenceOperatingSession correspondenceOperatingSession) {
    this.correspondenceOperatingSession = correspondenceOperatingSession;
  }

  public RetrieveOutboundWithResponseResponse outbound(InitiateOutboundWithResponseRequestOutbound outbound) {
    this.outbound = outbound;
    return this;
  }

  /**
   * Get outbound
   * @return outbound
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateOutboundWithResponseRequestOutbound getOutbound() {
    return outbound;
  }

  public void setOutbound(InitiateOutboundWithResponseRequestOutbound outbound) {
    this.outbound = outbound;
  }

  public RetrieveOutboundWithResponseResponse outboundWithResponse(InitiateOutboundWithResponseRequestOutboundWithResponse outboundWithResponse) {
    this.outboundWithResponse = outboundWithResponse;
    return this;
  }

  /**
   * Get outboundWithResponse
   * @return outboundWithResponse
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateOutboundWithResponseRequestOutboundWithResponse getOutboundWithResponse() {
    return outboundWithResponse;
  }

  public void setOutboundWithResponse(InitiateOutboundWithResponseRequestOutboundWithResponse outboundWithResponse) {
    this.outboundWithResponse = outboundWithResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveOutboundWithResponseResponse retrieveOutboundWithResponseResponse = (RetrieveOutboundWithResponseResponse) o;
    return Objects.equals(this.correspondenceOperatingSession, retrieveOutboundWithResponseResponse.correspondenceOperatingSession) &&
        Objects.equals(this.outbound, retrieveOutboundWithResponseResponse.outbound) &&
        Objects.equals(this.outboundWithResponse, retrieveOutboundWithResponseResponse.outboundWithResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correspondenceOperatingSession, outbound, outboundWithResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveOutboundWithResponseResponse {\n");
    
    sb.append("    correspondenceOperatingSession: ").append(toIndentedString(correspondenceOperatingSession)).append("\n");
    sb.append("    outbound: ").append(toIndentedString(outbound)).append("\n");
    sb.append("    outboundWithResponse: ").append(toIndentedString(outboundWithResponse)).append("\n");
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

