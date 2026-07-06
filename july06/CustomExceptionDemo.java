class InvalidAgeException extends Exception{

    InvalidAgeException(String msg){
        super(msg);
    }
}

public class CustomExceptionDemo{

    static void check(int age)throws InvalidAgeException{

        if(age<18)
            throw new InvalidAgeException("Not Eligible");
    }

    public static void main(String[] args){

        try{
            check(15);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}