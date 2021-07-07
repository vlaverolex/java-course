package com.vladveretilnyk.controllers;

import com.vladveretilnyk.view.View;

import java.util.Scanner;

public class ValidInputController {
    private View view;
    private Scanner scanner;

    public ValidInputController(View view, Scanner scanner) {
        this.view = view;
        this.scanner = scanner;
    }

    public String inputValidString(String message, String regex) {
        String userInput;
        view.printInputRequestMessage(message);

        while (!(scanner.hasNext() && (userInput = scanner.next()).matches(regex))) {
            view.printInputWrongMessage(message);
        }

        return userInput;
    }
}
