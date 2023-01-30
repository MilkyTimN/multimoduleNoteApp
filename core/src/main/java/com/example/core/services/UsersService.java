package com.example.core.services;

import com.example.core.models.dtos.UsersDto;

import java.util.List;

public interface UsersService {

    UsersDto save(UsersDto usersDto);

    UsersDto findById(Long id);

    List<UsersDto> findAll();

    void deleteById(Long id);

    UsersDto update(UsersDto usersDto);
}
