package com.mehmett.java15_x.exception;

import lombok.Getter;
@Getter
public class java1XExeption extends RuntimeException {
	private ErrorType errorType;

	public java1XExeption(ErrorType errorType) {
		super(errorType.getMessage());
		this.errorType = errorType;
	}

}