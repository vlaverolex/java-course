package com.vladveretilnyk;

import com.vladveretilnyk.controllers.Controller;
import com.vladveretilnyk.model.Notebook;
import com.vladveretilnyk.view.View;

public class Main {
    public static void main(String[] args) {
        new Controller(new Notebook(), new View()).execute();
    }
}
