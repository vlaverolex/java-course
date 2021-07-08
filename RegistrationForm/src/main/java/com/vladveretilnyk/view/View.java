package com.vladveretilnyk.view;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {
    private static final String MESSAGE_BUNDLE_NAME = "messages.messages";
    public static final ResourceBundle messageBundle =
            ResourceBundle.getBundle(
                    MESSAGE_BUNDLE_NAME,
                    new Locale("ua", "UA") // Ukraine
                    //new Locale("en") // English
            );

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printInputRequestMessage(Message message) {
        printMessage(messageBundle.getString(message.value()));
    }

    public void printWrongInputMessage(Message message) {
        printMessage(messageBundle.getString(Message.WRONG_INPUT.value()) +
                "\n" +
                messageBundle.getString(message.value()));
    }

    public void printUserExistsMessage() {
        printMessage(messageBundle.getString(Message.USER_EXISTS.value()));
    }

    public void printNewNoteAsk() {
        printMessage(messageBundle.getString(Message.NEW_NOTE_ASK.value()));
    }

    public void printRegistrationStatusMessage(Message message) {
        printMessage(messageBundle.getString(message.value()));
    }
}
