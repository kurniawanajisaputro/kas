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
public class RandomOne {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(5,11));
        }
    }
}
