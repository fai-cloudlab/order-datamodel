package com.fujitsu.cloudlab.order.json.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fujitsu.cloudlab.order.json.model.Product;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Selected Offer are the items for an order. Either offerId or cartId must be present.
 */
@ApiModel(description = "Selected Offer are the items for an order. Either offerId or cartId must be present.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-29T11:07:08.442-05:00")

public class Offer   {
  @JsonProperty("offerId")
  private String offerId = null;

  @JsonProperty("totalOfferAmt")
  private String totalOfferAmt = null;

  @JsonProperty("product")
  @Valid
  private List<Product> product = null;

  @JsonProperty("offerType")
  private String offerType = null;

  public Offer offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * Offer Identifier uniquely identifies an offer.
   * @return offerId
  **/
  @ApiModelProperty(value = "Offer Identifier uniquely identifies an offer.")


  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public Offer totalOfferAmt(String totalOfferAmt) {
    this.totalOfferAmt = totalOfferAmt;
    return this;
  }

  /**
   * Total offer amount in USD.
   * @return totalOfferAmt
  **/
  @ApiModelProperty(value = "Total offer amount in USD.")


  public String getTotalOfferAmt() {
    return totalOfferAmt;
  }

  public void setTotalOfferAmt(String totalOfferAmt) {
    this.totalOfferAmt = totalOfferAmt;
  }

  public Offer product(List<Product> product) {
    this.product = product;
    return this;
  }

  public Offer addProductItem(Product productItem) {
    if (this.product == null) {
      this.product = new ArrayList<Product>();
    }
    this.product.add(productItem);
    return this;
  }

  /**
   * product details
   * @return product
  **/
  @ApiModelProperty(value = "product details")

  @Valid

  public List<Product> getProduct() {
    return product;
  }

  public void setProduct(List<Product> product) {
    this.product = product;
  }

  public Offer offerType(String offerType) {
    this.offerType = offerType;
    return this;
  }

  /**
   * type of the offer.
   * @return offerType
  **/
  @ApiModelProperty(value = "type of the offer.")


  public String getOfferType() {
    return offerType;
  }

  public void setOfferType(String offerType) {
    this.offerType = offerType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Offer offer = (Offer) o;
    return Objects.equals(this.offerId, offer.offerId) &&
        Objects.equals(this.totalOfferAmt, offer.totalOfferAmt) &&
        Objects.equals(this.product, offer.product) &&
        Objects.equals(this.offerType, offer.offerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, totalOfferAmt, product, offerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Offer {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    totalOfferAmt: ").append(toIndentedString(totalOfferAmt)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
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

