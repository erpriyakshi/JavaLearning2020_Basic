package com.priyakshi.accessmodifier.package1;

// Class with same name as file name not be private.
public class ProtectedClass1 {
    // protected class accessible within class (containing class)
    InnerProtectedClass1 innerProtectedClass1 = new InnerProtectedClass1();
    InnerProtectedClass1.InnerProtectedClass2 innerProtectedClass2 = new InnerProtectedClass1.InnerProtectedClass2();

    protected static class InnerProtectedClass1 {
        // protected class accessible within class
        InnerProtectedClass1 innerProtectedClass1 = new InnerProtectedClass1();
        // protected class accessible within class (containing class)
        InnerProtectedClass2 innerProtectedClass2 = new InnerProtectedClass2();

        protected static class InnerProtectedClass2 {
            // protected class accessible within class
            ProtectedClass1.InnerProtectedClass1 innerProtectedClass1 = new ProtectedClass1.InnerProtectedClass1();
        }
    }

    // protected class have only has subclasses within class scope.
    protected static class InnerProtectedClass2 extends PublicClass1.InnerPublicClass1 {

    }
}

// Class with some other name as file name can not be protected
// as it will not be accessible to any other package so it impossible to run by JVM.
// protected class OtherProtectedClass {}

