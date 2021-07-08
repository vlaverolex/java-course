package com.vladveretilnyk.controller;

public enum Pattern {
    NAME("name.pattern.regexp"),
    NICKNAME("nickname.pattern.regexp");


    private final String value;

    Pattern(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
