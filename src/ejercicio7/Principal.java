package ejercicio7;

import java.util.Scanner;

public class Principal {
    static void main() {

        String coche1 = "Muscle Car";
        String coche2 = "Deportivo Japonés";

        double velocidad1 = 0.0;
        double velocidad2 = 0.0;
        double distancia1 = 0.0;
        double distancia2 = 0.0;

        double aceleracion1 = 5.5;
        double aceleracion2 = 6.0;
        double meta = 400.0;

        System.out.println("¡COMIENZA LA CARRERA DE DRAG DE 400 METROS!");

        boolean coche1Cruzo = false;
        boolean coche2Cruzo = false;

        for (int segundo = 1; segundo <= 15; segundo++) {

            velocidad1 += aceleracion1;
            velocidad2 += aceleracion2;

            distancia1 += velocidad1;
            distancia2 += velocidad2;

            System.out.println("Segundo " + segundo + ": " + coche1 + " ha recorrido " + distancia1 + " metros | " + coche2 + " ha recorrido " + distancia2 + " metros");


            if (distancia1 >= meta && !coche1Cruzo) {
                System.out.println("¡El " + coche1 + " ha cruzado la meta!");
                coche1Cruzo = true;
            }
            if (distancia2 >= meta && !coche2Cruzo) {
                System.out.println("¡El " + coche2 + " ha cruzado la meta!");
                coche2Cruzo = true;
            }

            if (coche1Cruzo && coche2Cruzo) {
                break;
            }
        }

        System.out.print("¡FIN DE LA CARRERA! ");
        if (distancia1 > distancia2) {
            System.out.println("El ganador es el " + coche1 + ".");
        } else if (distancia2 > distancia1) {
            System.out.println("El ganador es el " + coche2 + ".");
        } else {
            System.out.println("¡Empate!");
        }
    }
}