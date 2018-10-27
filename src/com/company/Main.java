package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Dog reksio = new Dog();
//        reksio.name = "Reksio";
//        reksio.bark();

//        Dog reksio = new Dog("Reksio"); //trzeba podac imie od razu bo jest konstruktor w klasie
//        reksio.bark();
//        System.out.println(reksio.getNumberOfLegs());
//        reksio.setNumberOfLegs(3);
//        System.out.println(reksio.getNumberOfLegs());
//
//        Dog.sayHau();
        // reksio.sayHau();   //tak sie nie robi ale tez dziala - wywoluje sie klase a nie obiekt

        Kostka dicer = new Kostka(6);
        dicer.rzut();

        Osoba osoba1 = new Osoba("Anna", "Kowalska", 15, Gender.FEMALE);
        Osoba osoba2 = new Osoba("Anna", "Kowalska", 15, Gender.FEMALE);
        System.out.println(osoba1);
        System.out.println(osoba1.equals(osoba2));

        String a = new String("Java");
        String b = new String("Java");
        String c = "Java";
        String d = "Java";

        System.out.println(a == b);
        System.out.println(c == d); // ze wzgledu na optymalizacje pamiecie jezeli dwa stringi sa definiowane przez "" i maja to samo to zajmuja to samo miejsce w pamieci
       // System.out.println(a.equals(b));
//        for (int i = 0; i < 100000; i++){
//            System.out.println("a" == "a");
//        }                                     // == nie sluzy do porownywania obiektow
    }
}
