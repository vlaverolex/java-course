package com.vladveretilnyk.controller;

import com.vladveretilnyk.model.Model;
import com.vladveretilnyk.model.entity.Note;
import com.vladveretilnyk.model.entity.NotebookDatabase;
import com.vladveretilnyk.model.entity.exception.NotUniqueUserException;
import com.vladveretilnyk.view.Message;
import com.vladveretilnyk.view.View;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    private static final String YES = "y";
    private static final String NO = "n";

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        do {
            view.printMessage("\n" + Message.REGISTRATION_START.getMessage());
            createNoteIntoDatabase(scanner);
            view.printMessage(Message.REGISTRATION_END.getMessage() + "\n");
        } while (isContinue(scanner));
    }

    private void createNoteIntoDatabase(Scanner scanner) {
        NotebookDatabase database = new NotebookDatabase();
        NoteController noteController = new NoteController(view, scanner);
        Note note = new Note();

        noteController.fillNote(note);
        while (true) {
            try {
                database.insert(note);
                break;
            } catch (NotUniqueUserException e) {
                e.printStackTrace();
                view.printMessage(e.getMessage());
                noteController.fillNoteNickname(note);
            }
        }
    }

    private boolean isContinue(Scanner scanner) {
        String userInput = "";

        do {
            view.printMessage(Message.NEW_NOTE_ASK.getMessage());
        } while (!(userInput = scanner.next()).equals(NO) && !userInput.equals(YES));

        return userInput.equals(YES);
    }
}
