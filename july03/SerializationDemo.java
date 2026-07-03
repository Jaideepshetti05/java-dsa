import java.io.*;

class Student implements Serializable{
    int id=1;
    String name="John";
}

public class SerializationDemo{
    public static void main(String[] args)throws Exception{

        Student s=new Student();

        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("student.ser"));

        out.writeObject(s);

        out.close();

        System.out.println("Serialized");
    }
}