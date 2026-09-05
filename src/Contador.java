public class Contador {
    private static int total = 0;

    public Contador(){
        total = total + 1; //total ++1
    }

    public static int getTotal(){
        return total;
    }
}
