package com.example.core.services.impl;

import com.example.core.Exceptions.EntityNotFoundException;
import com.example.core.models.dtos.NotesDto;
import com.example.core.models.mappers.NotesMapper;
import com.example.core.repositories.NotesRepository;
import com.example.core.services.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotesServiceImpl implements NotesService {

    private final NotesRepository repository;

    @Autowired
    public NotesServiceImpl(NotesRepository repository) {
        this.repository = repository;
    }



    @Override
    public NotesDto save(NotesDto notesDto) {
        return NotesMapper.INSTANCE.toDto(repository.save(NotesMapper.INSTANCE.toEntity(notesDto)));
    }

    @Override
    public NotesDto findById(Long id) {
        return NotesMapper.INSTANCE.toDto(repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Not found")));
    }

    @Override
    public List<NotesDto> findAll() {
        return NotesMapper.INSTANCE.toListOfDto(repository.findAll());
    }

    @Override
    public void deleteById(Long id) {
    }

    @Override
    public NotesDto update(NotesDto notesDto) {
        return null;
    }
}
