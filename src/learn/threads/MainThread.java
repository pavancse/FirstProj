package learn.threads;

public class MainThread {
    public static void main(String args[]) {
        new NewThread();
        System.out.println("Continue Main Thread");
        Thread t = Thread.currentThread();
        System.out.println("Main Thread: "+t);
        t.setName("Main");
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main thread: "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Exicting Main Thread");
    }
}