package ejercicio7;

import java.util.Scanner;

public class Principal {
    static void main() {
        System.out.println("¡COMIENZA LA CARRERA DE DRAG DE 400 METROS!");
        Scanner sc = new Scanner(System.in);

        String coche1 = "Muscle Car";
        double velocidad1 = 0.0;
        double velocidadNueva1 = 0.0;
        double distancia1 = 0.0;
        double distanciaNueva1 = 0.0;
        double aceleracion1 = 5.5;

        String coche2 = "Deportivo japonés";
        double velocidad2 = 0.0;
        double velocidadNueva2 = 0.0;
        double distancia2 = 0.0;
        double distanciaNueva2 = 0.0;
        double aceleracion2 = 6.0;

        for (int i = 1; i <= 15; i++) {
            velocidadNueva1 += velocidad1 + aceleracion1;
            velocidadNueva2 += velocidad2 + aceleracion2;
            distanciaNueva1 += distancia1 + velocidadNueva1;
            distanciaNueva2 += distancia2 + velocidadNueva2;
            System.out.println("En el segundo " + i + " : " + coche1 + " ha recorrido " + distanciaNueva1 + " metros  | " + coche2 + " ha recorrido " + distanciaNueva2 + " metros");


            if (distancia1 >= 400 || distancia2 >= 400) {
                if (distancia1 >= distancia2) {
                    System.out.println("Gana el Muscle Car");
                }else if (distancia2 >= distancia1) {
                    System.out.println("Gana el Deportivo Japonés");
                }else{
                    System.out.println("Empate");
                }
                break;

            }

        }


    }
}









