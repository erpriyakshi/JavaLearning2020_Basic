package com.priyakshi.accessmodifier.package2;

import com.priyakshi.accessmodifier.package1.PublicClass1;

public class PublicClass2 {
    // public class accessible outside package
    PublicClass1 publicClass = new PublicClass1();

    public static class InnerPublicClass2 extends PublicClass1{
        // public class accessible outside package and subclass too
        PublicClass1 publicClass = new PublicClass1();
    }
}

