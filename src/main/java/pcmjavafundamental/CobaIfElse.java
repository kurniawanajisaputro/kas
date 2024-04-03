package pcmjavafundamental;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 27/03/2024 20:08
@Last Modified 27/03/2024 20:08
Version 1.0
*/

public class CobaIfElse {

    public static void main(String[] args) {
        int x = 20;
        if(x%2==0)
            if(x/100!=0)
                System.out.println(x+" Bilangan Genap Lebih dari Seratus");
            else
            if(x/10!=0)
                System.out.println(x+"Bilangan Genap Lebih dari sepuluh");

        int intX = 20;
        if(intX%2==0)
        {
            if(intX/100!=0)
            {
                System.out.println(intX+" Bilangan Genap Lebih dari Seratus");
            }
        }else
        {
            if(intX/10!=0)
                System.out.println(intX+"Bilangan Genap Lebih dari sepuluh");
        }
    }
}