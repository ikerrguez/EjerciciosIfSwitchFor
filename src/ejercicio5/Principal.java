package ejercicio5;

import java.sql.SQLOutput;

public class Principal {
    static void main() {
        System.out.println("¡Bienvenidos a la mejor batalla de Pókemons!");
        System.out.println("--------------------------------------------");
        int vidaPikachu = 100;
        int ataquePikachu = 55;
        int vidaGengar = 120;
        int ataqueGengar = 50;

        for (int i = 3; i > 0; i--) {
            System.out.println("Turno restante: " + i);
            vidaGengar -= ataquePikachu;
            System.out.println("Pikachu ataca a Gengar. Vida de Gengar ahora es: " + vidaGengar);
            vidaPikachu -= ataqueGengar;
            System.out.println("Gengar ataca a Pikachu. Vida de Pikachu ahora es: " + vidaPikachu);
            System.out.println("-------------------------------");

            if (vidaGengar <= 0) {
                System.out.println("Gengar se ha debilitado");
                break;
            } else if (vidaPikachu <= 0) {
                System.out.println("Pikachu se ha debilitado");
                break;
            }
                if (i==0) {
                    System.out.println("No hay más turnos");
                }
        }
        System.out.println("FIN DEL COMBATE");


            if (vidaPikachu > vidaGengar) {
                System.out.println("Pikachu ha ganado");
                System.out.println("El ganador es Pikachu");
            }else if (vidaGengar > vidaPikachu) {
                System.out.println("Gengar ha ganado");
                System.out.println("El ganador es Gengar");
            }else if (vidaPikachu == vidaGengar) {
                System.out.println("Empate");
            }
















    }
}
