package com.ruan.aprendendospring.infraestructure.Exceptions;

public class ConflictException extends RuntimeException{

    public ConflictException(String mensagem){
        super(mensagem);
    }

    public ConflictException(String mensagem, Throwable thowable){
        super(mensagem);
    }
}
