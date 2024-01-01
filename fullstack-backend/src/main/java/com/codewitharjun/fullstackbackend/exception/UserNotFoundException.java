package com.codewitharjun.fullstackbackend.exception;

public class UserNotFoundException extends RuntimeException{

public  UserNotFoundException(Long id){
    super("coundnt found user with id"+ id);
}
}
