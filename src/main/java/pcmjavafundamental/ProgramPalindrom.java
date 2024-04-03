package pcmjavafundamental;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 02/04/2024 19:42
@Last Modified 02/04/2024 19:42
Version 1.0
*/
import java.util.Scanner;
public class ProgramPalindrom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Kata : ");
        String inputPalindrom = scan.nextLine();
        //K A T A K -> K A T A K
        //B U A H -> H A U B
        boolean isValid = true;
        inputPalindrom = inputPalindrom.toLowerCase();
        int intLength = inputPalindrom.length()-1;
        char [] strToArr = inputPalindrom.toCharArray();
        for (int i = 0; i < intLength ; i++) {
            if(strToArr[intLength-i] != strToArr[i]){
                System.out.println("Bukan Palindrom");
                isValid = false;
                break;
            }
        }

        if(isValid){
            System.out.println("Palindrom !!");
        }
    }
}
