package semana3;
import java.util.Scanner;

public class Exepcion {
    
    public static void main(String[] args) {
        String valor;
        int numero;
        double resultado = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un valor: ");
        try {
            valor = scanner.next(); //numero
            numero = Integer.parseInt(valor);// Podria suceder un NumberFormatException
            resultado = 1000/numero; // aqui priamos tener un ArithmeticException
        } catch (NumberFormatException | ArithmeticException ex) {
            System.out.println("Ha ingresado un valor no correcto, se requiere un valor entero" + ex);
        } catch(Exception e){
            System.out.println("Ha ocurrido un error: " + e);
        } finally{
            scanner.close();
        }

        System.out.println("Ejecuta proceso A");
        System.out.println("Ejecuta proceso B");
        System.out.println("Ejecuta proceso C");
        System.out.println("El resultado final es: " + resultado);
    }

}
