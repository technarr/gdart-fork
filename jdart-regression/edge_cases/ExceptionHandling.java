import tools.aqua.concolic.Verifier;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a = Verifier.nondetInt();
        int b = Verifier.nondetInt();

        try {
            int result = a / b; // May throw ArithmeticException for b == 0
        } catch (ArithmeticException e) {
            // sollte eig. laufen; fehlerhafte Coverage mit in BA reinnehmen; warten auf Malte
            System.out.println("Division by zero");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
