import java.util.Arrays;
import java.util.Scanner;

public class M1920 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int A[] = new int[N];
        for(int i = 0; i < N; i ++){
            A[i] = s.nextInt();
        }
        Arrays.sort(A);

        int M = s.nextInt();
        int B[] = new int[M];
        for(int i = 0; i < M; i ++){
            B[i] = s.nextInt();
        }
        int C[] = new int[M]; // 정답

        for(int i = 0; i < M; i++){
            int start = 0;
            int end = N-1;
            while(start<=end){
                int middle = (start+end)/2;
                if(A[middle] == B[i]){
                    C[i] =1;
                    break;
                }else if(A[middle] > B[i]){
                    end = middle-1;
                }else if(A[middle] < B[i]){
                    start = middle+1;
                }
            }
        }

        for(int i = 0; i < M; i++){
            System.out.println(C[i]);
        }
    }
}
