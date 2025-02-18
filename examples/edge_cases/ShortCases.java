import tools.aqua.concolic.Verifier;

public class ShortCases {
    private static short shortVal;
    public static void main(String[] args){
        shortVal = Verifier.nondetShort();

        // Short type conditions (edge cases)
        if (shortVal == Short.MIN_VALUE) {
            System.out.println("Short is MIN_VALUE");
        } else if (shortVal == Short.MAX_VALUE) {
            System.out.println("Short is MAX_VALUE");
        } else if (shortVal == 0) {
            System.out.println("Short is zero");
        }
    }
}