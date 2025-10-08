package ejercicio2;

import java.util.Scanner;

public class Principal {
    static void main() {
        System.out.println("¡Bienvenido al mundo del fútbol!");
        System.out.println("Dime el nombre de un jugador");
        Scanner sc = new Scanner(System.in);
        String jugador = sc.nextLine();
        System.out.println("Dime el número de partidos que jugó");
        double partidos = sc.nextInt();
        System.out.println("Dime el número de goles que marcó");
        double goles = sc.nextInt();

        if (partidos >= 1) {

            double promedio = (goles / partidos);

            if (promedio >= 0.8) {
                System.out.printf("El jugador " + jugador + " tiene un promedio de %.2f%n ", +promedio);
                System.out.println("Rendimiento bota de oro");

            } else if (promedio >= 0.5 || promedio <= 0.8) {
                System.out.printf("El jugador " + jugador + " tiene un promedio de %.2f%n ", +promedio);
                System.out.println("Muy buen rendimiento. ¡Es un gran goleador!");
            } else if (promedio <= 0.5 || promedio > 0) {
                System.out.printf("El jugador " + jugador + " tiene un promedio de %.2f%n ", +promedio);
                System.out.println("Necesita mejorar su promedio, pero sigue trabajando");

            }
        } else {
            System.out.println("No se puede evaluar el rendimiento sin haber jugador partidos");
        }
    }
}
