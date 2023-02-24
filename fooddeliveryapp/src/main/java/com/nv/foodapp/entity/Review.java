package com.nv.foodapp.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity 
public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private LocalDateTime time_stamp;
	private int restaurantId;
	private String customerName;
	private String itemName;
	private String message;
	private int starRating;
	
	public Review(LocalDateTime time_stamp,int restaurantId, String message, String itemName, String customerName, 
			int starRating) {
		super();
		this.time_stamp = time_stamp;
		this.restaurantId = restaurantId;
		this.customerName = customerName;
		this.itemName = itemName;
		this.message = message;
		this.starRating = starRating;
	}
	
	
	

}
