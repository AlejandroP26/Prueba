package com.sistema.services;

import com.sistema.dto.CityDTO;
import com.sistema.repository.CityRepository;
import com.sistema.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServicesImpl implements CityServices{

    @Autowired
    private CityRepository cityRepository;
    @Override
    public List<CityDTO> getCity() {
        return null;
    }
}
