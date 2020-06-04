package com.priyakshi.accessmodifier.package1;

// Class with same name as file name not be private.
public class PrivateClass1 {
    // private class accessible within class (containing class)
    InnerPrivateClass1 innerPrivateClass1 = new InnerPrivateClass1();
    InnerPrivateClass1.InnerPrivateClass2 innerPrivateClass2 = new InnerPrivateClass1.InnerPrivateClass2();

    private static class InnerPrivateClass1 {
        // private class accessible within class
        InnerPrivateClass1 innerPrivateClass1 = new InnerPrivateClass1();
        // private class accessible within class (containing class)
        InnerPrivateClass2 innerPrivateClass2 = new InnerPrivateClass2();

        private static class InnerPrivateClass2 {
            // // private class accessible within class
            InnerPrivateClass1 innerPrivateClass1 = new InnerPrivateClass1();
        }
    }

    // private class have only has subclasses within class scope.
    private static class InnerPrivateClass2 extends PublicClass1.InnerPublicClass1 {

    }
}

// Class with some other name as file name can not be private as it will not be accessible to anyone.
// private class OtherPrivateClass {}

