package day02_variables_Scanner;

import java.util.Scanner;


public class C06_Scanner {

    public static void main(String[] args) {

        // Kullanicidan bir sayi isteyin
        // ve sayinin karesini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Karesini almak istediginiz sayiyi giriniz");

        double girilenSayi = scan.nextDouble();

        System.out.println("Girdiginiz sayinin karesi : " + girilenSayi*girilenSayi);
    }
}
