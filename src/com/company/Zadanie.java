package com.company;

import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {
        int a = 0;
        //if
//        if (a > 0 && a < 5){
//            System.out.println("hura");
//        }else if (a > 5 && a < 10){
//            System.out.println("wow");
//        } else {
//            System.out.println("no tak");
//        }
        //switch
//        switch(a){
//            case 1:
//                System.out.println("1");
//                break;
//            case 2:
//                System.out.println("2");
//                break;
//            case 3:
//                System.out.println("3");
//                break;
//            default:
//                System.out.println("9");
//        }

        //while - wykonuje sie dopoki warunek jest prawdziwy
//        while (a < 10){
//            System.out.println(a);
//            a++;
//        }

        //do while - wykona sie przynajmniej raz
//        do {
//            System.out.println(a);
//            a++;
//        } while (a<10);
//        //pierwszy program
//        System.out.println("Podaj pierwsza liczbe");
//        Scanner scanner = new Scanner(System.in);
//        int liczba = scanner.nextInt();
//
//        System.out.println("Podaj druga liczbe");
//
//        int liczba2 = scanner.nextInt();
//        if (liczba2 == 0){
//            System.out.println("Nie dziel przez 0!!");
//            System.out.println("Podaj druga liczbe");
//            liczba2 = scanner.nextInt();
//        }
//        double wynik = liczba / (double) liczba2;
//        System.out.println(wynik);
//        //System.out.println("Wybrales " + liczba);
        String[] tablica = {"Ania", "Kasia", "Gosia"};
        int sum = 0;
        for (int i = 0; i < tablica.length; i++){
            System.out.println(tablica[i].toLowerCase());
            System.out.println(tablica[i].length());
            sum = sum + tablica[i].length(); // sum += tablica[1].length()
        }
        System.out.println(sum);
    }
}
