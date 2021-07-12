package com.vladveretilnyk.examples.example6;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Parent {
    // предок пугает IOException и InterruptedException
    public void f() throws IOException, InterruptedException {}
}

class Child extends Parent {
    // а потомок пугает только потомком IOException
    @Override
    public void f() throws FileNotFoundException {}
}
