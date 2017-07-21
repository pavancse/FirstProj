package learn.threads;

public class MainThread {
    public static void main(String args[]) {
        NewThread ob1=new NewThread("First");
        NewThread ob2=new NewThread("Second");
        NewThread ob3=new NewThread("third");
        System.out.println("Continue Main Thread");
        Thread t = Thread.currentThread();
        t.setName("Main");
        System.out.println("Main Thread: "+t);
        try {
            ob1.t.join();
            System.out.println("End ob1");
            ob2.t.join();
            System.out.println("End ob2");
            ob3.t.join();
            System.out.println("End ob3");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Exicting Main Thread");
    }
}