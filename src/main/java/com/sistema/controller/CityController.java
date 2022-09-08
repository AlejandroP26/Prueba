package com.sistema.controller;

import com.sistema.dto.CityDTO;
import com.sistema.dto.UserDTO;
import com.sistema.entities.City;
import com.sistema.services.CityServices;
import com.sistema.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/city")
public class CityController {

    @Autowired
    private CityServices cityServices;

    ///////////////////////////////////////Listar Users/////////////////////////////
    @GetMapping
    public List<CityDTO> listCity(){
        return cityServices.getCity();
    }
}
