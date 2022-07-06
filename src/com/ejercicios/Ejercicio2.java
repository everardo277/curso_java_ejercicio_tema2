package com.ejercicios;

public class Ejercicio2 {

    public static void main(String[] args) {

        double precioIva = precioIva(12.75);
        System.out.println("El precio mas iva es de : " + precioIva);
    }

    static double precioIva(double precio){
        double iva = 1.21;
        return precio * iva ;
    }
}
