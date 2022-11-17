
import java.util.ArrayList;
import java.util.Scanner;

public class M1929 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int min = s.nextInt();
        int max = s.nextInt();

        ArrayList<Integer> decimal = new ArrayList<>();




        for(int i = min; i <= max; i++ ){
            if(i == 2)
                decimal.add(2);
            if(i == 3)
                decimal.add(3);
            for(int j = 2; j <= (int)Math.sqrt(i); j++){
                if(i % j ==0){
                    break;
                }
                if(j ==(int)Math.sqrt(i))
                    decimal.add(i);
            }
        }
        for(int i = 0; i < decimal.size(); i++){
            System.out.println(decimal.get(i));
        }

    }
}
