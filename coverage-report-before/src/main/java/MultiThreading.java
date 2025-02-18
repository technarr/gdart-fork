import tools.aqua.concolic.Verifier;

public class MultiThreading {
    private static int counter;

    public static void main(String[] args) {
        counter = Verifier.nondetInt();
        Thread t1 = new Thread(() -> counter++);
        Thread t2 = new Thread(() -> counter++);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final counter: " + counter);
    }
}