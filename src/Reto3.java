/*Realizar un programa que simule cara y sello, y que su apuesta vaya aumentando si gana,
 o disminuyendo si pierde. */


import java.util.Scanner;
import java.util.Random;

public class Reto3 {           /*clase */
    public static void main(String[] args) {   /*define main */

    int ganancia = 0;
    int apu = 0;
    int escoge = 0;
    int resultado;

    Scanner leer = new Scanner(System.in);  /*Instanciamos */
    Random rand = new Random();

    System.out.println("Bienvenido al carisellazo virtual");

    System.out.print("Ingresa tu apuesta inicial: ");
    apu = leer.nextInt();

    while (apu > 0) {
        System.out.println("Por favor escoge 1 para cara o 2 para sello: ");
        escoge = leer.nextInt();

        resultado = rand.nextInt(2) + 1;

        if (escoge == resultado) {
            ganancia += apu;
            System.out.println("Has ganado, tu ganancia es de $" + ganancia);
        } else {
            ganancia -= apu;
            System.out.println("Has perdido, tu ganancia ahora es de $" + ganancia);
        }

        System.out.print("Ingresa tu siguiente apuesta (0 para salir): ");
        apu = leer.nextInt();
    }

    System.out.println("Gracias por jugar, te esperamos pronto");

    leer.close();
}
}
