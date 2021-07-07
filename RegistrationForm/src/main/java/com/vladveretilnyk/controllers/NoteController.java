package com.vladveretilnyk.controllers;

import com.vladveretilnyk.model.Note;
import com.vladveretilnyk.view.View;

import static com.vladveretilnyk.view.TextConstants.REGISTRATION_START;
import static com.vladveretilnyk.view.TextConstants.REGISTRATION_COMPLETE;
import static com.vladveretilnyk.view.TextConstants.NAME;
import static com.vladveretilnyk.view.TextConstants.NICKNAME;

import static com.vladveretilnyk.regexes.RegexContainer.ENG_NAME_PATTERN;
import static com.vladveretilnyk.regexes.RegexContainer.UKR_NAME_PATTERN;
import static com.vladveretilnyk.regexes.RegexContainer.NICKNAME_PATTERN;

import java.util.Scanner;

public class NoteController {
    private View view;
    private Scanner scanner;

    public NoteController(View view, Scanner scanner) {
        this.view = view;
        this.scanner = scanner;
    }

    public Note createNote() {
        ValidInputController validInputController =
                new ValidInputController(view, scanner);

        view.printRegistrationStatusMessage(REGISTRATION_START);

        String name = validInputController.inputValidString(NAME, getLocaleRegexForName());
        String nickname = validInputController.inputValidString(NICKNAME, NICKNAME_PATTERN);

        view.printRegistrationStatusMessage(REGISTRATION_COMPLETE);

        return new Note(name, nickname);
    }

    private String getLocaleRegexForName() {
        return String.valueOf(View.bundle.getLocale()).equals("ua") ? UKR_NAME_PATTERN : ENG_NAME_PATTERN;
    }
}
