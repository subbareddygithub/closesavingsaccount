package com.ibm.dip.model.correspondence;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateBlockMailingRequestBlockMailing
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T05:14:31.601Z[GMT]")

public class InitiateBlockMailingRequestBlockMailing   {
  @JsonProperty("BlockmailingRecord")
  private String blockmailingRecord;

  public InitiateBlockMailingRequestBlockMailing blockmailingRecord(String blockmailingRecord) {
    this.blockmailingRecord = blockmailingRecord;
    return this;
  }

  /**
   * Get blockmailingRecord
   * @return blockmailingRecord
  */
  @ApiModelProperty(value = "")


  public String getBlockmailingRecord() {
    return blockmailingRecord;
  }

  public void setBlockmailingRecord(String blockmailingRecord) {
    this.blockmailingRecord = blockmailingRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateBlockMailingRequestBlockMailing initiateBlockMailingRequestBlockMailing = (InitiateBlockMailingRequestBlockMailing) o;
    return Objects.equals(this.blockmailingRecord, initiateBlockMailingRequestBlockMailing.blockmailingRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockmailingRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateBlockMailingRequestBlockMailing {\n");
    
    sb.append("    blockmailingRecord: ").append(toIndentedString(blockmailingRecord)).append("\n");
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

