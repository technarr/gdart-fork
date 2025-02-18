import tools.aqua.concolic.Verifier;

public class LongCases {
    private static long longVal;
    public static void main(String[] args){
        longVal = Verifier.nondetLong();

        // Long type conditions (edge cases)
        if (longVal == Long.MIN_VALUE) {
            System.out.println("Long is MIN_VALUE");
        } else if (longVal == Long.MAX_VALUE) {
            System.out.println("Long is MAX_VALUE");
        } else if (longVal == 0L) {
            System.out.println("Long is zero");
        }
    }
}