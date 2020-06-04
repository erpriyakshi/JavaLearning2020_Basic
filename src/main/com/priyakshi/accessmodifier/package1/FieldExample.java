package com.priyakshi.accessmodifier.package1;

public class FieldExample {

    public String publicField = "Public Field";
    protected String protectedField = "Protected Field";
    String defaultField = "Default Field";
    private String privateField = "Private Field";

    public static void main(String[] args) {

        //all access modifier of field variable can be access within class
        FieldExample fieldExample = new FieldExample();

        System.out.println(fieldExample.publicField);
        System.out.println(fieldExample.protectedField);
        System.out.println(fieldExample.defaultField);
        System.out.println(fieldExample.privateField);

        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.publicField);
        System.out.println(innerClass.protectedField);
        System.out.println(innerClass.defaultField);
        System.out.println(innerClass.privateField);

    }

    static class InnerClass {
        public String publicField = "Public Field";
        protected String protectedField = "Protected Field";
        String defaultField = "Default Field";
        private String privateField = "Private Field";

        public static void main(String[] args) {
            // InnerClass innerClass = new InnerClass();
            FieldExample fieldExample = new FieldExample();
            System.out.println(fieldExample.publicField);
            System.out.println(fieldExample.protectedField);
            System.out.println(fieldExample.defaultField);
            System.out.println(fieldExample.privateField);
        }
    }

}
