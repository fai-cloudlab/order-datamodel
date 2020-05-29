package com.fujitsu.cloudlab.order.json.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Cash used to indicate payment in cash.
 */
@ApiModel(description = "Cash used to indicate payment in cash.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-29T11:07:08.442-05:00")

public class Cash   {
  @JsonProperty("cashAmt")
  private String cashAmt = null;

  @JsonProperty("terminalId")
  private String terminalId = null;

  @JsonProperty("cashReceiptId")
  private String cashReceiptId = null;

  public Cash cashAmt(String cashAmt) {
    this.cashAmt = cashAmt;
    return this;
  }

  /**
   * Get cashAmt
   * @return cashAmt
  **/
  @ApiModelProperty(value = "")


  public String getCashAmt() {
    return cashAmt;
  }

  public void setCashAmt(String cashAmt) {
    this.cashAmt = cashAmt;
  }

  public Cash terminalId(String terminalId) {
    this.terminalId = terminalId;
    return this;
  }

  /**
   * Terminal identifier is the unique identifier where cash was collected.
   * @return terminalId
  **/
  @ApiModelProperty(value = "Terminal identifier is the unique identifier where cash was collected.")


  public String getTerminalId() {
    return terminalId;
  }

  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }

  public Cash cashReceiptId(String cashReceiptId) {
    this.cashReceiptId = cashReceiptId;
    return this;
  }

  /**
   * Cash Receipt Identifier is the unique identifier for the cash receipt.
   * @return cashReceiptId
  **/
  @ApiModelProperty(example = "121717H47S", value = "Cash Receipt Identifier is the unique identifier for the cash receipt.")


  public String getCashReceiptId() {
    return cashReceiptId;
  }

  public void setCashReceiptId(String cashReceiptId) {
    this.cashReceiptId = cashReceiptId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cash cash = (Cash) o;
    return Objects.equals(this.cashAmt, cash.cashAmt) &&
        Objects.equals(this.terminalId, cash.terminalId) &&
        Objects.equals(this.cashReceiptId, cash.cashReceiptId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cashAmt, terminalId, cashReceiptId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cash {\n");
    
    sb.append("    cashAmt: ").append(toIndentedString(cashAmt)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    sb.append("    cashReceiptId: ").append(toIndentedString(cashReceiptId)).append("\n");
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

