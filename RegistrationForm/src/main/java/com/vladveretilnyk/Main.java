package com.vladveretilnyk;

import com.vladveretilnyk.controller.Controller;
import com.vladveretilnyk.model.Model;
import com.vladveretilnyk.view.Message;
import com.vladveretilnyk.view.View;

public class Main {
    public static void main(String[] args) {
        new Controller(new Model(), new View()).execute();
    }
}
