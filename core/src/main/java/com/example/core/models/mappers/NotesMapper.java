package com.example.core.models.mappers;

import com.example.core.models.dtos.NotesDto;
import com.example.core.models.entities.Notes;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface NotesMapper {

    NotesMapper INSTANCE = Mappers.getMapper(NotesMapper.class);

    Notes toEntity(NotesDto notesDto);
    NotesDto toDto(Notes notes);

    List<Notes> toListOfEntity(List<NotesDto> notesDtoList);
    List<NotesDto> toListOfDto(List<Notes>notesList);
}
