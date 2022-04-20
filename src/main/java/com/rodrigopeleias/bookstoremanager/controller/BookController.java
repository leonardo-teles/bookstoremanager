package com.rodrigopeleias.bookstoremanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping(value = "/api/v1/books")
public class BookController {

	@GetMapping
	@Operation(description = "Return a hello world example")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Success method returned")
	})
	public String hello() {
		return "Hello Bookstore Manager";
	}
}
