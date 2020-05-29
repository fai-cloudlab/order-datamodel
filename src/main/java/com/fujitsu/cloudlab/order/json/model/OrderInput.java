package com.fujitsu.cloudlab.order.json.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fujitsu.cloudlab.order.json.model.Customer;
import com.fujitsu.cloudlab.order.json.model.FormOfPayment;
import com.fujitsu.cloudlab.order.json.model.Offer;
import com.fujitsu.cloudlab.order.json.model.PointOfSale;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Order Input represents the data sent by the consumer to create an order.
 */
@ApiModel(description = "Order Input represents the data sent by the consumer to create an order.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-29T11:07:08.442-05:00")

public class OrderInput   {
  @JsonProperty("pointOfSale")
  private PointOfSale pointOfSale = null;

  @JsonProperty("selectedOffers")
  @Valid
  private List<Offer> selectedOffers = new ArrayList<Offer>();

  @JsonProperty("formOfPayment")
  private FormOfPayment formOfPayment = null;

  @JsonProperty("customer")
  private Customer customer = null;

  public OrderInput pointOfSale(PointOfSale pointOfSale) {
    this.pointOfSale = pointOfSale;
    return this;
  }

  /**
   * Get pointOfSale
   * @return pointOfSale
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PointOfSale getPointOfSale() {
    return pointOfSale;
  }

  public void setPointOfSale(PointOfSale pointOfSale) {
    this.pointOfSale = pointOfSale;
  }

  public OrderInput selectedOffers(List<Offer> selectedOffers) {
    this.selectedOffers = selectedOffers;
    return this;
  }

  public OrderInput addSelectedOffersItem(Offer selectedOffersItem) {
    this.selectedOffers.add(selectedOffersItem);
    return this;
  }

  /**
   * Selected Offer represents an array of  Selected Offer.. OfferId/OfferItems and CartId/CartItems are mutually exclusive.
   * @return selectedOffers
  **/
  @ApiModelProperty(required = true, value = "Selected Offer represents an array of  Selected Offer.. OfferId/OfferItems and CartId/CartItems are mutually exclusive.")
  @NotNull

  @Valid

  public List<Offer> getSelectedOffers() {
    return selectedOffers;
  }

  public void setSelectedOffers(List<Offer> selectedOffers) {
    this.selectedOffers = selectedOffers;
  }

  public OrderInput formOfPayment(FormOfPayment formOfPayment) {
    this.formOfPayment = formOfPayment;
    return this;
  }

  /**
   * Form Of Payments represents Payment details
   * @return formOfPayment
  **/
  @ApiModelProperty(value = "Form Of Payments represents Payment details")

  @Valid

  public FormOfPayment getFormOfPayment() {
    return formOfPayment;
  }

  public void setFormOfPayment(FormOfPayment formOfPayment) {
    this.formOfPayment = formOfPayment;
  }

  public OrderInput customer(Customer customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Customers represents an array of Customer
   * @return customer
  **/
  @ApiModelProperty(value = "Customers represents an array of Customer")

  @Valid

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderInput orderInput = (OrderInput) o;
    return Objects.equals(this.pointOfSale, orderInput.pointOfSale) &&
        Objects.equals(this.selectedOffers, orderInput.selectedOffers) &&
        Objects.equals(this.formOfPayment, orderInput.formOfPayment) &&
        Objects.equals(this.customer, orderInput.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointOfSale, selectedOffers, formOfPayment, customer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderInput {\n");
    
    sb.append("    pointOfSale: ").append(toIndentedString(pointOfSale)).append("\n");
    sb.append("    selectedOffers: ").append(toIndentedString(selectedOffers)).append("\n");
    sb.append("    formOfPayment: ").append(toIndentedString(formOfPayment)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
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

