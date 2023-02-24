package com.nv.foodapp.util;

import org.springframework.stereotype.Component;

import com.nv.foodapp.dto.ItemDTO;
import com.nv.foodapp.entity.Item;

@Component
public class ItemDTOConvertor {
	
	public ItemDTO getItemDTO(Item i) {
		
		ItemDTO obj= new ItemDTO(i.getItemId(),i.getItemName(),i.getCategory());
		return obj;
	}
	


}
