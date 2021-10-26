package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın
        //not ortalamaıs hesaplama
        Scanner input=new Scanner(System.in);
        System.out.println("not hesaplama");
        System.out.println("lütfen 2 adet mateamtik notunuzu yazınız");
        float math1,math2,mathAverage,tur1,tur2,turAverage,allAverage;

        math1=input.nextFloat();
        math2=input.nextFloat();

        System.out.println("lütfen iki adet türkçe notunuzu yaznız");
        tur1=input.nextFloat();
        tur2=input.nextFloat();

        mathAverage=(math1+math2)/2;
        turAverage=(tur1+tur2)/2;
        allAverage=(turAverage+mathAverage)/2;

        if (math1>0 && math1<100 && math2>0 && math2<100 && tur2>0 && tur2<100 && tur1>0 && tur1<100){
            System.out.println("matematik ortalamanız : "+ mathAverage +"\ntürkçe ortalamanız : "+turAverage);
            if (allAverage<50){
                System.out.println("sınıfta kaldınız");
            }
        }else {
            System.out.println("lütfen 0 ile 100 arasında bir sayı giriniz");
        }










    }
}
