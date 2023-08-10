package com.itqiankun.cache.redis.entity;

/**
 * @author: ma_qiankun
 * @date: 2023/8/9
 **/
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Date;

@Data
@AllArgsConstructor
public class Order {
	private String orderId;
	private String customerName;
	private Date orderDate;
	private double totalAmount;

	// Main method for testing

	public static void main(String[] args) {
		// Creating a new Order object using lombok
		Order order = new Order("1001", "John Doe", new Date(), 99.99);

		// Printing order details
		System.out.println(order.toString());
	}
}
