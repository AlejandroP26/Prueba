package com.sistema.dto;

public class CityDTO {

    private Long id_City;
    private String name;
    private String pais;

    public Long getId() {
        return id_City;
    }

    public void setId(Long id) {
        this.id_City = id_City;
    }

    public  String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return pais;
    }

    public void setLastName(String lastName) {
        this.pais = pais;
    }

    public CityDTO() {
        super();
    }

}
