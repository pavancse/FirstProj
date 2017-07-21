package learn.threads;

public class NewThread implements Runnable {
    private Thread t;

    NewThread() {
        t = new Thread(this, "Demo Thread");
        System.out.println("Child Thread" + t);
        t.start();
        System.out.println("End NewThread Constructor");
    }


    @Override
    public void run() {

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Exiting Child Thread");
    }
}
