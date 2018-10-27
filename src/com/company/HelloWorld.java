package com.company;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello world");
        int i;
        i = 9;
        long  AgeOfUniverse = 79452974524521L;
        float a = 8.9f;
        double b = 8.9;
        char c='c';
        //boolean isJavaFun = true;
        //System.out.println(isJavaFun);
        //System.out.println(a /b );
        int pierwsza = 8;
        int druga = 3;
        //System.out.println(pierwsza /druga );
        //double x =pierwsza /druga;
        //System.out.println(x);
        //double x2 = pierwsza / (double)druga;
        //System.out.println(x2);

        //string
        String name = "Karolina";
        //System.out.println(name);

        //tablica
        int[] tablica = {1, 2, 3};
        double[] tablica2 = new double[10];
        tablica2[0]=0.9;
        //System.out.println(tablica[1]);

        int[][] tablica3 = new int[3][];
        tablica3[0] = new int[3];
        tablica3[1] = new int[2];
        tablica3[2] = new int[1];
        tablica3[1][0] = 8;
        //System.out.println(tablica3);

        //i++ - postinkrementacja
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);

        System.out.println(a !=b); //nie jest rowne

        System.out.println(true && true); //and

        System.out.println(!(true ||false)); //or
        System.out.println(!(false ||false));
        System.out.println(!(true ||true));

        System.out.println(!(b<a || false));

    }
}
