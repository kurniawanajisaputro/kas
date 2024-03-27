package pcmjavafundamental;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 27/03/2024 19:16
@Last Modified 27/03/2024 19:16
Version 1.0
*/

public class Oretan2 {

    public static void main(String[] args) {
//        short shoX = 32767;
//        byte byteX = (byte) shoX;//-128 s.d 127
//        System.out.println("Nilai byteX Adalah "+byteX);
//        System.out.println(32767%127);

//        int intY = 10;
//        System.out.println("Nilai IntY => "+intY);
//        int intX = intY;
//        System.out.println("Nilai IntX => "+intX);
//        intX = 20;
//        System.out.println("Nilai IntX Selanjutnya => "+intX);
//        System.out.println("Nilai IntY => "+intY);

        ObjectPassing obj1 = new ObjectPassing(10);
        System.out.println("Alamat memori obj1 "+obj1);
        System.out.println("Nilai intX obj1 -> "+obj1.getIntX());
        ObjectPassing obj2 = obj1;
        System.out.println("Alamat memori obj2 "+obj2);
        System.out.println("Nilai intX obj2 -> "+obj2.getIntX());
        System.out.println("==========================");
        obj2.setIntX(20);
        System.out.println("Nilai intX obj2 Sekarang adalah -> "+obj2.getIntX());
        System.out.println("Nilai intX obj1 Sekarang adalah -> "+obj1.getIntX());






    }
}