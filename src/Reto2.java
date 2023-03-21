import java. util.Scanner;

public class Reto2 {
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);

        String nomEnf;

        String nomAcu;

        String nomBby;

        double pesoBb;

        double mesesBb;

        double dosisNec;

        double edad;

        final int mes = 30;

        System.out.println("Por favor, ingrese el nombre del doctor o enfermera");

        nomEnf=leer.next();

        System.out.println("Por favor,ingrese el nombre de la madre o acudiente de la/el bebe");

    	nomAcu=leer.next();

        System.out.println("Por favor, ingrese el nombre de la/el bebe");

    	nomBby=leer.next();

    	System.out.println("Por favor, ingrese el peso de la/el bebe");

    	pesoBb=leer.nextDouble();

    	System.out.println("Por favor, ingrese los dias de nacido la/el bebe");
    	mesesBb=leer.nextDouble();

        edad= mesesBb / mes ;

        dosisNec= (pesoBb + 15) / (edad * 10) * 8 ;

        System.out.println("Señor/a doctor o enfermera " + nomEnf + "la/el bebe que atendió recientemente cuyo nombre es " + nomBby + " y es hijo de " + nomAcu + " requiere una dosis de " + dosisNec+ "Mg");

        System.out.println("Los meses de la/el bebe aatendido son " + edad);

 leer.close();

    }
}