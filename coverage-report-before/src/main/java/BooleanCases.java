import tools.aqua.concolic.Verifier;

public class BooleanCases {
    private static boolean boolVal;
    public static void main(String[] args){
        boolVal = Verifier.nondetBoolean();

        // Boolean type conditions
        if(boolVal) {
            System.out.println("Boolean is true");
        } else {
            System.out.println("Boolean is false");
        }
    }
}