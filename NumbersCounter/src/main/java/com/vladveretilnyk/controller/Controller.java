package com.vladveretilnyk.controller;

import com.vladveretilnyk.model.Model;
import com.vladveretilnyk.view.View;

import java.util.List;

public class Controller {
    private Model model;
    private View view;

//    private final static String EXIT = "stop";

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void execute() {
        // Scanner scanner = new Scanner(System.in);
        List<Integer> list = List.of(4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7);

        model.add(list);

        view.printMessage(model.getCountingDigits().toString());
    }

    /*
    private int inputInteger(Scanner scanner) {
        view.printMessage(Message.INPUT_INTEGER_REQUEST.toString());

        while (!scanner.hasNextInt()) {
            view.printMessage(Message.WRONG_INPUT.toString());
            view.printMessage(Message.INPUT_INTEGER_REQUEST.toString());

            scanner.next();
        }

        return scanner.nextInt();
    }
    */

}
