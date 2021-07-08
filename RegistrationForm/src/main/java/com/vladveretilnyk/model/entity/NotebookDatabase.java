package com.vladveretilnyk.model.entity;

import com.vladveretilnyk.exception.UserExistException;

import java.util.ArrayList;
import java.util.List;

public class NotebookDatabase {
    private List<Note> notebook = new ArrayList<>();

    public void insert(Note note) throws UserExistException {
        if (notebook.contains(note)) {
            throw new UserExistException("User already exist!");
        }
        notebook.add(note);
    }

    public List<Note> selectAllNotes() {
        return notebook;
    }
}
