package com.nv.foodapp.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int billId;
	private int itemCount;
	private int grossBillAmount;
	private int gstAmount;

	//@OneToOne(cascade = CascadeType.ALL)
	//private Restaurant restaurant;

	public Bill(int itemCount, int grossBillAmount, int gstAmount) {
		super();
		this.itemCount = itemCount;
		this.grossBillAmount = grossBillAmount;
		this.gstAmount = gstAmount;
	}

	

	
	
	
	
}
