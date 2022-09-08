package com.sistema.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundExceptionCity extends RuntimeException{

    private static long serialVersionUID = 1L;

    private String name;
    private String pais;

    public ResourceNotFoundExceptionCity(String city, String id_City, long l) {
    }

    public ResourceNotFoundExceptionCity(String name, String pais) {
        super(String.format("%s no encontrada con: %s : '%s'",name,pais));
        this.name = name;
        this.pais = pais;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }



}
