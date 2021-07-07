package com.vladveretilnyk.controllers;

import com.vladveretilnyk.model.Notebook;
import com.vladveretilnyk.view.View;

import java.util.Scanner;

public class Controller {
    private Notebook noteBook;
    private View view;

    public Controller(Notebook noteBook, View view) {
        this.noteBook = noteBook;
        this.view = view;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        NoteController noteController = new NoteController(view, scanner);

        noteBook.addNote(noteController.createNote());

        view.printNotes(noteBook.getNotes());
    }
}
