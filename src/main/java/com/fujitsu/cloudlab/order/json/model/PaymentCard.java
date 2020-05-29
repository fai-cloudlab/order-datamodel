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
 * Payment Card represents a card used to access funds that may be used to make purchases.
 */
@ApiModel(description = "Payment Card represents a card used to access funds that may be used to make purchases.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-29T11:07:08.442-05:00")

public class PaymentCard   {
  @JsonProperty("cardHolderName")
  private String cardHolderName = null;

  @JsonProperty("expirationMonth")
  private String expirationMonth = null;

  @JsonProperty("expirationYear")
  private String expirationYear = null;

  @JsonProperty("cvv")
  private String cvv = null;

  @JsonProperty("cardNetworkCode")
  private String cardNetworkCode = null;

  @JsonProperty("cardNum")
  private String cardNum = null;

  public PaymentCard cardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
    return this;
  }

  /**
   * Name of the card holder
   * @return cardHolderName
  **/
  @ApiModelProperty(value = "Name of the card holder")


  public String getCardHolderName() {
    return cardHolderName;
  }

  public void setCardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
  }

  public PaymentCard expirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
    return this;
  }

  /**
   * Expiration Month Number is the numeric month that a payment card expires.  Example:  MM, 07
   * @return expirationMonth
  **/
  @ApiModelProperty(value = "Expiration Month Number is the numeric month that a payment card expires.  Example:  MM, 07")


  public String getExpirationMonth() {
    return expirationMonth;
  }

  public void setExpirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
  }

  public PaymentCard expirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
    return this;
  }

  /**
   * Expiration Year Number is the numeric year that a payment card expires.  Example:  YY, 20
   * @return expirationYear
  **/
  @ApiModelProperty(value = "Expiration Year Number is the numeric year that a payment card expires.  Example:  YY, 20")


  public String getExpirationYear() {
    return expirationYear;
  }

  public void setExpirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
  }

  public PaymentCard cvv(String cvv) {
    this.cvv = cvv;
    return this;
  }

  /**
   * The Card Verification Value (CVV) is the number on the credit card ordebit card is a 3 digit number on VISA, MasterCard and Discover branded credit and debitcards. On an American Express branded credit or debit card it is a 4 digit numeric code.
   * @return cvv
  **/
  @ApiModelProperty(value = "The Card Verification Value (CVV) is the number on the credit card ordebit card is a 3 digit number on VISA, MasterCard and Discover branded credit and debitcards. On an American Express branded credit or debit card it is a 4 digit numeric code.")


  public String getCvv() {
    return cvv;
  }

  public void setCvv(String cvv) {
    this.cvv = cvv;
  }

  public PaymentCard cardNetworkCode(String cardNetworkCode) {
    this.cardNetworkCode = cardNetworkCode;
    return this;
  }

  /**
   * Payment Card Network Code is the identifier for the network of a payment card. This is also known as brand.  Examples:  VI, MC, UATP
   * @return cardNetworkCode
  **/
  @ApiModelProperty(value = "Payment Card Network Code is the identifier for the network of a payment card. This is also known as brand.  Examples:  VI, MC, UATP")


  public String getCardNetworkCode() {
    return cardNetworkCode;
  }

  public void setCardNetworkCode(String cardNetworkCode) {
    this.cardNetworkCode = cardNetworkCode;
  }

  public PaymentCard cardNum(String cardNum) {
    this.cardNum = cardNum;
    return this;
  }

  /**
   * Payment Card Number is the number found on payment cards, such as credit cards and debit cards, as well as gift cards and other similar cards.
   * @return cardNum
  **/
  @ApiModelProperty(value = "Payment Card Number is the number found on payment cards, such as credit cards and debit cards, as well as gift cards and other similar cards.")


  public String getCardNum() {
    return cardNum;
  }

  public void setCardNum(String cardNum) {
    this.cardNum = cardNum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentCard paymentCard = (PaymentCard) o;
    return Objects.equals(this.cardHolderName, paymentCard.cardHolderName) &&
        Objects.equals(this.expirationMonth, paymentCard.expirationMonth) &&
        Objects.equals(this.expirationYear, paymentCard.expirationYear) &&
        Objects.equals(this.cvv, paymentCard.cvv) &&
        Objects.equals(this.cardNetworkCode, paymentCard.cardNetworkCode) &&
        Objects.equals(this.cardNum, paymentCard.cardNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardHolderName, expirationMonth, expirationYear, cvv, cardNetworkCode, cardNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCard {\n");
    
    sb.append("    cardHolderName: ").append(toIndentedString(cardHolderName)).append("\n");
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    sb.append("    cvv: ").append(toIndentedString(cvv)).append("\n");
    sb.append("    cardNetworkCode: ").append(toIndentedString(cardNetworkCode)).append("\n");
    sb.append("    cardNum: ").append(toIndentedString(cardNum)).append("\n");
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

