package com.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class SomethingWentWrong extends Exception {
	public SomethingWentWrong()
	{
		super("Oops Something Went Wrong");
	}

}
