package com.vladveretilnyk.view;

public enum Message {
    INPUT_INTEGER_REQUEST("messages.input.request"),
    WRONG_INPUT("messages.wrong.input"),
    EXIT_INFO("messages.exit.info");


    private final String message;

    Message(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return View.messageBundle.getString(message);
    }
}
