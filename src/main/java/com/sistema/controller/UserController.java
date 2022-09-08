package com.sistema.controller;

import com.sistema.dto.UserDTO;
import com.sistema.entities.User;
import com.sistema.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserServices userServices;

    ///////////////////////////////////////Crear User/////////////////////////
    @PostMapping
    public ResponseEntity<UserDTO> saveUser(@RequestBody UserDTO userDTO){
        return new ResponseEntity<>(userServices.createUser(userDTO), HttpStatus.ACCEPTED.CREATED);
    }

    ///////////////////////////////////////Listar Users/////////////////////////////
    @GetMapping
    public List<UserDTO> listUser(){
        return userServices.getUser();
    }

    ///////////////////////////////////////Consultar Users por Id/////////////////////////////
    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> consultUserId(@PathVariable(name = "id") long id){
        return ResponseEntity.ok(userServices.consultUserId(id));
    }

    ///////////////////////////////////////Actualizar User////////////////////////////////
    @PostMapping("/{id}")
    public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO userDTO, @PathVariable(name="id") long id){
        UserDTO userResponse = userServices.updateUser(userDTO,id);
        return new ResponseEntity<>(userResponse, HttpStatus.OK);
    }

    ///////////////////////////////////////Actualizar User////////////////////////////////
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable(name="id") long id){
        userServices.deleteUser(id);
        return new ResponseEntity<>("User Eliminado con Exito..!", HttpStatus.OK);
    }
}
