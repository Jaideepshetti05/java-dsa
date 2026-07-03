class Worker extends Thread {
    public void run() {
        while (true) {
            System.out.println("Daemon Running...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
}

public class DaemonThreadExample {
    public static void main(String[] args) {
        Worker w = new Worker();
        w.setDaemon(true);
        w.start();

        System.out.println("Main Thread Ends");
    }
}