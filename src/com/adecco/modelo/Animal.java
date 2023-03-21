package com.adecco.modelo;

public class Animal {
    //1. atributos
    public int numPatas;
    public String color;
    public String especie;
    public boolean peligroExtincion;

    //2.metodos
    public String comer() {
        return "El animal esta comiendo...";
    }
    //sobrecarga sobre metodos
    public String comer(String tipoComida){
        return "El animal esta comiendo "+ tipoComida;
    }

    public String correr(double km) {
        return "El animal esta corriendo " + km + " kilometros";
    }
    public String mostrarInfo() {
        return "Número de patas " + numPatas + ", color " + color+ ", especie "+ especie +
                ", peligro de extinción? " +  peligroExtincion;
    }

    //constructores
    public Animal(){

    }
    public Animal( int numPatas, String color,String especie, boolean peligroExtincion) {
        this.numPatas = numPatas;
        this.color = color;
        this.especie = especie;
        this.peligroExtincion= peligroExtincion;
    }
}