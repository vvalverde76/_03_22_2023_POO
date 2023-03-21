package com.adecco.presentacion;

 import com.adecco.modelo.Animal;
 import com.adecco.modelo.Coche;
 import com.adecco.modelo.Campo;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        variables();
        metodo_poo();
        crearObjetosAnimal();
        incrementarCampo();

    }

    private static void incrementarCampo() {
        Campo num1 = new Campo();
    }


    private static void crearObjetosAnimal() {
        //instanciar la clase
        Animal a1 = new Animal();
        a1.numPatas = 4;
        a1.color = "negro";
        a1.especie = "mamífero";
        a1.peligroExtincion = false;

        System.out.println(a1.comer());
        System.out.println(a1.comer(" carne"));
        System.out.println(a1.correr(2));
        System.out.println(a1.mostrarInfo());

        Animal a2 = new Animal();
        a2.numPatas = 2;
        a2.color = "blanco";
        a2.especie = "ave";
        a2.peligroExtincion = false;
        System.out.println(a2.comer());
        System.out.println(a2.correr(5));
        System.out.println(a2.mostrarInfo());

        Animal a3 = new Animal(8,"negro","insecto",false);
        System.out.println(a3.mostrarInfo());
    }

    private static void metodo_poo() {
        Coche c1 = new Coche();
        c1.marca = "Toyota";
        c1.color = "Gris";
        c1.precio = 60_000.0;
        c1.anio = 2023;
        //System.out.println("La marca del coche es " + c1.marca);
       // System.out.println("El color del coche es " +  c1.color);
       // System.out.println("El precio  del coche es " + c1.precio);
        //System.out.println("El año de fabricacion  del coche es " + c1.anio);
        c1.mostrarInfo();
        System.out.println(c1.mostrarInfor2());

        Coche c2 = new Coche();
        c2.marca = "Renault";
        c2.color = "Rojo";
        c2.precio = 45_000.0;
        c2.anio = 2022;
        //System.out.println("La marca del coche2 es " + c2.marca);
        //System.out.println("El color del coche2 es " +  c2.color);
       // System.out.println("El precio  del coche2 es " + c2.precio);
        System.out.println("El año de fabricación  del coche2 es " + c2.anio);
        c2.mostrarInfo();
        System.out.println(c2.mostrarInfor2());
        //nuevo objeto
        Coche c3 = new Coche("Seat",45000);
        System.out.println(c3.mostrarInfor2());

        Coche c4 = new Coche ("Fiat",44000.9,"Metalizado",2023);
        System.out.println(c4.mostrarInfor2());
    }

    private static void variables() {
        //Tipos de variables
        //Tipo de variables enteras
        byte vByte = 7;
        short vShort = 123;
        int vInt = 123_123;
        long vLong = 123_123L;
        //Tipo de variables con decimales
        float vFloat = 123.45f;
        double vDouble = 123_123.898;
        char vChar = 'c';
        boolean vBoolean = true;

        System.out.println("Valor variable int " + vInt);
        System.out.println("Valor variable byte " + vByte);
        System.out.println("Valor variable short " + vShort);
        System.out.println("Valor variable long " + vLong);

        String vString = "Hola mundo";
        System.out.println(vString);

        Integer vInteger = 500;
        System.out.println("Tipo envolvente de int-> Integer " + vInteger);
        Character vCharacter = 'c';
        System.out.println("Tipo envolvente de char-> Character " + vCharacter);
        Byte vByteE = 5;
        System.out.println("Tipo envolvente de byte-> Byte " + vByteE);
    }
    
} 
//comentarios con atajo con control / del teclado numerico//