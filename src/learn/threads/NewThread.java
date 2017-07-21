package learn.threads;

public class NewThread implements Runnable {
    public Thread t;
    String threadName = "";

    NewThread(String name) {
        threadName = name;
        t = new Thread(this, threadName);
        System.out.println("Child Thread" + t);
        t.start();
        System.out.println("End " + t.getName() + "NewThread Constructor");
    }


    @Override
    public void run() {

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(threadName+" Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Exiting " + threadName + "Thread");
    }
}
