package com.example.core.models.dtos;

import com.example.core.models.entities.Users;
import com.example.core.models.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotesDto {

    private Long id;
    private LocalDate createdDate;
    private LocalDate updatedDate;
    private Status status;
    private String title;
    private String note;
    private Users users;
}
