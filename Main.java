package com.java;

public class Main {

    public static void main(String[] args) {

        suma(10, 5, 25);

        Coche miCoche = new Coche();

        System.out.println("Número de puertras =" + " " + miCoche.numPuertas);
        miCoche.incrementar(1);
        System.out.println("Número de puertas al incrementar =" + " " + miCoche.numPuertas);

    }

    public static void suma(int a, int b, int c){

        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }




}
