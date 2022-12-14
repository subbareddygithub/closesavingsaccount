package com.ibm.dip.model.correspondence;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.correspondence.ExecuteCorrespondenceOperatingSessionResponseCorrespondenceOperatingSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecuteCorrespondenceOperatingSessionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T05:14:31.601Z[GMT]")

public class ExecuteCorrespondenceOperatingSessionResponse   {
  @JsonProperty("CorrespondenceOperatingSession")
  private ExecuteCorrespondenceOperatingSessionResponseCorrespondenceOperatingSession correspondenceOperatingSession;

  public ExecuteCorrespondenceOperatingSessionResponse correspondenceOperatingSession(ExecuteCorrespondenceOperatingSessionResponseCorrespondenceOperatingSession correspondenceOperatingSession) {
    this.correspondenceOperatingSession = correspondenceOperatingSession;
    return this;
  }

  /**
   * Get correspondenceOperatingSession
   * @return correspondenceOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecuteCorrespondenceOperatingSessionResponseCorrespondenceOperatingSession getCorrespondenceOperatingSession() {
    return correspondenceOperatingSession;
  }

  public void setCorrespondenceOperatingSession(ExecuteCorrespondenceOperatingSessionResponseCorrespondenceOperatingSession correspondenceOperatingSession) {
    this.correspondenceOperatingSession = correspondenceOperatingSession;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteCorrespondenceOperatingSessionResponse executeCorrespondenceOperatingSessionResponse = (ExecuteCorrespondenceOperatingSessionResponse) o;
    return Objects.equals(this.correspondenceOperatingSession, executeCorrespondenceOperatingSessionResponse.correspondenceOperatingSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correspondenceOperatingSession);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteCorrespondenceOperatingSessionResponse {\n");
    
    sb.append("    correspondenceOperatingSession: ").append(toIndentedString(correspondenceOperatingSession)).append("\n");
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

