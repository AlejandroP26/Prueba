package com.sistema.services;

import com.sistema.dto.UserDTO;
import com.sistema.entities.User;
import com.sistema.exception.ResourceNotFoundException;
import com.sistema.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServicesImpl implements UserServices{

    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDTO createUser(UserDTO userDTO) {
        User user = mapEntity(userDTO);

        User newUser = userRepository.save(user);

        UserDTO userResponse = mapDTO(newUser);

        return userResponse;
    }

    @Autowired
    public List<UserDTO> getUser(){
        List<User> users = userRepository.findAll();
        return users.stream().map(user -> mapDTO(user)).collect(Collectors.toList());
    }

    @Override
    public UserDTO consultUserId(long id) {
        User user = userRepository
                .findById(id).orElseThrow(()-> new ResourceNotFoundException("User", "id", id));
        return mapDTO(user);
    }

    private  UserDTO mapDTO(User user){
        UserDTO userDTO = new UserDTO();

        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setLastName(user.getLastName());
        userDTO.setEmail(user.getEmail());
        userDTO.setPassword(user.getPassword());
        userDTO.setCuidad(user.getCuidad());
        userDTO.setOrganizacion(user.getOrganizacion());

        return userDTO;
    }

    private  User mapEntity(UserDTO userDTO){
        User user = new User    ();

        user.setName(userDTO.getName());
        user.setLastName(userDTO.getLastName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setCuidad(userDTO.getCuidad());
        user.setOrganizacion(userDTO.getOrganizacion());

        return user;
    }



    @Override
    public UserDTO  updateUser(UserDTO userDTO, long id){
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", id));

        user.setName(userDTO.getName());
        user.setLastName(userDTO.getLastName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setCuidad(userDTO.getCuidad());
        user.setOrganizacion(userDTO.getOrganizacion());

        User userupdated = userRepository.save(user);
        return mapDTO(userupdated);
    }

    @Override
    public void deleteUser(long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", id));

        userRepository.delete(user);
    }


}
