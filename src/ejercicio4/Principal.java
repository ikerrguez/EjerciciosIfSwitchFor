package ejercicio4;

import java.util.Scanner;

public class Principal {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el nombre de tu pokémon");
        String nombre = sc.nextLine();
        System.out.println("Dime el nivel de tu pokémon");
        int nivelActual = sc.nextInt();
        System.out.println("¿Cuántos niveles quiere que suba?");
        int nivelSubida = sc.nextInt();

        for (int i = nivelActual+1 ; i <= nivelActual+nivelSubida; i++) {
            System.out.println(nombre + " ha subido al nivel  " + i);
        }

    }
}
