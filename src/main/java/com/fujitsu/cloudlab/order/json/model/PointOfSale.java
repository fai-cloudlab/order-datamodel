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
 * Point Of Sale represents certain attributes regarding the point at which the sale of a travel services or ancillary products occur.
 */
@ApiModel(description = "Point Of Sale represents certain attributes regarding the point at which the sale of a travel services or ancillary products occur.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-29T11:07:08.442-05:00")

public class PointOfSale   {
  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("pointOfSaleCityCode")
  private String pointOfSaleCityCode = null;

  @JsonProperty("pointOfSaleId")
  private String pointOfSaleId = null;

  @JsonProperty("ipAddress")
  private String ipAddress = null;

  @JsonProperty("browserType")
  private String browserType = null;

  public PointOfSale countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Country Code specifies a region or territory. Example- US = United States of America (ISO 3166-1 alpha-2 format)
   * @return countryCode
  **/
  @ApiModelProperty(example = "US", value = "Country Code specifies a region or territory. Example- US = United States of America (ISO 3166-1 alpha-2 format)")

@Pattern(regexp="^[A-Z]{2}$") 
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public PointOfSale pointOfSaleCityCode(String pointOfSaleCityCode) {
    this.pointOfSaleCityCode = pointOfSaleCityCode;
    return this;
  }

  /**
   * Point Of Sale City Code represents the municipality or urban area where an entity, authorized to sell transportation and related goods and services on behalf of an airline, is located.
   * @return pointOfSaleCityCode
  **/
  @ApiModelProperty(value = "Point Of Sale City Code represents the municipality or urban area where an entity, authorized to sell transportation and related goods and services on behalf of an airline, is located.")


  public String getPointOfSaleCityCode() {
    return pointOfSaleCityCode;
  }

  public void setPointOfSaleCityCode(String pointOfSaleCityCode) {
    this.pointOfSaleCityCode = pointOfSaleCityCode;
  }

  public PointOfSale pointOfSaleId(String pointOfSaleId) {
    this.pointOfSaleId = pointOfSaleId;
    return this;
  }

  /**
   * Point Of Sale Identifier uniquely identifies an entity which may perform several functions in regards to sales transactions. It may make reservations and/or report sales transactions to a central reporting location and/or issue ticket documents. It may be a travel agency or a BARTS location or some other entity, such as a GSA.
   * @return pointOfSaleId
  **/
  @ApiModelProperty(value = "Point Of Sale Identifier uniquely identifies an entity which may perform several functions in regards to sales transactions. It may make reservations and/or report sales transactions to a central reporting location and/or issue ticket documents. It may be a travel agency or a BARTS location or some other entity, such as a GSA.")


  public String getPointOfSaleId() {
    return pointOfSaleId;
  }

  public void setPointOfSaleId(String pointOfSaleId) {
    this.pointOfSaleId = pointOfSaleId;
  }

  public PointOfSale ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * IP Address Text denotes the ipAddress from where the request got initiated
   * @return ipAddress
  **/
  @ApiModelProperty(value = "IP Address Text denotes the ipAddress from where the request got initiated")


  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public PointOfSale browserType(String browserType) {
    this.browserType = browserType;
    return this;
  }

  /**
   * Browser Type Text denotes the browser used by the consumer from where the request got initiated
   * @return browserType
  **/
  @ApiModelProperty(value = "Browser Type Text denotes the browser used by the consumer from where the request got initiated")


  public String getBrowserType() {
    return browserType;
  }

  public void setBrowserType(String browserType) {
    this.browserType = browserType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointOfSale pointOfSale = (PointOfSale) o;
    return Objects.equals(this.countryCode, pointOfSale.countryCode) &&
        Objects.equals(this.pointOfSaleCityCode, pointOfSale.pointOfSaleCityCode) &&
        Objects.equals(this.pointOfSaleId, pointOfSale.pointOfSaleId) &&
        Objects.equals(this.ipAddress, pointOfSale.ipAddress) &&
        Objects.equals(this.browserType, pointOfSale.browserType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, pointOfSaleCityCode, pointOfSaleId, ipAddress, browserType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointOfSale {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    pointOfSaleCityCode: ").append(toIndentedString(pointOfSaleCityCode)).append("\n");
    sb.append("    pointOfSaleId: ").append(toIndentedString(pointOfSaleId)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    browserType: ").append(toIndentedString(browserType)).append("\n");
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

