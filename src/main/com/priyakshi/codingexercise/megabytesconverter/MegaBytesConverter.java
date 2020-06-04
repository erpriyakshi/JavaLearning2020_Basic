package com.priyakshi.codingexercise.megabytesconverter;

public class MegaBytesConverter {

    public void printMegaBytesAndKilobytes(int kilobytes) {
        int megaBytes = kilobytes / 1024;
        int remaingKilobytes = kilobytes % 1024;
        String msg = kilobytes + " KB = " + megaBytes + " MB and " + remaingKilobytes + " KB";
        System.out.println(msg);

    }

}
