package com.campusdual;

public class Exercise02 {

    public static void main(String[] args) {
        // Área de un circulo = PI * r * r
        // Longitud de una circunferencia = PI * 2 * r
        // Área de un cuadrado = lado * lado

        double r = 7;
        double lado = 3.5;

        System.out.print("Área del circulo: ");
        System.out.println(Math.PI*Math.pow(7,2));
        System.out.print("Longitud de una circunferencia: ");
        System.out.println(Math.PI*2*r);
        System.out.print("Área de un cuadrado: ");
        System.out.println(Math.pow(lado,2));

    }
}
