package com.fujitsu.cloudlab.order.orm.model.entity;

import java.util.Date;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(value = "order_data")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderData {
	
	  @PrimaryKey(value = "order_id")
	  private String orderId;
	  
	  @Column(value = "order_creation_utc_ts")
	  private Date orderCreationUtcTs;

	  @Column(value = "order_deleted_utc_ts")
	  private Date orderDeletedUtcTs;

	  @Column(value = "order_data")
	  private String orderData;

	  @Column(value = "order_total_price")
	  private String orderTotalPrice;

	  @Column(value = "currency_code")
	  private String currencyCode;

	  @Column(value = "order_status")
	  private String orderStatus;

	  @Column(value = "transaction_id")
	  private String transactionId;

	  @Column(value = "product_category_id")
	  private String productCategoryId;
	} 