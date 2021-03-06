package com.qa.springtest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND,reason="Person not found")
public class PersonNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -3275655122284491258L;

}
