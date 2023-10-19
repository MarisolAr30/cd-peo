package com.campusdual;

public class exercise01 {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String cnv = "200";
        Integer cnvInt = Integer.parseInt(cnv);
        cnv = cnv +1;
        cnvInt = cnvInt +1;
        String cnvStr = String.valueOf(cnvInt);
        char cnvChar = cnvStr.charAt(2);


        // 1 = "1" = 1.0 = true
        // 0 = "0" = 0.0 = false
        // 2 = "2" = 2.00000 = true = "true"
    }

}
