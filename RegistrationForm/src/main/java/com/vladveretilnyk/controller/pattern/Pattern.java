package com.vladveretilnyk.controller.pattern;

import com.vladveretilnyk.view.View;

import java.util.Locale;
import java.util.ResourceBundle;

public enum Pattern {
    NAME("name.regexp"),
    NICKNAME("nickname.regexp");

    public static final String PATTERN_BUNDLE_NAME = "patterns.patterns";
    public static final ResourceBundle patternBundle =
            ResourceBundle.getBundle(
                    PATTERN_BUNDLE_NAME,
                    new Locale(View.messageBundle.getLocale().getLanguage())
                    // new Locale("ua", "UA") // Ukraine
                    // new Locale("en") // English
            );

    private String pattern;

    Pattern(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return patternBundle.getString(pattern);
    }
}
