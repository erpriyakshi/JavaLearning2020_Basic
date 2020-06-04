package com.priyakshi.staticexample;

public class Main {

    public static void main(String[] args) {
        Main main1 = new Main();
        Main main2 = new Main();
        // Method Example
        System.out.println("Non Static Method");
        MethodExample methodExample = new MethodExample();
        methodExample.nonStaticMethod();
        methodExample.staticMethod(); // calling a static method from object is not recommended.
        System.out.println("Static Method");
        MethodExample.staticMethod();
        // MethodExample.nonStaticMethod(); // this line give compilation error as non static method can't be accessed by class

        // Variable Example
        System.out.println("VariableExample.staticInt = " + VariableExample.staticInt);
        VariableExample.staticInt = 10;
        // VariableExample.nonStaticInt = 20; // this line gives compilation error as non static variable can't be accessed by class.

        VariableExample variableExample1 = new VariableExample();
        variableExample1.nonStaticInt = 30;

        VariableExample variableExample2 = new VariableExample();
        variableExample2.nonStaticInt = 40;

        System.out.println("VariableExample.staticInt = " + VariableExample.staticInt);
        System.out.println("variableExample1.staticInt = " + variableExample1.staticInt); // calling a static method from object is not recommended.
        System.out.println("variableExample2.staticInt = " + variableExample2.staticInt); // calling a static method from object is not recommended.

        variableExample1.staticInt = 50;
        System.out.println("VariableExample.staticInt = " + VariableExample.staticInt);
        System.out.println("variableExample1.staticInt = " + variableExample1.staticInt); // calling a static method from object is not recommended.
        System.out.println("variableExample2.staticInt = " + variableExample2.staticInt); // calling a static method from object is not recommended.

        System.out.println("variableExample1.staticInt = " + variableExample1.nonStaticInt); // calling a static method from object is not recommended.
        System.out.println("variableExample2.staticInt = " + variableExample2.nonStaticInt); // calling a static method from object is not recommended.

    }
}
