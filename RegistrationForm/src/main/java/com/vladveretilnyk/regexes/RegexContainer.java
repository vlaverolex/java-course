package com.vladveretilnyk.regexes;

public interface RegexContainer {
    String ENG_NAME_PATTERN = "[A-Z][a-z]{2,}";
    String UKR_NAME_PATTERN = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{2,}$";

    String NICKNAME_PATTERN = "[a-zA-Z](.[a-zA-Z0-9_-]{5,})";
}
