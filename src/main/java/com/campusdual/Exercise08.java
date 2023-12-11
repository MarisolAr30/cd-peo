package com.campusdual;

import com.campusdual.util.Utils;

import java.util.Scanner;
public class Exercise08 {

        //Pedir al usuario que ponga su nombre y mostrar por pantalla un mensaje de bienvenida con el

        public static void mostrarSaludo () {
            Scanner scan = new Scanner(System.in);
            String nombreUsuario;
            System.out.println("Introduce tu nombre: ");
            nombreUsuario = scan.next();
            System.out.println("Hola " + nombreUsuario + "! ¿Como estás?");

        }//mostrarSaludo

        //Pedir al usuario un número mayor que 5 y mostrar un mensaje por pantalla
        public static void pedirNumero () {
            Scanner scan = new Scanner(System.in);
            int numeroParaMostrar;
            do {
                System.out.println("Introduce un numero mayor que 5");
                numeroParaMostrar = scan.nextInt();
            } while (numeroParaMostrar < 5);
            System.out.println("El número que has escrito es: " + numeroParaMostrar);
        }

        public static void mostrarSaludoConUtils () {
            String nombreUsuario = Utils.string("Introduce tu nombre: ");
            System.out.println("Hola " + nombreUsuario + "! ¿Como estás?");
        }

        public static void pedirNumeroConUtils () {
            int numeroParaMostrar;
            do {
                numeroParaMostrar = Utils.integer("Introduce un número mayor que 5: "
                );
            } while (numeroParaMostrar < 5);
            System.out.println("El numero que has escrito es: " + numeroParaMostrar);
        }

        public static void main(String[] args) {
            mostrarSaludo();
            pedirNumero();
        }
}
