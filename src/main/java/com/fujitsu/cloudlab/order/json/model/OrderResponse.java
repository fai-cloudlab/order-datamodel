package com.fujitsu.cloudlab.order.json.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fujitsu.cloudlab.order.json.model.Customer;
import com.fujitsu.cloudlab.order.json.model.FormOfPayment;
import com.fujitsu.cloudlab.order.json.model.PointOfSale;
import com.fujitsu.cloudlab.order.json.model.Product;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrderResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-29T11:07:08.442-05:00")

public class OrderResponse   {
  @JsonProperty("orderId")
  private String orderId = null;

  @JsonProperty("orderStatus")
  private String orderStatus = null;

  @JsonProperty("orderCreationUtcTs")
  private String orderCreationUtcTs = null;

  @JsonProperty("orderDeletedUtcTs")
  private String orderDeletedUtcTs = null;

  @JsonProperty("pointOfSale")
  private PointOfSale pointOfSale = null;

  @JsonProperty("customer")
  private Customer customer = null;

  @JsonProperty("formOfPayment")
  private FormOfPayment formOfPayment = null;

  @JsonProperty("products")
  @Valid
  private List<Product> products = null;

  public OrderResponse orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Order Identifier represents a carrier assigned ID which uniquely identifies a specific Order
   * @return orderId
  **/
  @ApiModelProperty(value = "Order Identifier represents a carrier assigned ID which uniquely identifies a specific Order")


  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public OrderResponse orderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    return this;
  }

  /**
   * Order Status represents current status of the Order
   * @return orderStatus
  **/
  @ApiModelProperty(example = "COMPLETED", value = "Order Status represents current status of the Order")


  public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }

  public OrderResponse orderCreationUtcTs(String orderCreationUtcTs) {
    this.orderCreationUtcTs = orderCreationUtcTs;
    return this;
  }

  /**
   * Order Creation UTC Timestamp is the timestamp.
   * @return orderCreationUtcTs
  **/
  @ApiModelProperty(example = "2018-04-17T20:02:28+0500", value = "Order Creation UTC Timestamp is the timestamp.")

@Pattern(regexp="^(\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}[\\+\\-]\\d{4})$") 
  public String getOrderCreationUtcTs() {
    return orderCreationUtcTs;
  }

  public void setOrderCreationUtcTs(String orderCreationUtcTs) {
    this.orderCreationUtcTs = orderCreationUtcTs;
  }

  public OrderResponse orderDeletedUtcTs(String orderDeletedUtcTs) {
    this.orderDeletedUtcTs = orderDeletedUtcTs;
    return this;
  }

  /**
   * Order Deleted UTC Timestamp is the timestamp.
   * @return orderDeletedUtcTs
  **/
  @ApiModelProperty(example = "2018-04-17T20:02:28+0500", value = "Order Deleted UTC Timestamp is the timestamp.")

@Pattern(regexp="^(\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}[\\+\\-]\\d{4})$") 
  public String getOrderDeletedUtcTs() {
    return orderDeletedUtcTs;
  }

  public void setOrderDeletedUtcTs(String orderDeletedUtcTs) {
    this.orderDeletedUtcTs = orderDeletedUtcTs;
  }

  public OrderResponse pointOfSale(PointOfSale pointOfSale) {
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

  public OrderResponse customer(Customer customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Customers represents an array of Customer.
   * @return customer
  **/
  @ApiModelProperty(value = "Customers represents an array of Customer.")

  @Valid

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public OrderResponse formOfPayment(FormOfPayment formOfPayment) {
    this.formOfPayment = formOfPayment;
    return this;
  }

  /**
   * Payment details
   * @return formOfPayment
  **/
  @ApiModelProperty(value = "Payment details")

  @Valid

  public FormOfPayment getFormOfPayment() {
    return formOfPayment;
  }

  public void setFormOfPayment(FormOfPayment formOfPayment) {
    this.formOfPayment = formOfPayment;
  }

  public OrderResponse products(List<Product> products) {
    this.products = products;
    return this;
  }

  public OrderResponse addProductsItem(Product productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<Product>();
    }
    this.products.add(productsItem);
    return this;
  }

  /**
   * Product details
   * @return products
  **/
  @ApiModelProperty(value = "Product details")

  @Valid

  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderResponse orderResponse = (OrderResponse) o;
    return Objects.equals(this.orderId, orderResponse.orderId) &&
        Objects.equals(this.orderStatus, orderResponse.orderStatus) &&
        Objects.equals(this.orderCreationUtcTs, orderResponse.orderCreationUtcTs) &&
        Objects.equals(this.orderDeletedUtcTs, orderResponse.orderDeletedUtcTs) &&
        Objects.equals(this.pointOfSale, orderResponse.pointOfSale) &&
        Objects.equals(this.customer, orderResponse.customer) &&
        Objects.equals(this.formOfPayment, orderResponse.formOfPayment) &&
        Objects.equals(this.products, orderResponse.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, orderStatus, orderCreationUtcTs, orderDeletedUtcTs, pointOfSale, customer, formOfPayment, products);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderResponse {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    orderCreationUtcTs: ").append(toIndentedString(orderCreationUtcTs)).append("\n");
    sb.append("    orderDeletedUtcTs: ").append(toIndentedString(orderDeletedUtcTs)).append("\n");
    sb.append("    pointOfSale: ").append(toIndentedString(pointOfSale)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    formOfPayment: ").append(toIndentedString(formOfPayment)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
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

