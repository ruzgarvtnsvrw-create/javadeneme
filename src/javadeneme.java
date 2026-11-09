package Odevler3;

import java.util.Scanner;

public class odevasansor {

    public static void main(String[] args) {

        Scanner ruzgar = new Scanner(System.in);

        System.out.println("Dogru sayinizi girin:");
        int dogru = ruzgar.nextInt();

        System.out.println("Yanlis sayinizi girin:");
        int yanlis = ruzgar.nextInt();

        if (dogru < 0 || yanlis < 0 || dogru + yanlis > 20) {

            System.out.println("yanlis sayi girdiniz tekrar deneyin");

        } else {

            int bos = 20 - (dogru + yanlis);

            double sonuc = dogru - (yanlis / 4.0);

            System.out.println("dogru sayiniz: " + dogru);
            System.out.println("yanlis sayiniz: " + yanlis);
            System.out.println("bos sayiniz: " + bos);

            System.out.println("netiniz: " + sonuc);
            System.out.println("puanin: " + (sonuc * 5));

            System.out.println("islem bitti kolay gelsin");

        }

        
    }
}
