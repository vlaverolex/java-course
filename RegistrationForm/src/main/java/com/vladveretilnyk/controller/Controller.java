package com.vladveretilnyk.controller;

import com.vladveretilnyk.model.Model;
import com.vladveretilnyk.view.Message;
import com.vladveretilnyk.view.View;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;
    private static final String NO = "n";
    private static final String YES = "y";

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        NotebookController notebookController = new NotebookController(view, scanner);

        String userInput = "";

        while (!userInput.equals(NO)) {
            view.printRegistrationStatusMessage(Message.REGISTRATION_START);
            notebookController.createNote();
            view.printRegistrationStatusMessage(Message.REGISTRATION_END);

            userInput = inputUserAnswer(scanner);
        }
    }

    private String inputUserAnswer(Scanner scanner) {
        String userInput = "";

        do {
            view.printNewNoteAsk();
        } while (!(scanner.hasNext() &&
                (((userInput = scanner.next()).equals(YES)) || userInput.equals(NO))));

        return userInput;
    }
}
