package pcmjavafundamental;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 01/04/2024 20:57
@Last Modified 01/04/2024 20:57
Version 1.0
*/

public class SelectionSort {
    public static void main(String[] args) {
        int [] val = {69,89,31,56,99};
        String bef = "";
        String aft = "";
        int initz = 0;

        int intContainer =0;

        System.out.println("==BEFORE==");
        for (int i = 0; i < val.length; i++) {
            bef = bef + val[i]+",";
        }
        System.out.println(bef.substring(0,bef.length()-1));


    }
}
