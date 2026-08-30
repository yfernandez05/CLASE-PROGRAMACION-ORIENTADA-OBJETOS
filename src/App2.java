import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
        double balance = 2000;
        double montoRetira;
        String dni;
        int tipoCliente = 0; // 1 BAnca minorista, 2 Cliente privado, 3 Cliente Corporativo

        //Usar clase Scaner
        //instaciar Scaner
        Scanner scaner = new Scanner(System.in);
        //preguntar dni
        System.out.println("Ingrese su DNI: ");
        dni = scaner.nextLine(); //Almacenamos la informacion ingresada
        //preguntar Tipo cliente
        System.out.println("Ingrese su Tipo de Cliente: ");
        tipoCliente = scaner.nextInt();
        //preguntar Monto requerido
        System.out.println("Ingrese su Monto a retirar: "); 
        montoRetira = scaner.nextDouble();
        //cerrar el scanner75
        scaner.close();

        //Identificar a nuestro cliente
        switch (tipoCliente) {
            case 1:
                System.out.println("Cliente de Banca Minorista");
                break;
            case 2:
                System.out.println("Cliente Privado");
                break;
            case 3:
                System.out.println("Cliente Corporativo");
                break;
            default:
                System.out.println("Tipo de cliente no valido");
                break;
        }

        System.out.println("=====================================");
        if(balance == 0){
            System.out.println("El cliente no tiene fondos");
        }else if(montoRetira > balance){
            System.out.println("Faltan fondos para completar el retiro");
        }else {
            balance = balance - montoRetira;
            System.out.println("El nuevo balance es: " +balance);
        }
        System.out.println("\n");

        // Proceso de liquidacion
        System.out.println("========= while proceso de extraccion bancarios ========\n");
        int numeroExtractoAProcesar = 10;
        int contar = 0;
        while (contar <= numeroExtractoAProcesar) {
            System.out.println("Extracto " + contar + " procesado");
            //actualizar el contador
            contar = contar + 1; //abrebviado contar++;
        }

        System.out.println("\n========= DO While proceso de extraccion bancarios ========");
        contar = 0;
        do {
            System.out.println("Extracto " + contar + " procesado");
            contar++;
        } while (contar <= numeroExtractoAProcesar);

        System.out.println("\n========= FOR proceso de extraccion bancarios ========");
        for (int variable = 0; variable <= 10; variable++) {
            System.out.println("Extracto " + variable + " procesado");
        }

    }
}
