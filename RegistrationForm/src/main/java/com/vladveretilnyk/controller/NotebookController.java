package com.vladveretilnyk.controller;

import com.vladveretilnyk.exception.UserExistException;
import com.vladveretilnyk.model.entity.Note;
import com.vladveretilnyk.model.entity.NotebookDatabase;
import com.vladveretilnyk.view.Message;
import com.vladveretilnyk.view.View;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class NotebookController {
    private View view;
    private Scanner scanner;
    private NotebookDatabase database = new NotebookDatabase();

    private static final String PATTERN_BUNDLE_NAME = "patterns.patterns";
    private static ResourceBundle patternBundle =
            ResourceBundle.getBundle(
                    PATTERN_BUNDLE_NAME,
                    new Locale(View.messageBundle.getLocale().getLanguage())
            );

    public NotebookController(View view, Scanner scanner) {
        this.view = view;
        this.scanner = scanner;
    }

    public void createNote() {
        ValidInputController validInputController =
                new ValidInputController(view, scanner);

        String name = validInputController.inputValidString(Message.REQUEST_NAME,
                getLocalePattern(Pattern.NAME));

        while (true) {
            String nickname = validInputController.inputValidString(Message.REQUEST_NICKNAME,
                    getLocalePattern(Pattern.NICKNAME));

            try {
                database.insert(new Note(name, nickname));
                break;
            } catch (UserExistException e) {
                e.printStackTrace();
                view.printUserExistsMessage();
            }
        }
    }

    private String getLocalePattern(Pattern pattern) {
        if (!patternBundle.getLocale().getLanguage().
                equals(View.messageBundle.getLocale().getLanguage())) {
            patternBundle =
                    ResourceBundle.getBundle(
                            PATTERN_BUNDLE_NAME,
                            new Locale(View.messageBundle.getLocale().getLanguage())
                    );
        }

        return patternBundle.getString(pattern.value());
    }
}
