class Worker extends Thread{

    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
    }
}

public class ThreadJoinDemo{

    public static void main(String[] args)throws Exception{

        Worker w=new Worker();

        w.start();

        w.join();

        System.out.println("Finished");
    }
}