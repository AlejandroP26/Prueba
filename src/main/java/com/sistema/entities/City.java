package com.sistema.entities;

import javax.persistence.*;

@Entity
@Table(name = "City", uniqueConstraints = {@UniqueConstraint(columnNames = {"City"})})
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id_City;

    @Column(name="name", nullable= false)
    private String name;

    @Column(name="pais", nullable= false)
    private String pais;

    public Long getId_City() {
        return id_City;
    }

    public void setId_City(Long id) {
        this.id_City = id_City;
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

    public City() {
        super();
    }

    public City(Long id, String name, String pais){
        this.id_City = id;
        this.name = name;
        this.pais = pais;
    }

}
