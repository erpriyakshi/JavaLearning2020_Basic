package com.priyakshi.accessmodifier.package1;

public class PublicClass1 {
    // public class accessible within class
    PublicClass1 publicClass = new PublicClass1();
    public static class InnerPublicClass1 {
        // public class accessible within class (in inner class too)
        PublicClass1 publicClass = new PublicClass1();
    }
}
