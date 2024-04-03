package pcmjavafundamental;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 01/04/2024 19:21
@Last Modified 01/04/2024 19:21
Version 1.0
*/

import java.util.Scanner;
public class CobaWhile {
    public static void main(String[] args) {
//        String username = "paul123";
//        String password = "Paul@123";
//        String inputUsername = "";
//        String inputPassword = "";
//        boolean isValid = false;
//        Scanner scanner = new Scanner(System.in);
//
//        do{
//            System.out.print("Masukkan Username : ");
//            inputUsername = scanner.nextLine();
//            System.out.print("Masukkan Password : ");
//            inputPassword = scanner.nextLine();
//
//            if(username.equals(inputUsername) && password.equals(inputPassword))
//            {
//                isValid = true;
//                System.out.println("Login Berhasil !! !!");
//            }
//            else
//            {
//                System.out.println("Username atau Password salah");
//            }
//        }while (!isValid);


//        int intTotal = 0;
//        for (int i = 0; i < 10; i++) {
//            intTotal = intTotal + i;
//            if(i==5){
////                System.out.println("Nilai intTotal adalah : "+intTotal);
//                continue;
//            }
//            if(i==9){
//                System.out.println("Nilai intTotal adalah : "+intTotal);
//            }
//        }
        //proses tidak ada hambatan output = 45
        //dengan break pada iterasi / looping ke 6 , output = 10
        //dengan continue pada iterasi / looping ke 6, output = 40

//        /**
//         *  Gak ada ini nya ....
//         */
//        for (int i = 0; i < 3; i++) {
//            System.out.println("i ke "+i);
//            for (int j = 0; j < 5; j++) {
//                System.out.println("j ke "+j);
//                for (int k = 0; k < 5; k++) {
//                    if(k==3){
//                        break;
//                    }
//                    System.out.println("k ke "+k);
//                }
//            }
//        }

//        int [] myArray = new int[3];
//        myArray[0] = 1;
//        myArray[1] = 2;
//        myArray[2] = 3;
//        myArray[3] = 4;
//        myArray[4] = 5;
//        myArray[5] = 6;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Panjang Array => "+myArray.length);
//        for (int i = 0; i < myArray.length; i++) {
//            System.out.print ("Masukkan Array ke "+i+" : ");
//            myArray[i] = scanner.nextInt();
//        }
//        int intX = 0;
//        intX = scanner.nextInt();
//        System.out.println(intX);

//        for (int i = 0; i < myArray.length; i++) {
//            System.out.println("Nilai Array ke "+i+" adalah "+myArray[i]);
//        }
//        int [] intArr = {1,2,3,4,5,6};

        int [][] arrMultiDimensi = new int[2][2];
        arrMultiDimensi[0][0]=1;
        arrMultiDimensi[0][1]=2;
        arrMultiDimensi[1][0]=3;
        arrMultiDimensi[1][1]=4;

        for (int i = 0; i < arrMultiDimensi.length; i++) {
            for (int j = 0; j < arrMultiDimensi[i].length; j++) {
//                System.out.print("Baris ke i "+i+" Kolom ke j "+j+" adalah : "+arrMultiDimensi[i][j]);
//                System.out.print("arrMultiDimensi["+i+"]["+j+"] adalah : "+arrMultiDimensi[i][j]+"||");
                System.out.print(arrMultiDimensi[i][j]+"||");
            }
            System.out.println();
        }
    }
}
