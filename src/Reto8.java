import java.util.Scanner;

public class Reto8 {
    public static void main(String[] args) {


        boolean tiene = false;
        String nomApr,respuesta;


        Scanner leer = new Scanner(System.in);

        
        System.out.print("Digita el nombre completo del Aprendiz: ");
        nomApr = leer.nextLine();
        
        System.out.print("¿El aprendiz ya cuenta con Auxilio? digita 1 para Si o cualquier letra para No :");
        respuesta = leer.nextLine();

        if (respuesta.equalsIgnoreCase("1")) {
          tiene = true;
        }
        
       
        if (!tiene) {
            System.out.println("Digita la ficha de "+nomApr);
            String nomCom=leer.next();

            System.out.println("Digita el tipo de documento del aprendiz");
            String tipoDoc=leer.next();

            System.out.println("Digita el número de documento del aprendiz");
            String numDoc=leer.next();

            System.out.println("Digita el número de telefono del aprendiz");
            String telf=leer.next();

            System.out.println("Digita el correo electronico del Aprendiz");
            String correo=leer.next();

            System.out.println("Digite un segundo numero de telefono");
            String num2=leer.next();

            System.out.println("Digite a que auxilio se quiere inscribir el aprendiz: Alimentación o Ayuda de transporte");
            String auxEscogido=leer.next();

            System.out.println("El registro del Aprendiz se ha completado, estos son los datos: "+nomCom+", " +tipoDoc+ ", " +numDoc+ ", " +telf+ ", " +correo+ ", " +num2+ ", " +auxEscogido);

        } else {
            System.out.println("El estudiante " + nomApr + " ya está registrado en un auxilio");
        }
        
        leer.close();
    }
}
