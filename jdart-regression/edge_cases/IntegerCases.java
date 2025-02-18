import tools.aqua.concolic.Verifier;

public class IntegerCases {
    private static int intVal;
    public static void main(String[] args){
        intVal = Verifier.nondetInt();

        // Integer type conditions (edge cases)
        if (intVal == Integer.MIN_VALUE) {
            System.out.println("Integer is MIN_VALUE");
        } else if (intVal == Integer.MAX_VALUE) {
            System.out.println("Integer is MAX_VALUE");
        } else if (intVal == 0) {
            System.out.println("Integer is zero");
        }
    }
}