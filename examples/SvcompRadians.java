import tools.aqua.concolic.Verifier;

public class SvcompRadians {

    public static void main(String[] args) {

        double deg = Verifier.nondetDouble();
        double rad = java.lang.Math.toRadians(deg);
        if (rad >= 0) {
            System.out.println("Radians is positively radiant!");
        } else {
            assert false;
        }
    }
}