import tools.aqua.concolic.Verifier;

public class FloatCases {
    private static float floatVal;
    public static void main(String[] args){
        floatVal = Verifier.nondetFloat();

        // Float type conditions (edge cases)
        if (Float.isNaN(floatVal)) {
            System.out.println("Float is NaN");
        } else if (floatVal == Float.POSITIVE_INFINITY) {
            System.out.println("Float is POSITIVE_INFINITY");
        } else if (floatVal == Float.NEGATIVE_INFINITY) {
            System.out.println("Float is NEGATIVE_INFINITY");
        } else if (floatVal == Float.MIN_VALUE) {
            System.out.println("Float is MIN_VALUE");
        } else if (floatVal == Float.MAX_VALUE) {
            System.out.println("Float is MAX_VALUE");
        } else if (floatVal == 0.0f) {
            System.out.println("Float is zero");
        }
    }
}