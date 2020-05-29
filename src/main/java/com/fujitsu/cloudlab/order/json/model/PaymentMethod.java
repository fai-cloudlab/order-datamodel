package com.fujitsu.cloudlab.order.json.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fujitsu.cloudlab.order.json.model.Cash;
import com.fujitsu.cloudlab.order.json.model.PaymentCard;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Payment Method represents a payment object that can be used towards purchasing a product. Ex: Credit Card, RTBT, Paypal, etc
 */
@ApiModel(description = "Payment Method represents a payment object that can be used towards purchasing a product. Ex: Credit Card, RTBT, Paypal, etc")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-29T11:07:08.442-05:00")

public class PaymentMethod   {
  @JsonProperty("paymentMethodType")
  private String paymentMethodType = null;

  @JsonProperty("paymentCard")
  private PaymentCard paymentCard = null;

  @JsonProperty("cash")
  private Cash cash = null;

  public PaymentMethod paymentMethodType(String paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
    return this;
  }

  /**
   * Payment Method Type represents the name of a payment method. Ex: Credit Card, RTBT, Paypal, etc
   * @return paymentMethodType
  **/
  @ApiModelProperty(value = "Payment Method Type represents the name of a payment method. Ex: Credit Card, RTBT, Paypal, etc")


  public String getPaymentMethodType() {
    return paymentMethodType;
  }

  public void setPaymentMethodType(String paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
  }

  public PaymentMethod paymentCard(PaymentCard paymentCard) {
    this.paymentCard = paymentCard;
    return this;
  }

  /**
   * Get paymentCard
   * @return paymentCard
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PaymentCard getPaymentCard() {
    return paymentCard;
  }

  public void setPaymentCard(PaymentCard paymentCard) {
    this.paymentCard = paymentCard;
  }

  public PaymentMethod cash(Cash cash) {
    this.cash = cash;
    return this;
  }

  /**
   * Get cash
   * @return cash
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Cash getCash() {
    return cash;
  }

  public void setCash(Cash cash) {
    this.cash = cash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethod paymentMethod = (PaymentMethod) o;
    return Objects.equals(this.paymentMethodType, paymentMethod.paymentMethodType) &&
        Objects.equals(this.paymentCard, paymentMethod.paymentCard) &&
        Objects.equals(this.cash, paymentMethod.cash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethodType, paymentCard, cash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethod {\n");
    
    sb.append("    paymentMethodType: ").append(toIndentedString(paymentMethodType)).append("\n");
    sb.append("    paymentCard: ").append(toIndentedString(paymentCard)).append("\n");
    sb.append("    cash: ").append(toIndentedString(cash)).append("\n");
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

