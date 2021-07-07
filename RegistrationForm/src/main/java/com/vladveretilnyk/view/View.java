package com.vladveretilnyk.view;

import com.vladveretilnyk.model.Note;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import static com.vladveretilnyk.view.TextConstants.REQUEST_INPUT;
import static com.vladveretilnyk.view.TextConstants.WRONG_INPUT;

public class View {
    static String MESSAGE_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGE_BUNDLE_NAME,
                    // new Locale("ua", "UA") // Ukraine
                    new Locale("en") // English
            );

    public void printMessage(String message) {
        System.out.println(message);
    }

    private String concatString(String... strings) {
        StringBuilder builder = new StringBuilder();

        for (String string : strings) {
            builder.append(string);
        }

        return builder.toString();
    }

    public void printInputWrongMessage(String message) {
        printMessage(concatString(bundle.getString(WRONG_INPUT),
                bundle.getString(REQUEST_INPUT),
                bundle.getString(message)));
    }

    public void printInputRequestMessage(String message) {
        printMessage(concatString(bundle.getString(REQUEST_INPUT),
                bundle.getString(message)));
    }

    public void printRegistrationStatusMessage(String message) {
        printMessage(bundle.getString(message));
    }

    public void printNotes(List<Note> notes) {
        for (Note note : notes) {
            printMessage(note.toString());
        }
    }
}
