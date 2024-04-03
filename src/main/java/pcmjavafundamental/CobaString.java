package pcmjavafundamental;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 28/03/2024 19:36
@Last Modified 28/03/2024 19:36
Version 1.0
*/

import pcmjavafundamental.A.ClassA;

import java.util.Scanner;

public class CobaString {


    public static void main(String[] args) {
        int intX = 10;
        double douX = 10.5;
        String strX = "11";
//        "apapun bentuk nya numerik ataupun text character"
        System.out.println(intX+strX+douX);
        double douResult = 85/7.0;
        System.out.println(douResult);
        System.out.println(5>7);
        String stringName = "isiString";
        int intV = 12;
        System.out.println(stringName);
        ClassA classA = new ClassA();
        System.out.println(classA);

        String strFirst = "welcome";
        String strSecond = "abcde";
//        String strSecond = "fghij";
        //Poll.chihuy
        System.out.println(strFirst.concat(strSecond));
        System.out.println(strFirst+strSecond);
        System.out.println(new StringBuilder().
                append(strFirst).
                append(strSecond).toString());

        String strThird = "aiuhseipouaheqp[ouhe12878174kjadsproijhara1`ij opajoies";
        System.out.println("Char yang ke 3 : "+strThird.charAt(3));
        System.out.println("cumicumi@yahoyuhuuu.com");
        System.out.println("Pa1-oko");//_$-# -> +62 0 62
        System.out.println("strFirst==strSecond : "+
                (strFirst==strSecond));
        System.out.println("strFirst.equalsIgnoreCase(strSecond) : "+
                (strFirst.equalsIgnoreCase(strSecond)));
        System.out.println(strFirst.substring(3));
        int intFirst = strFirst.length();
        System.out.println(strFirst.substring(3,strFirst.length()-2));
        System.out.println(strFirst.substring(3,strFirst.length()-2));
        System.out.println(strFirst.substring(3,strFirst.length()-2));
//        String strY = new String();
//        System.out.println("Alamat strY : "+strY);
        Scanner scanner = new Scanner(System.in);
//        String strP = "";
//        System.out.print("Masukkan Nilai strP : ");
//        strP = scanner.nextLine();
//        System.out.println("strP : "+strP);
//        String strM = "";
//        System.out.print("Masukkan Nilai strM : ");
//        strM = scanner.nextLine();
//        System.out.println("strM : "+strM);
//        String strK = "";
//        System.out.print("Masukkan Nilai strK : ");
//        strK = scanner.nextLine();
//        System.out.println("strK : "+strK);
        int intJumlah = 0;
        System.out.print("Masukkan Jumlah : ");
        intJumlah = scanner.nextInt();
        System.out.println("intJumlah : "+intJumlah);


    }
}