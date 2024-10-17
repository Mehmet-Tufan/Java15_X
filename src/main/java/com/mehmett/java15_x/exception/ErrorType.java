package com.mehmett.java15_x.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
@Getter
@AllArgsConstructor
public enum ErrorType {
	INTERNAL_SERVER_ERROR(5000,"Sunucu hata.",HttpStatus.INTERNAL_SERVER_ERROR),
	VALIDATION_ERROR(4000,"Parametrelerinizi kontrol ediniz.",HttpStatus.BAD_REQUEST),
	FOLLOW_USERID_FOLLOWINGID_NOTFOUND(5001,"user id ve following id yanlış girilmiştir.",HttpStatus.BAD_REQUEST);
	
	int code;
	String message;
	HttpStatus httpStatus;
}