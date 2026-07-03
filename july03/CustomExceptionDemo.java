class AgeException extends Exception{
    AgeException(String msg){
        super(msg);
    }
}

public class CustomExceptionDemo {

    static void checkAge(int age) throws AgeException{
        if(age<18)
            throw new AgeException("Not Eligible");
    }

    public static void main(String[] args){

        try{
            checkAge(15);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}