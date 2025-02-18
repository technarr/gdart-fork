import tools.aqua.concolic.Verifier;

public class ByteCases {
    private static byte byteVal;
    public static void main(String[] args){
        byteVal = Verifier.nondetByte();

        // Byte type conditions (edge cases)
        if (byteVal == Byte.MIN_VALUE) {
            System.out.println("Byte is MIN_VALUE");
        } else if (byteVal == Byte.MAX_VALUE) {
            System.out.println("Byte is MAX_VALUE");
        } else if (byteVal == 0) {
            System.out.println("Byte is zero");
        }
    }
}