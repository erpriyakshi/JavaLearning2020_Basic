package com.priyakshi.controlstatement.challenge.htmlcode;

public class Main {
    /**
     * generate following html code using java code.
     * <html>
     *     <head>
     *     </head>
     *     <body>
     *         hello world
     *     </body>
     * </html>
     */
    public static void main(String[] args) {
        String msg = "Hello World";
        System.out.println("<html>" + "\n" + "\t" + "<head>" + "\n" + "\t" + "</head>" + "\n" + "\t" + "<body>");
        System.out.println("\t" + "\t" + msg);
        System.out.println("\t" + "</body>" + "\n" + "</html>");
    }
}
