package com.company;

import java.util.Random;

public class Kostka {
    int numberOfDices;
    int yourNumbers[];
    int sum;
    Random rand = new Random();

    public Kostka(int numberOfDices){
        this.numberOfDices = numberOfDices;
        yourNumbers = new int[numberOfDices];
    }

    public void rzut() {

        StringBuilder string = new StringBuilder("{");
        for (int i = 0; i < numberOfDices; i++) {
            int random = rand.nextInt(6-0)+1;
            yourNumbers[i] = random;
            //System.out.println(yourNumbers[i]);
            sum += yourNumbers[i];
            string.append(yourNumbers[i]+", ");
        }
        string.delete(string.lastIndexOf(","),string.length());
        string.append("}");
        System.out.println("Your sum " + sum);
        System.out.println(string); // to samo co string.toString() bo *.toString() jest dodawane do kazdego
    }

}
