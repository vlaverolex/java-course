package com.vladveretilnyk.model.entity;

import com.vladveretilnyk.model.entity.exception.NotUniqueUserException;

import java.util.ArrayList;
import java.util.List;

public class NotebookDatabase {
    private static final List<Note> notes = new ArrayList<>();

    public void insert(Note note) throws NotUniqueUserException {
        if (notes.contains(note)) {
            throw new NotUniqueUserException("User with the username " + note.getNickname() + " already exists");
        }

        notes.add(note);
    }
}
