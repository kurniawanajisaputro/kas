package pcmjavafundamental;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 27/03/2024 19:12
@Last Modified 27/03/2024 19:12
Version 1.0
*/

public class ClassBaru {

    public static void main(String[] args) {
        int intZ = 0;
        int intY = 0;
        int intX = 0;

        int x = 2;
        int num1 = 10 * x++;
        System.out.println("Jumlah num1 adalah => "+num1);

        int y = 2;
        int num2 = 10 * ++y;
        System.out.println("Jumlah num2 adalah => "+num2);

        double a = 10.0;
        double b = 5.0;
        double c = 4.0;
        double d = 11.0;
        double myVal = a+b%d-c*d/b;
        myVal = (a+(b%d))-((c*d)/b);

        double u = 1000.0;
        u = u + 200;
        u+=200;
        u = u * 200;
        u*=200;

        System.out.println("(5>8) Hasilnya : "+(5>8));//&&
        System.out.println("(10!=10) Hasilnya : "+(10!=10));//&&
        System.out.println("(5>8) && (10!=10) Hasilnya : "+((5>8) && (10!=10)));//&&

        System.out.println("true && true hasil nya "+(true && true));
        System.out.println("false && true hasil nya "+(false && true));

        System.out.println("false || false hasil nya "+(false || false));// ||
        System.out.println("true || false hasil nya "+(true || false));// ||
        System.out.println("false || true hasil nya "+(false || true));// ||
        System.out.println("true || true hasil nya "+(true || true));// ||

//        int z = 200;
//        String username = "paul";
//        String password = "Paul@123";
//        if(!(username.equals("Paul") && password.equals("Paul@123"))){
////            System.out.println("Anda tidak menginput nilai yang benar !!");
//            System.out.println("Wrong Credentials!!");
//            System.exit(1);
//        }

        System.out.println("Not False : "+!false);
        System.out.println(!(false && false) || (true && !(false || true)));//^
        System.out.println("true ^ true => "+(true ^ true));

        // survey dia punya 4 jawaban
        // masing-masing jawaban punya poin a:4 b:3 c:2 selain ketiga nya adalah ==>
//         d:1 --- lainnya : .....
        //if(jawaban.equals("a"))
//        point+4
//        else if(jawaban.equals("b"))
        //        point+3
        //else if(jawaban.equals("c"))
        //        point+2
//        else if(jawaban.equals("d"))
        //        point+1


        String jawaban = "c";
        int point = 0;
        if(jawaban.equals("a"))
        {point+=4;}
        else if(jawaban.equals("b"))
        {point+=3;}
        else if(jawaban.equals("c"))
        {point+=2;}
        else if(jawaban.equals("d"))
        {point+=1;}

        System.out.println("Point Adalah : "+point);
        point=0;
        switch (jawaban){
            case "a":point+=4;break;
            case "b":point+=3;break;
            case "c":point+=2;break;
            case "d":point+=1;break;
        }
        System.out.println("Point Adalah : "+point);




//        String strX = "o";
//        if(strX.equals("a") ||
//                strX.equals("i") ||
//                strX.equals("u") ||
//                strX.equals("e") ||
//                strX.equals("o")){
//            System.out.println("Ini adalah huruf Vokal");
//        }else {
//            System.out.println("Ini adalah huruf Konsonan");
//        }
//        System.out.println(Integer.toBinaryString(15));
//        System.out.println(30 >> 1);//10100
    }
}