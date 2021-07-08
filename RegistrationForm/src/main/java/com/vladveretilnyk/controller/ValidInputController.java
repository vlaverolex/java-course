package com.vladveretilnyk.controller;

import com.vladveretilnyk.view.Message;
import com.vladveretilnyk.view.View;

import java.util.Scanner;

public class ValidInputController {
    private View view;
    private Scanner scanner;

    public ValidInputController(View view, Scanner scanner) {
        this.view = view;
        this.scanner = scanner;
    }

    public String inputValidString(Message message, String pattern) {
        String userInput;
        view.printInputRequestMessage(message);

        while (!(scanner.hasNext() && (userInput = scanner.next()).matches(pattern))) {
            view.printWrongInputMessage(message);
        }

        return userInput;
    }
}
