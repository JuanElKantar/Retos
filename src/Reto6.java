/*Reto 6: Realizar un programa que simule cara o sello, el usuario cuenta con 3 vidas,
 y debe tener una apuesta inicial, si se le acaban las 3 vidas preguntar si quiere jugar
  de nuevo, para poder jugar, debe apostar mas de la ganancia final. */

import java.util.Scanner;
import java.util.Random;

public class Reto6 {  /*clase */
    public static void main(String[] args) {  /*define main */

        boolean jugar = true;
        int vidas = 3;
        int ganancia = 0;
        int apu;
        int cara = 1;
        int sello = 2;
        int escoge, resultado;

        Scanner leer = new Scanner(System.in);  /*Instanciar */
        Random rand = new Random();

        
        System.out.println("Bienvenido al carisellazo virtual, cuentas con 3 vidas.");
        
        while (jugar) {
            System.out.print("Ingresa tu apuesta inicial: ");
            apu = leer.nextInt();
            
            while (vidas > 0) {
                System.out.print("Por favor escoge 1 para cara o 2 para sello: ");
                escoge = leer.nextInt();
                
                resultado=rand.nextInt(2) + 1;
                
                if (escoge==resultado) {
                    ganancia += apu;
                    System.out.println("Has ganado, tu ganancia es de $" + ganancia);
                } else {
                    ganancia -= apu;
                    vidas--;
                    System.out.println("Has perdido, tu ganancia ahora es de $" + ganancia);
                    System.out.println("Tus vidas restantes son: " + vidas);
                }
                
                if (vidas==0) {
                    System.out.println("Ha acabado el juego, tu ganancia final es de $" + ganancia);
                    
                    System.out.print("Digita j para volver a jugar, o cualquier letra para salir ");
                    String respuesta = leer.next();
                    
                    if (respuesta.equals("j")) {
                        System.out.print("para jugar otra vez, ingresa una apuesta mayor o igual a $" + ganancia + ": ");
                        apu = leer.nextInt();
                        while (apu < ganancia) {
                            System.out.print("La apuesta debe ser mayor o igual a $" + ganancia + ". Ingresa otra apuesta: ");
                            apu = leer.nextInt();
                        }
                        vidas = 3;
                        ganancia = 0;
                    } else {
                        jugar = false;
                    }
                }
            }
        }
        
        System.out.println("Gracias por jugar, te esperamos pronto");

        leer.close();
    }
}
