package ejercicio1;

import java.util.Scanner;

public class Principal {
    static void main() {
        System.out.println("Dime la velocidad actual de tu coche en km/h");
        Scanner sc = new Scanner(System.in);
        int velocidad = sc.nextInt();
        boolean esExcesoVelocidad= true;
        if (velocidad >120) {
            System.out.println("¡Atención! Vas a una velocidad excesiva. ¡Riesgo de multa!");
        }else{
        esExcesoVelocidad=false;{
                System.out.println("Velocidad adecuada. !Sigue así y conduce con seguridad!");
            }
        }
    }
}
