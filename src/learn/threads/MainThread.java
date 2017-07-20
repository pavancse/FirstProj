package learn.threads;

public class MainThread {
    public static void main(String args[]) {
        Thread t = Thread.currentThread();
        System.out.println(t);
        t.setName("Main");
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
