package com.vladveretilnyk.model;

import java.util.ArrayList;
import java.util.List;

public class Notebook {
    private List<Note> notebook;

    public Notebook() {
        notebook = new ArrayList<>();
    }

    public void addNote(Note note) {
        notebook.add(note);
    }

    public boolean contains(Note note) {
        return notebook.contains(note);
    }

    public List<Note> getNotes() {
        return notebook;
    }
}
