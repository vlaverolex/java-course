package com.vladveretilnyk;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        model.setBorders(GlobalConstants.MIN_BORDER, GlobalConstants.MAX_BORDER);
        model.guessNumber();

        view.printMessage(View.START_MESSAGE);

        while (!model.isGuessedNumber(getInput(scanner))) ;

        view.printMessage(View.VICTORY + View.COLON + View.SPACE_SING + model.getGuessedNumber());
        view.printMessage(View.STATISTICS + View.COLON + View.SPACE_SING + view.convertToString(model.getAttempts()));

    }

    private int getInput(Scanner scanner) {
        int userInput;

        do {
            view.printMessage(view.getInputNumberStringMessage(model.getMinBorder(), model.getMaxBorder()));

            while (!scanner.hasNextInt()) {
                view.printMessage(View.INPUT_WRONG);
                view.printMessage(view.getInputNumberStringMessage(model.getMinBorder(), model.getMaxBorder()));

                scanner.next();
            }
            userInput = scanner.nextInt();
        } while (!(userInput > model.getMinBorder() &&
                userInput < model.getMaxBorder()));

        return userInput;
    }
}