package ejercicio6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Principal {
    static void main() {
        System.out.println("Bienvenido al juego de adivinanzas");
        Scanner sc = new Scanner(System.in);
        System.out.println("Tienes 3 intentos para advinar al protagonista de la película");
        String pelicula = "Indiana Jones y la última cruzada";
        String actor = "Harrison Ford";
        boolean haAdivinado = false;
        System.out.println("La película es -Indiana Jones y la última cruzada- y tienes 3 intentos para adivinar al protagonista ");

        for (int i = 3; i >= 0; i--) {
            System.out.println("Escribe el nombre del actor");
            String respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase(actor)) {
                haAdivinado = true;
                System.out.println("Has acertado el actor. Enhorabuena");
                break;
            } else if (i == 3) {
                System.out.println("Fallaste en el primer intento");
                System.out.println("Has fallado");
                System.out.println("Pista 1. El personaje lleva un sombrero y un látigo");
            } else if (i == 2) {
                System.out.println("Fallaste en el segundo intento");
                System.out.println("Has fallado");
                System.out.println("Pista 2. Es famoso por pilotar el Halcón Milenario en otra saga");
            } else if (i == 1) {
                System.out.println("Fallaste en el último intento");
                System.out.println("Has fallado");
                System.out.println("No hace falta dar más pistas, el juego termina");
                break;
            }

            }
        if (haAdivinado == false) {
            System.out.println("Perdiste. El actor era " + actor);

        }


    }}
