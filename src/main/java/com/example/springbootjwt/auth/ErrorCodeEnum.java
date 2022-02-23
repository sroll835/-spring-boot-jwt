package com.example.springbootjwt.auth;

public enum ErrorCodeEnum {
    USER_NOT_FOUND,
    USER_WITH_EMAIL_ALREADY_EXISTS,
    EXPIRED_TOKEN,
    INVALID_USER_CREDENTIALS
}
