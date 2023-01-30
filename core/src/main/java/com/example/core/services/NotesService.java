package com.example.core.services;

import com.example.core.models.dtos.NotesDto;

import java.util.List;

public interface NotesService {

    NotesDto save (NotesDto notesDto);

    NotesDto findById(Long id);

    List<NotesDto> findAll();

    void deleteById(Long id);

    NotesDto update (NotesDto notesDto);
}
