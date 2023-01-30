package com.example.core.models.dtos;

import com.example.core.models.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsersDto {

    private Long id;
    private LocalDate createdDate;
    private LocalDate updatedDate;
    private Status status;
    private String name;
    private String email;
    private String password;
}
