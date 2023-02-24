package com.nv.foodapp.util;

import org.springframework.stereotype.Component;

import com.nv.foodapp.dto.BillDTO;
import com.nv.foodapp.entity.Bill;
@Component
public class BillDTOConvertor {
	
	public BillDTO getBillDTO(Bill b) {
		BillDTO obj= new BillDTO(b.getBillId(),b.getItemCount(),b.getGrossBillAmount(),b.getGrossBillAmount());
		 return obj;
	}

}
