import java.math.BigInteger;
import java.util.Scanner;

public class m10757 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

/*        BigInteger a = new BigInteger(s.next());
        BigInteger b = new BigInteger(s.next());
        System.out.println(a.add(b));*/


        String a = s.next();
        String b = s.next();

        int length_a = a.length();
        int length_b = b.length();

        int sum_length = length_a > length_b? length_a : length_b;

        int eleA [] = new int [sum_length]; //942 ->? 249
        int eleB [] = new int [sum_length]; // 39 ->  930

        int sum[]= new int [sum_length+1]; //더할장소

        for(int i = 0; i < a.length(); i++,length_a--){
            eleA[i] = Character.getNumericValue(a.charAt(length_a-1));
        }
        for(int i = 0; i < b.length(); i++,length_b--){
            eleB[i] = Character.getNumericValue(b.charAt(length_b-1));
        }

        int count = 0; //올림수
        for(int i =0; i <sum_length; i++){
            if((eleA[i]+eleB[i]+count) >9){ // 13
                sum[i] = (eleA[i] + eleB[i] +count)-10; // 3
                count = 0; //위에서 count를 썻으니깐
                count++; // 1이 올라가
            }else{
                sum[i] = (eleA[i] + eleB[i] +count);
                count =0;
            }
            if(i == sum_length-1){
                if(count !=0)
                    sum[i+1] = 1;
            }
        }

        if(sum[sum_length] ==1)
            System.out.print(1);

        for(int i =sum_length-1; i >=0; i--){
            System.out.print(sum[i]);
        }

    }
}
