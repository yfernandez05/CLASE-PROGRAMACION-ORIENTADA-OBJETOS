public class App6 {
    
    public static void main(String[] args) {
        System.out.println("Inicio del programa");
        int[] arr = new int[3];
        /* System.out.println(arr[5]); */ // causa ArrayIndexOutOfBoundsException
        
        try {
            System.out.println(arr[5]);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        System.out.println("========== Fin de Exepcion ==========");
    }
}
