package pcmjavafundamental;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 02/04/2024 19:56
@Last Modified 02/04/2024 19:56
Version 1.0
*/
import java.util.Random;
import java.util.Scanner;
public class RandomDataEmail {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        String hurufVokal = "aiueo";
        String hurufKonsonan = "bcdfghjklmnpqrstvwxyz";
        String [] strProvider = {"gmail","ymail","yahoo","rocketmail","hotmail"};
        String [] strDomain = {"com","co.id","id","org","edu","sch","ac.id"};
        // pollchihuy123@gmail.com
        //huruf kombinasi vokal konsonan -> [ min 10 & maksimal 20 ]
        // angka 1 s.d 2 digit
        // @
        // provider
        // .
        // domain
        int intLengthFirst = 0;
        int intAngka = 0;
        System.out.print("Masukkan jumlah data email yang ingin dibuat : ");
        int intJumlahData = scan.nextInt();
        long start = System.currentTimeMillis();
        long end = 1L;

        for (int i = 0; i < intJumlahData; i++) {
            intAngka = random.nextInt(10,1000);// 10 s.d 999
            intLengthFirst = random.nextInt(10,21);//huruf awal

            for (int j = 0; j < intLengthFirst; j++) {//13
                if(j%2==0){
                    System.out.print(hurufVokal.charAt(random.nextInt(0,5)));
                }else {
                    System.out.print(hurufKonsonan.charAt(random.nextInt(0,21)));
                }
            }
            System.out.print(intAngka);
            System.out.print("@");
            System.out.print(strProvider[random.nextInt(0,5)]);
            System.out.print(".");
            System.out.print(strDomain[random.nextInt(0,7)]);
            System.out.println();
        }
        end = (System.currentTimeMillis()-start)/1000;
        System.out.println(end+" Detik");
    }
}
