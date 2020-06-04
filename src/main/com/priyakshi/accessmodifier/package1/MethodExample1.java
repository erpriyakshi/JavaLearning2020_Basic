package com.priyakshi.accessmodifier.package1;

public class MethodExample1 {

    public void publicMethod(){}

    protected void protectedMethod(){}

    void defaultMethod(){}

    private void privateMethod(){}

    public static void main(String[] args) {
        // all access modifiers are accessible within class
        MethodExample1 methodExample1 = new MethodExample1();
        methodExample1.publicMethod();
        methodExample1.protectedMethod();
        methodExample1.defaultMethod();
        methodExample1.privateMethod();

        InnerClass innnerClass = new InnerClass();
        innnerClass.publicMethod();
        innnerClass.protectedMethod();
        innnerClass.defaultMethod();
        innnerClass.privateMethod();
    }

    static class InnerClass {

        public void publicMethod(){}

        protected void protectedMethod(){}

        void defaultMethod(){}

        private void privateMethod(){}

        public static void main(String[] args) {
            // all access modifiers are accessible within class
            MethodExample1 methodExample1 = new MethodExample1();
            methodExample1.publicMethod();
            methodExample1.protectedMethod();
            methodExample1.defaultMethod();
            methodExample1.privateMethod();
        }
    }

}
