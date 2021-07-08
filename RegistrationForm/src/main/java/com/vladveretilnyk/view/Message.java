package com.vladveretilnyk.view;

public enum Message {
    REGISTRATION_START("registration.start"),
    REQUEST_NAME("request.name"),
    REQUEST_NICKNAME("request.nickname"),
    WRONG_INPUT("wrong.input"),
    USER_EXISTS("user.exists"),
    NEW_NOTE_ASK("new.note.ask"),
    REGISTRATION_END("registration.end");

    private final String value;

    Message(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
