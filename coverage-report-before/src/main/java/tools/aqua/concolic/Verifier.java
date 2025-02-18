package tools.aqua.concolic;

import java.util.Random;

public class Verifier {

    public static final Random RANDOM = new Random();

    public static int nondetInt() {
        return RANDOM.nextInt();
    }
    public static String nondetString() {
        return new String();
    }
    public static Float nondetFloat() {
        return RANDOM.nextFloat();
    }

    public static Double nondetDouble() {
        return RANDOM.nextDouble();
    }

    public static boolean nondetBoolean() {
        return RANDOM.nextBoolean();
    }

    public static byte nondetByte(){
        return (byte) RANDOM.nextInt();
    }
    public static char nondetChar() {
        return (char) RANDOM.nextInt(62);
    }

    public static long nondetLong() {
        return RANDOM.nextLong();
    }

    public static short nondetShort() {
        return (short) RANDOM.nextInt(Short.MAX_VALUE + 1);
    }
}
