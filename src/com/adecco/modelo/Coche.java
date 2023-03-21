package com.adecco.modelo;

public class Coche {

    public String marca; //atributo
    public double precio;
    public int anio;
    public String color;

    //primer metodo no devuelve resultado
    //no es buena practica poner aqui lineas de la capa de presentacion es solo didactico
    public void mostrarInfo(){
        System.out.println("Marca: "+ marca);
        System.out.println("Precio: "+ precio);
        System.out.println("Color: "+ color);
        System.out.println("Año:" + anio);
    }
    //metedo con resultado Esta es la practica correcta en este caso
    public String mostrarInfor2(){
        return "Marca: "+ marca +", Precio: "+ precio +", Color: "+ color +" y Año: "+ anio;
    }
    //constructores
    //constructor vacio:
    //sobrecarga=varios constructores con mismo nombre
    public Coche(){ //buena practica para avanzados cuando usas frameworks
    }
    //constructor con parametros
    public Coche(String pMarca, double precio){
        marca = pMarca; //atributo= variable  dato de entrada
        this.precio = precio; //para q se llamen igual se usa this.

    }
    public Coche(String marca, double precio, String color, int anio) {
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.anio = anio;
    }

}
