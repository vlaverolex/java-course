package com.vladveretilnyk.view;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {
    private static final String MESSAGE_BUNDLE_NAME = "messages.messages";
    public static final ResourceBundle messageBundle =
            ResourceBundle.getBundle(
                    MESSAGE_BUNDLE_NAME,
                    //new Locale("ua", "UA") // Ukraine
                    new Locale("en") // English
            );

    public void printMessage(String message){
        System.out.println(message);
    }
}
