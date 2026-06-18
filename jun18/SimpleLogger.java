import java.io.FileWriter;

public class SimpleLogger {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("log.txt", true);
        fw.write("Application Started\n");
        fw.close();
        System.out.println("Log Written");
    }
}