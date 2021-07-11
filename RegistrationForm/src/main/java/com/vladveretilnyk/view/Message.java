package com.vladveretilnyk.view;

public enum Message {
    REGISTRATION_START("registration.start"),
    INPUT_NAME_REQUEST("input.name.request"),
    INPUT_NICKNAME_REQUEST("input.nickname.request"),
    WRONG_INPUT_WARNING("wrong.input.warning"),
    NEW_NOTE_ASK("new.note.ask"),
    REGISTRATION_END("registration.end");


    private String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return View.messageBundle.getString(message);
    }
}
