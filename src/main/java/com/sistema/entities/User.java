package com.sistema.entities;

import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Table(name = "user", uniqueConstraints = {@UniqueConstraint(columnNames = {"user"})})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name="name", nullable= false)
    private String name;

    @Column(name="lastName", nullable= false)
    private String lastName;

    @Column(name="email", nullable= false)
    private String email;

    @Column(name="password", nullable= false)
    private String password;

    @Column(name="cuidad", nullable= false)
    private String cuidad;

    @Column(name="organizacion", nullable= false)
    private String organizacion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public User() {
        super();
    }

    public User(Long id, String name, String lastName, String email, String password, String cuidad, String organizacion) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.cuidad = cuidad;
        this.organizacion = organizacion;
    }
}
