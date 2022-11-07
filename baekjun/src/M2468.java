import java.util.Scanner;

public class M2468 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt(); //nxn
        int height[][] = new int[N+2][N+2];
        int maxCount = 0;

        for(int i = 1; i < N+1; i++){
            for(int j = 1; j < N+1; j++){
                height[i][j] = s.nextInt();
            }
        }

        for(int h = 1; h < 101; h++){
            int safeZone[][] = new int[N][N];
            int checked[][] = new int[N][N];
            int count = 0;
            for(int i = 1; i < N+1; i++){
                for(int j = 1; j < N+1; j++){
                   if(height[i][j] >=h)
                       safeZone[i][j] = 1;
                }
            }
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){

                }
            }



        }

    }


}