import java.util.Random;
import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {

        int apu = 3;
        int resultado;

        Scanner lectura = new Scanner(System.in);
        Random rnd = new Random();
        
        System.out.println("Bienvenido a piedra, papel o tijera, ¿listo para ser derrotado por la máquina?");

        while (apu>0) {

            System.out.println("La apuesta inicial es de "+apu);
            System.out.println("para empezar el juego, escoge una opción: 1 para escoger PIEDRA, 2 para escoger PAPEL, 3 para escoger TIJERA, si deseas retirarte elige 4 para SALIR");
            int opcion =lectura.nextInt();

            if (opcion == 4) {
                System.out.println("¡Que gallina!, nos vemos luego.");
                break;
            }

            int rival = rnd.nextInt(3)+1;
            String tiroPlay = "";
            String tiroRiv = "";

            switch (opcion) {
                case 1:
                tiroPlay = "piedra";
                    break;
                case 2:
                tiroPlay = "papel";
                    break;
                case 3:
                tiroPlay = "tijera";
                    break;
                default:
                    System.out.println("Esta opción no es correcta");
                    continue;
            }

            switch (rival) {
                case 1:
                tiroRiv = "piedra";
                    break;
                case 2:
                tiroRiv = "papel";
                    break;
                case 3:
                tiroRiv = "tijera";
                    break;
            }

            System.out.println("Tu tiro fue de " + tiroPlay);
            
            System.out.println("El tiro del rival fue " + tiroRiv);

            if (opcion == rival) {
                System.out.println("Vaya, han empatado, que siga la batalla");
                resultado=0;
            } else if ((opcion==1 && rival==3) || (opcion==2 && rival==1) || (opcion==3 && rival==2)) {
                System.out.println("Felicidades, has ganado.");
                resultado = 1;
            } else {
                System.out.println("Jajaja, ¡has perdido!");
                resultado = -1;
            }

            apu += resultado;

            if (apu<=0) {

                System.out.println("Ya no cuentas con saldo suficiente para la otra ronda, el juego acaba.");
            }
        }

        lectura.close();
    }
}