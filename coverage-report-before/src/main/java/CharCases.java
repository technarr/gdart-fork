import tools.aqua.concolic.Verifier;

public class CharCases {
    private static char charVal;
    public static void main(String[] args){
        charVal = Verifier.nondetChar();

        // Character type conditions (edge cases)
        if (charVal == Character.MIN_VALUE) {
            System.out.println("Character is MIN_VALUE (\\u0000)");
        } else if (charVal == Character.MAX_VALUE) {
            System.out.println("Character is MAX_VALUE (\\uffff)");
        } else if (Character.isUpperCase(charVal)) {
            System.out.println("Character is uppercase");
        } else if (Character.isLowerCase(charVal)) {
            System.out.println("Character is lowercase");
        }
    }
}