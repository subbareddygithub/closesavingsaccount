package com.ibm.dip.model.issueddeviceadministration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdatePasswordAssignmentRequestPasswordAssignment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T05:14:17.804Z[GMT]")

public class UpdatePasswordAssignmentRequestPasswordAssignment   {
  @JsonProperty("PasswordValue")
  private String passwordValue;

  @JsonProperty("UsageLog")
  private String usageLog;

  public UpdatePasswordAssignmentRequestPasswordAssignment passwordValue(String passwordValue) {
    this.passwordValue = passwordValue;
    return this;
  }

  /**
   * Get passwordValue
   * @return passwordValue
  */
  @ApiModelProperty(value = "")


  public String getPasswordValue() {
    return passwordValue;
  }

  public void setPasswordValue(String passwordValue) {
    this.passwordValue = passwordValue;
  }

  public UpdatePasswordAssignmentRequestPasswordAssignment usageLog(String usageLog) {
    this.usageLog = usageLog;
    return this;
  }

  /**
   * Get usageLog
   * @return usageLog
  */
  @ApiModelProperty(value = "")


  public String getUsageLog() {
    return usageLog;
  }

  public void setUsageLog(String usageLog) {
    this.usageLog = usageLog;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePasswordAssignmentRequestPasswordAssignment updatePasswordAssignmentRequestPasswordAssignment = (UpdatePasswordAssignmentRequestPasswordAssignment) o;
    return Objects.equals(this.passwordValue, updatePasswordAssignmentRequestPasswordAssignment.passwordValue) &&
        Objects.equals(this.usageLog, updatePasswordAssignmentRequestPasswordAssignment.usageLog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passwordValue, usageLog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePasswordAssignmentRequestPasswordAssignment {\n");
    
    sb.append("    passwordValue: ").append(toIndentedString(passwordValue)).append("\n");
    sb.append("    usageLog: ").append(toIndentedString(usageLog)).append("\n");
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

