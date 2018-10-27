package com.company;

public class Dog {
    String name;
    private int numberOfLegs; //kwantyfikator dostepu, uzytkownik nie bedzie mogl tego zmienic ani wydrukowac


    // konstruktor sluzy do inicjalizacji obiektu - nowostworzony obiekt bedzie mial takie cechy
    public Dog() {
        this.numberOfLegs = 4;
    }

    public Dog(String name) {
        this();
        this.name = name;
    }

    public void bark(){
        System.out.println("hau hau");
    }
// getter stworzony po to zeby mozna bylo wydrukowac wartosc ktora ma zablokowany dostep
    public int getNumberOfLegs() {
        return numberOfLegs;
    }
//setter jest po to aby mozna bylo zmieniac wartosc zmiennej o zablokowanym dostepie
    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
//hermetyzacja - ukrywanie mozliwych opcji, po to aby byl jak najmniejszy dostep do zmian - do getterow i setterow mozna dodawac warunki

// metoda statyczna - dostepna dla wszytskich obiektow w klasie
    public static void sayHau(){
        System.out.println("hau");
    }


}
