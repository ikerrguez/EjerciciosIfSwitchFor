package ejercicio3;

import java.util.Scanner;

public class Principal {
    static void main() {
        System.out.println("Bienvenido al cine");
        System.out.println("Escoge un director escribiendo su nombre");
        System.out.println("Christopher Nolan/ Quentin Tarantino/ Guillermo del Toro ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del director");
        String director = sc.nextLine();
        switch (director) {
            case "Christopher Nolan":
                System.out.println("Te recomiendo ver Inception");
                System.out.println("¿Te gustan las películas de ciencia ficción? (Si/No");
                String respuesta = sc.nextLine();
                if (respuesta.equals("Si")) {
                    System.out.println("Genial. Disfrutarás de sus mundos complejos");
                } else {
                    System.out.println("No te preocupes. La acción y la trama también son excelentes");
                }
                break;
            case "Quentin Tarantino":
                System.out.println("Te recomiendo ver Pulp Fiction");
                System.out.println("¿Te gustan los diálogos ingeniosos? (Si/No)");
                String respuesta2 = sc.nextLine();
                if (respuesta2.equals("Si")) {
                    System.out.println("Perfecto. Te encantará el guión");
                } else {
                    System.out.println("No te preocupes. La acción y la trama también son excelentes");
                }
                break;
            case "Guillermo del Toro":
                System.out.println("Te recomiendo ver El laberinto del Fauno");
                System.out.println("Te gustan las historias de fantasía oscura? (Si/No)");
                String respuesta3 = sc.nextLine();
                if (respuesta3.equals("Si")) {
                    System.out.println("Te sumergirás en un mundo mágico e inolvidable");
                } else {
                    System.out.println("Puedes probar con Pacific Rim para una dosis de acción con monstruos gigantes");
                }
                break;

            default:
                System.out.println("Director no encontrado en nuestra base de datos");
                break;
        }
    }
}
