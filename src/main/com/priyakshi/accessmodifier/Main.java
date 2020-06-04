package com.priyakshi.accessmodifier;

import com.priyakshi.accessmodifier.package1.FieldExample;
import com.priyakshi.accessmodifier.package1.MethodExample1;

public class Main {
    public static void main(String[] ags) {
        // Class Example
        // inner private class is not accessible outside package, because private is only accessible within class
        // PrivateClass1.InnerPrivateClass1 innerPrivateClass1 = new PrivateClass1.InnerPrivateClass1;
        // inner protected class is not accessible outside package, because protected is only accessible within package and class
        //ProtectedClass.InnerProtectedClass1 innerProtectedClass1 = new ProtectedClass1.InnerProtectedClass1();

        //Default Class Example Pending

        // Method Example
        // Only public method is accessible outside package
        MethodExample1 methodExample1 = new MethodExample1();
        methodExample1.publicMethod();
        //methodExample1.protectedMethod();//access//accessible/accessibility//accessed
        //methodExample1.defaultMethod();
        //methodExample1.privateMethod();
        //Field Variable
        //Only public method is accessible outside package
        FieldExample fieldExample = new FieldExample();
        System.out.println(fieldExample.publicField);
    }
}

