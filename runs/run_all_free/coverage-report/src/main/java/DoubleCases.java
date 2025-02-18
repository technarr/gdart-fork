import tools.aqua.concolic.Verifier;

public class DoubleCases {
    private static double doubleVal;
    public static void main(String[] args){
        doubleVal = Verifier.nondetDouble();

        if (Double.isNaN(doubleVal)) {
            System.out.println("Double is NaN");
        } else if (doubleVal == Double.POSITIVE_INFINITY) {
            System.out.println("Double is POSITIVE_INFINITY");
        } else if (doubleVal == Double.NEGATIVE_INFINITY) {
            System.out.println("Double is NEGATIVE_INFINITY");
        } else if (doubleVal == Double.MIN_VALUE) {
            System.out.println("Double is MIN_VALUE");
        } else if (doubleVal == Double.MAX_VALUE) {
            System.out.println("Double is MAX_VALUE");
        } else if (doubleVal == 0.0) {
            System.out.println("Double is zero");
        }
    }
}