package com.sistema.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    private static long serialVersionUID = 1L;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private String cuidad;
    private String organizacion;



    public ResourceNotFoundException(String user, String id, long l) {
    }

    public ResourceNotFoundException(String name, String lastName, String email, String password, String cuidad, String organizacion ) {
        super(String.format("%s no encontrada con: %s : '%s'",name,lastName,email,password,cuidad,organizacion));
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.cuidad = cuidad;
        this.cuidad = organizacion;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }

    public String getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }
}
