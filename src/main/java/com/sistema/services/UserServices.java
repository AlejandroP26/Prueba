package com.sistema.services;

import com.sistema.dto.UserDTO;

import java.util.List;

public interface UserServices {

    public UserDTO createUser(UserDTO userDTO);

    //Obtiene todos los usuarrioacrualizada
    public List<UserDTO> getUser();

    public UserDTO consultUserId(long id);

    public UserDTO updateUser(UserDTO userDTO, long id);

    public void deleteUser(long id);
}


