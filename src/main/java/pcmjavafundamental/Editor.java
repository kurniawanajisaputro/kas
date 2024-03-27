package pcmjavafundamental;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 26/03/2024 19:43
@Last Modified 26/03/2024 19:43
Version 1.0
*/

public class Editor {

    public static void main(String[] args) {
        int jumlah = 10;
        jumlah = 10;
        int jumlahBaru = 5+2;//+ - * / -->
        int x = 5;
        int y = 2;
        int jumlahBaru1 = x+y;
        double diskon = 0.5;
        double harga = 50000;
        double totalPembelian = harga - (harga*diskon);

        int j = x + 1;
        j = j + 1;

        byte byteX = (byte) -130;
        System.out.println("Nilai Byte X adalah : "+byteX);

        char chX = 'Z';// -> A - Z => 65 s.d 90
        System.out.println("ASCII Code -> "+(int)chX);

        System.out.println("Nama\tAlamat\tUmur\t");
        boolean b = 10<10;//false
        if(b==true)
        {
            System.out.println("Eksekusi ini - 1!!");
        }else {
            System.out.println("Eksekusi ini - 2!!");
        }

        System.out.println("OK");
        if(true){
            System.out.println("Melakukan Proses !!");
        }
        for(int i=0;i<10;i++){

            if(true){

            }
        }
    }
}
