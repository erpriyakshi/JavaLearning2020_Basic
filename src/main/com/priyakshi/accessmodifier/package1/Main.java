package com.priyakshi.accessmodifier.package1;

public class Main {
    public static void main(String[] args) {
        // public class accessible within package
        PublicClass1 publicClass1 = new PublicClass1();
        // inner public class is accessible within package
        PublicClass1.InnerPublicClass1 innerPublicClass1 = new PublicClass1.InnerPublicClass1();
        // inner private class is not accessible within package, because private is only accessible within class
        //PrivateClass1.InnerPrivateClass1 innerPrivateClass1 = new PrivateClass1.InnerPrivateClass1();
        // inner protected class is not accessible within package, because protected is only accessible within class
        ProtectedClass1.InnerProtectedClass1 innerProtectedClass1 = new ProtectedClass1.InnerProtectedClass1();

        // Method Example
        // all access modifiers are accessible inside package except private
        MethodExample1 methodExample1 = new MethodExample1();
        methodExample1.publicMethod();
        methodExample1.protectedMethod();
        methodExample1.defaultMethod();
        //methodExample1.privateMethod();
        //Field Example
        // all access modifiers are accessible inside package except private
        FieldExample fieldExample = new FieldExample();
        System.out.println(fieldExample.publicField);
        System.out.println(fieldExample.protectedField);
        System.out.println(fieldExample.defaultField);
        //System.out.println(fieldExample.privateField);


    }
}
