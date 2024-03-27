package pcmjavafundamental.B;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 27/03/2024 19:09
@Last Modified 27/03/2024 19:09
Version 1.0
*/

import pcmjavafundamental.C.ClassC;

public class ClassB {
    public ClassC getNilai(){
        ClassC c = new ClassC(10);
        System.out.println("Alamat Kelac C di class B adalah ->"+c);
        return c;
    }
}