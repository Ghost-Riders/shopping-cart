package com.shopping.cart.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandlerController {

	@ExceptionHandler
	public String errorMapping(NumberFormatException ex) {
		return "error";
	}
}
