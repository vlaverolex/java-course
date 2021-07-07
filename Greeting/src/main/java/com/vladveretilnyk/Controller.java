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
        view.printMessage(View.RESULT, model.uniteWords(getWords(scanner)));
    }

    public String[] getWords(Scanner scanner) {
        String[] words = new String[2];

        for (int i = 0; i < words.length; ) {
            if (i == 0) view.printMessage(View.INPUT_FIRST_WORD);
            else view.printMessage(View.INPUT_SECOND_WORD);

            String word = scanner.next();

            if (model.isValid(word, (i + 1))) {
                words[i] = word;
                i++;
            } else {
                view.printMessage(View.INPUT_WRONG);
            }
        }
        view.printMessage(View.INPUT_END);

        return words;
    }
}
