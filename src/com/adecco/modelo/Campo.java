package com.adecco.modelo;

public class Campo {

    public int numero;

    public void incrementar(){
        numero++;
    }
    public String mostrarinformacion(){
        return "el  numero incremenado es "+ numero;
    }

    public Campo(){

    }
    public Campo( int numero) {
        this.numero = numero;
    }
}
