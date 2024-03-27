package pcmjavafundamental.A;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 27/03/2024 19:08
@Last Modified 27/03/2024 19:08
Version 1.0
*/

import pcmjavafundamental.B.ClassB;
import pcmjavafundamental.C.ClassC;

public class ClassA {

    public static void main(String[] args) {

        int intOne = 1;
        System.out.println(intOne);

        ClassB classB = new ClassB();
        ClassC cX = classB.getNilai();
        System.out.println("Alamat Kelas Cx di class A adalah ->"+cX);
        System.out.println("Nilai intX sekarang adalah ->"+cX.getIntX());
    }
}