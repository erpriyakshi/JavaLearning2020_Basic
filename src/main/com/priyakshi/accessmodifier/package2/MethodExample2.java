package com.priyakshi.accessmodifier.package2;

import com.priyakshi.accessmodifier.package1.MethodExample1;

public class MethodExample2 extends MethodExample1{

    public static void main(String[] args) {
        // Method Example
        // Only public and protected method is accessible outside package but subclass
        MethodExample2 methodExample2 = new MethodExample2();
        methodExample2.publicMethod();
        methodExample2.protectedMethod();
        // methodExample2.defaultMethod();
        // methodExample1.privateMethod();
    }

    public void otherMethod() {
        // Only public and protected method is accessible outside package but subclass
        publicMethod();
        protectedMethod();
        // defaultMethod();
        // privateMethod();
    }

    @Override
    public void publicMethod() {
        super.publicMethod();
    }

    @Override
    protected void protectedMethod() {
        super.protectedMethod();
    }

    // Cannot override default method as it is not visible in subclass.
    // so stated method is a new method and nothing to do with method in superclass
    // @Override
    void defaultMethod() {
        // super.defaultMethod();
    }

    // Cannot override private method as it is not visible in subclass.
    // so stated method is a new method and nothing to do with method in superclass
    // @Override
    private void privateMethod() {
        // super.privateMethod();
    }

}