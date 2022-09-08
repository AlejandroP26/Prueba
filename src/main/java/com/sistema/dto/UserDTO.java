package com.sistema.dto;

public class UserDTO {
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private String cuidad;
    private String organizacion;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public  String getName() { return name; }

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

    public UserDTO() {
        super();
    }
}