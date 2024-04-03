package pcmjavafundamental;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 01/04/2024 21:16
@Last Modified 01/04/2024 21:16
Version 1.0
*/
import java.util.Scanner;
public class LinearSearch {

    public static void main(String[] args) {
        int [] intArr= {14,7,20,11,1,4,50};
//        {66,77,80,84,88,99,100,105,111,114,119}

        int intCari = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Angka yang ingin dicari !! : ");
        intCari = scan.nextInt();
        int intLoop = 0;
        boolean isFound = true;
        while(isFound==true && intLoop<intArr.length){
            if(intArr[intLoop]==intCari){
                System.out.println("Data Ditemukan pada index ke "+intLoop);
                isFound=false;
            }
            intLoop++;
        }

        if(isFound==true){
            System.out.println("Data Tidak Ditemukan !!");
        }
    }
}
