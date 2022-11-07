import java.util.Scanner;

public class M13305 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int street [] = new int[N-1];// 도시 도시간에 거리(km)담는 통
        int price [] = new int[N];// 그 해당 도시의 주요소 가격 리터당


        for(int i= 0; i < N-1; i ++){
            street[i] = s.nextInt();
        }
        for(int i =0; i < N; i ++){
            price[i] = s.nextInt();
        }

        int iMin = 1000000000;

        for(int i =0; i < N-1; i++){
            if(price[i] <iMin)
                iMin = price[i];
        }

        int sum = 0;
        int step = 0;
        int restStreet = 0;
        int restSum = 0;

        while(price[step] != iMin){
            sum += price[step] * street[step];
            step++;
        }
        for(int i = step; i < N-1; i++){
            restStreet += street[i];
        }

        restSum = restStreet * iMin;

        sum += restSum;

        System.out.println(sum);

    }
}
