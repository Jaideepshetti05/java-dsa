class CounterThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {

            System.out.println(
                    Thread.currentThread().getName() + " : " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadCounter {

    public static void main(String[] args) {

        CounterThread t1 = new CounterThread();
        CounterThread t2 = new CounterThread();

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();
    }
}