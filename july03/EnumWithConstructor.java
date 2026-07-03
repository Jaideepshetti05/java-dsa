enum Level {
    LOW(1), MEDIUM(2), HIGH(3);

    private int code;

    Level(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }
}

public class EnumWithConstructor {
    public static void main(String[] args) {
        for(Level l : Level.values()){
            System.out.println(l + " -> " + l.getCode());
        }
    }
}