package com.java;

public class Coche {

    protected int numPuertas = 3;

    public Coche(){
    }

    public Coche(int numPuertas){

    }

    public void incrementar(int quantity){
        this.numPuertas += quantity;
    }

}
