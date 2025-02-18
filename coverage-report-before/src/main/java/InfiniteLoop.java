import tools.aqua.concolic.Verifier;

public class InfiniteLoop {
    private static int i;
    public static void main(String[] args) {
        i = Verifier.nondetInt();
        if(i == Integer.MAX_VALUE) {
            while (true) {
                i++; //Timeout erzwingen für Jacoco
            }
        }
    }

}