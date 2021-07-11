package com.vladveretilnyk.controller;

import com.vladveretilnyk.controller.pattern.Pattern;
import com.vladveretilnyk.model.entity.Note;
import com.vladveretilnyk.view.Message;
import com.vladveretilnyk.view.View;

import java.util.Scanner;

public class NoteController {
    private View view;
    private Scanner scanner;

    private ValidInputController validInputController;

    public NoteController(View view, Scanner scanner) {
        this.view = view;
        this.scanner = scanner;
        new ValidInputController(view, scanner);
    }

    public Note fillNote(Note note) {


        String name = validInputController.inputValidString
                (Message.INPUT_NAME_REQUEST.getMessage(),
                        Pattern.NAME.getPattern());

        String nickname = validInputController.inputValidString
                (Message.INPUT_NICKNAME_REQUEST.getMessage(),
                        Pattern.NICKNAME.getPattern());

        note.setName(name);
        note.setNickname(nickname);

        return note;
    }

    public Note fillNoteNickname(Note note) {
        String nickname = validInputController.inputValidString
                (Message.INPUT_NICKNAME_REQUEST.getMessage(),
                        Pattern.NICKNAME.getPattern());

        note.setNickname(nickname);

        return note;
    }
}
