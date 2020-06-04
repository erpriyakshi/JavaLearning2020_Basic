package com.priyakshi.stringExample;

public class Main {

    public static void main(String[] args) {
        String str1 = "Sumit";
        String str2 = "Sumit";
        String str3 = new String("Sumit");
        String str4 = new String("sumit");
        System.out.println(str1 + str2 + str3);
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        boolean result1 = str1 == str2;
        System.out.println(result1);
        boolean result2 = str1 == str3;
        System.out.println(result2);
        boolean result3 = str1.equalsIgnoreCase(str3);
        System.out.println(result3);
        boolean result4 = str1.equals(str4);
        System.out.println(result4);
        str2 = str2.substring(0, 3);
        System.out.println(str2 + System.identityHashCode(str2));
/*
        Object o1 = new Object();
        Object o2 = new Object();
        System.out.println(o1 == o2);
        System.out.println(o1.equals(o2));

        Emp emp1 = new Emp(1);
        Emp emp2 = new Emp(1);
        Emp emp3 = emp1;
        System.out.println(emp1 == emp2);
        System.out.println(emp1.equals(emp2));
        System.out.println(emp1.equals(emp3));
        /*
 */
    }
}
