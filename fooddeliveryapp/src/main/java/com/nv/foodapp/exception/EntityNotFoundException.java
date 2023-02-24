package com.nv.foodapp.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.nv.foodapp.dto.ExceptionResponseDTO;

public class EntityNotFoundException {
	@ExceptionHandler
	public ResponseEntity<ExceptionResponseDTO> doSomeThings(EntityNotFoundException e)
	{
		ExceptionResponseDTO dto = new ExceptionResponseDTO();
		dto.setErrorMsg(e.toString());
		dto.setDateTime(LocalDateTime.now()+"");
		return new ResponseEntity<ExceptionResponseDTO>(dto,HttpStatus.BAD_REQUEST);
	}
	

}
