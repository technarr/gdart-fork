import tools.aqua.concolic.Verifier;

public class StringCases {
    private static String stringVal;
    public static void main(String[] args){
        stringVal = Verifier.nondetString();

        if ("".equals(stringVal)) {
            System.out.println("String is empty");
        } else if (stringVal == null) {
            System.out.println("String is null");
        } else if ("a".equals(stringVal)) {
            System.out.println("String is 'a'");
        } else {
            System.out.println("String is: " + stringVal);
        }
    }
}