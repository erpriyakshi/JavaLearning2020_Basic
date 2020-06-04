package com.priyakshi.accessmodifier.package2;

import com.priyakshi.accessmodifier.package1.FieldExample;

public class FiledExample2 extends FieldExample {
    public static void main(String[] args) {
        // Field Example
        // Only public and protected field is accessible outside package but subclass
        FiledExample2 filedExample2 = new FiledExample2();
        System.out.println(filedExample2.protectedField);
        System.out.println(filedExample2.publicField);

    }
}
