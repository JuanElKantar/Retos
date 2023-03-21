import java.util.Scanner;
public class Reto5 {
    
    public static void main(String[] args) {
        
String nomCliente,nomEmpleado,nomProducto;
double preProducto,pagoCliente;
int cantProductos;


        Scanner leer = new Scanner(System.in);

          
        System.out.print("Ingrese el nombre del empleado: ");
        nomEmpleado = leer.nextLine();

        System.out.print("Ingrese el nombre del cliente: ");
         nomCliente = leer.nextLine();

        System.out.print("Ingrese el nombre del producto: ");
        nomProducto = leer.nextLine();
        
        System.out.print("Ingrese el precio del producto: ");
         preProducto = leer.nextDouble();
        
        System.out.print("Ingrese la cantidad de productos: ");
        cantProductos = leer.nextInt();
        
        double total = preProducto * cantProductos;
        System.out.println("El total de la compra es: $" + total);
       
        System.out.print("Ingrese el monto pagado por el cliente: ");
         pagoCliente =leer.nextDouble();
        
        double necPago =  total - pagoCliente;
        double cambio=pagoCliente-total;
 
        if (pagoCliente == total) {
            System.out.println("Gracias por tu compra " + nomCliente);
        } else if (pagoCliente < total) {
            System.out.println("Para completar el pago, te hace falta $"+necPago);
        } else {
            System.out.println("Su cambio es de $" +cambio+", gracias por la compra");
        }
        System.out.println("El cliente "+nomCliente+" ha sido registrado por el empleado "+nomEmpleado);
        leer.close();
    }
    
}
