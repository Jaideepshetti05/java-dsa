public class DecimalToRoman {

    public static void main(String[] args){

        int num=1994;

        int[] val={1000,900,500,400,100,90,50,40,10,9,5,4,1};

        String[] sym={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<val.length;i++){

            while(num>=val[i]){

                sb.append(sym[i]);

                num-=val[i];
            }
        }

        System.out.println(sb);
    }
}