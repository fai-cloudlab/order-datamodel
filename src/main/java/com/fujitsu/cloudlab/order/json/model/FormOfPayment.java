package com.fujitsu.cloudlab.order.json.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fujitsu.cloudlab.order.json.model.PaymentMethod;
import com.fujitsu.cloudlab.order.json.model.Price;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Form of Payment represents a single transaction in which a payment method is being used to authorize for a specific amount
 */
@ApiModel(description = "Form of Payment represents a single transaction in which a payment method is being used to authorize for a specific amount")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-29T11:07:08.442-05:00")

public class FormOfPayment   {
  @JsonProperty("paymentMethod")
  private PaymentMethod paymentMethod = null;

  @JsonProperty("price")
  private Price price = null;

  @JsonProperty("paymentReferenceId")
  private String paymentReferenceId = null;

  public FormOfPayment paymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public FormOfPayment price(Price price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public FormOfPayment paymentReferenceId(String paymentReferenceId) {
    this.paymentReferenceId = paymentReferenceId;
    return this;
  }

  /**
   * Payment Reference Identifier describes an identifier for payment details, which may represent multiple forms of payment
   * @return paymentReferenceId
  **/
  @ApiModelProperty(value = "Payment Reference Identifier describes an identifier for payment details, which may represent multiple forms of payment")


  public String getPaymentReferenceId() {
    return paymentReferenceId;
  }

  public void setPaymentReferenceId(String paymentReferenceId) {
    this.paymentReferenceId = paymentReferenceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormOfPayment formOfPayment = (FormOfPayment) o;
    return Objects.equals(this.paymentMethod, formOfPayment.paymentMethod) &&
        Objects.equals(this.price, formOfPayment.price) &&
        Objects.equals(this.paymentReferenceId, formOfPayment.paymentReferenceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethod, price, paymentReferenceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormOfPayment {\n");
    
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    paymentReferenceId: ").append(toIndentedString(paymentReferenceId)).append("\n");
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

