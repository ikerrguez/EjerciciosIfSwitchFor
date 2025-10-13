package ejercicio8;
import java.util.Scanner;

public class Principal {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("*** Pokédex Interactiva ***");
            System.out.println("1. Buscar Pokémon por nombre");
            System.out.println("2. Comparar estadísticas de Pokémon");
            System.out.println("3. Salir");
            System.out.print("Elige una opción:\n> ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nombre del Pokémon:\n> ");
                    String nombre = sc.nextLine().toLowerCase();

                    switch (nombre) {
                        case "pikachu":
                            System.out.println("--- Ficha de Pikachu ---");
                            System.out.println("Tipo: Eléctrico");
                            System.out.println("Habilidad: Electricidad Estática");
                            System.out.println("Descripción: Almacena electricidad en sus mejillas y la libera en forma de potentes rayos.");
                            break;

                        case "mewtwo":
                            System.out.println("--- Ficha de Mewtwo ---");
                            System.out.println("Tipo: Psíquico");
                            System.out.println("Habilidad: Presión");
                            System.out.println("Descripción: Creado por ingeniería genética. Su poder de combate es de un nivel");
                            System.out.println("extraordinario.");
                            break;

                        case "gyarados":
                            System.out.println("--- Ficha de Gyarados ---");
                            System.out.println("Tipo: Agua / Volador");
                            System.out.println("Habilidad: Intimidación");
                            System.out.println("Descripción: Cuando se enfurece, Gyarados destruye todo lo que encuentra a su paso.");
                            break;

                        default:
                            System.out.println("Pokémon no encontrado en la Pokédex.");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("--- Comparativa Legendaria ---");
                    int ataqueGroudon = 150;
                    int defensaGroudon = 140;
                    int ataqueKyogre = 150;
                    int defensaKyogre = 90;

                    if (ataqueGroudon > ataqueKyogre) {
                        System.out.println("Ataque: Groudon (" + ataqueGroudon + ") vs Kyogre (" + ataqueKyogre + "). ¡Groudon tiene más poder de ataque!");
                    } else if (ataqueKyogre > ataqueGroudon) {
                        System.out.println("Ataque: Groudon (" + ataqueGroudon + ") vs Kyogre (" + ataqueKyogre + "). ¡Kyogre tiene más poder de ataque!");
                    } else {
                        System.out.println("Ataque: Groudon (" + ataqueGroudon + ") vs Kyogre (" + ataqueKyogre + "). ¡Tienen el mismo poder de ataque!");
                    }

                    if (defensaGroudon > defensaKyogre) {
                        System.out.println("Defensa: Groudon (" + defensaGroudon + ") vs Kyogre (" + defensaKyogre + "). ¡Groudon es mucho más resistente!");
                    } else if (defensaKyogre > defensaGroudon) {
                        System.out.println("Defensa: Groudon (" + defensaGroudon + ") vs Kyogre (" + defensaKyogre + "). ¡Kyogre es mucho más resistente!");
                    } else {
                        System.out.println("Defensa: Groudon (" + defensaGroudon + ") vs Kyogre (" + defensaKyogre + "). ¡Tienen la misma resistencia!");
                    }
                    break;

                case 3:
                    System.out.println("Cerrando la Pokédex...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elige de nuevo.");
                    break;
            }

        } while (opcion != 3);
    }
}

