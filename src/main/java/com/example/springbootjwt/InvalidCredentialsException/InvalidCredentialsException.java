package com.example.springbootjwt.InvalidCredentialsException;

import com.example.springbootjwt.auth.ErrorCodeEnum;
import com.example.springbootjwt.auth.ServerErrorResponseDto;
import org.springframework.http.HttpStatus;

import javax.ws.rs.InternalServerErrorException;

public class InvalidCredentialsException extends InternalServerErrorException
{
    public InvalidCredentialsException() {

        super(new ServerErrorResponseDto("User not found", ErrorCodeEnum.USER_NOT_FOUND, HttpStatus.NOT_FOUND),
                HttpStatus.NOT_FOUND);

    }
}
