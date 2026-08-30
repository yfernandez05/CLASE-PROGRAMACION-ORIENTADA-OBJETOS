import java.util.Random;

public class App3 {
    public static void main(String[] args) {
        String cadena = "Bienvenidos a la clase de Tecnicas de POO";
        char letra = 'B';

        //obtener un solo caracter especfcando la posicion
        System.out.println(cadena.charAt(0));

        //tamaño de cadena
        System.out.println(cadena.length());

        // Colocar el texto en mayus
        System.out.println(cadena.toUpperCase());

        // Colocar el texto en minus
        System.out.println(cadena.toLowerCase());

        // Substring paar obtener parte de la cadena dentro de un rango incio y final
        System.out.println(cadena.substring(10, 20));

        // contains verifica si existe el texto dentro de la cadena
        System.out.println(cadena.contains("clase"));

        // remplaza parte de la palabara de la cadena original
        System.out.println(cadena.replace("clase", "sesion"));
        
        // eliminar los epacion al incio y final
        String cadena2 = " Hola    mi  nombre es  ";
        System.out.println(cadena2.trim());

        // == igual compara espacio de memorioa
        // para comprar contenido de string se usa  equals
        String cadena3 = "Yhonatan";
        String cadena4 = "Yhonatan";
        String cadena5 = new String("Yhonatan");
        System.out.println(cadena3 == cadena4);
        System.out.println(cadena3 == cadena5);
        System.out.println(cadena3.equals(cadena5));

        //usando la clase random
        Random aleatorio = new Random(); //instanciamos
        // Generar un valor random
        System.out.println(aleatorio.nextInt(0, 50));
        System.out.println(aleatorio.nextBoolean());
        System.out.println(aleatorio.nextDouble());

        // Clase Math
        System.out.println(Math.pow(12, 2));
        System.out.println(Math.sqrt(144));
        System.out.println(Math.round(10.3));
        System.out.println(Math.floor(10.8));
        System.out.println(Math.ceil(10.2));
        System.out.println(Math.E);

        //Clase 2 terminanda
    }
}
