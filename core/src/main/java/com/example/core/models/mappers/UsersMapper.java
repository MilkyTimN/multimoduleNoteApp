package com.example.core.models.mappers;

import com.example.core.models.dtos.UsersDto;
import com.example.core.models.entities.Users;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UsersMapper {

    UsersMapper INSTANCE = Mappers.getMapper(UsersMapper.class);

    Users toEntity(UsersDto usersDto);
    UsersDto toDto(Users users);

    List<Users> toListOfEntities(List<UsersDto> usersDtoList);
    List<UsersDto> toListOfDto(List<Users>usersList);
}
