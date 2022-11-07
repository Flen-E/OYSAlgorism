import java.util.Arrays;
import java.util.Scanner;

public class M2559 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int K = s.nextInt();
        int M [] = new int[N];
        int sum [] = new int[N-K+1];

        for(int i= 0 ; i < N; i++){
            M[i] = s.nextInt();
        }
        for(int i = 0; i < K; i++){
           sum[0] +=M[i];
        }
        for(int i = 1; i <N-K+1; i++){
            sum[i] = sum[i-1] + M[i+K-1]- M[i-1];
        }
        Arrays.sort(sum);
        System.out.println(sum[N-K]);

    }

}
