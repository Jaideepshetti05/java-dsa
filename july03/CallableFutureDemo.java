import java.util.concurrent.*;

public class CallableFutureDemo {
    public static void main(String[] args) throws Exception {

        ExecutorService service = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> 100;

        Future<Integer> future = service.submit(task);

        System.out.println("Result = " + future.get());

        service.shutdown();
    }
}