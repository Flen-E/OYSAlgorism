import java.util.Scanner;

public class M2468 {
    static int safeZone[][];
    static int checked[][];
    static int x[] = {1,0,-1,0};
    static int y[] = {0,1,0,-1};
    static int N;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        N = s.nextInt(); //nxn
        int height[][] = new int[N][N];
        int maxCount = 0;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                height[i][j] = s.nextInt();
            }
        }


        for(int h = 1; h < 101; h++){
            safeZone= new int[N][N];
            checked= new int[N][N];
            int count = 0;
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                   if(height[i][j] >=h)
                       safeZone[i][j] = 1;
                }
            }
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    if(safeZone[i][j] ==1 && checked[i][j] == 0){
                        Cal(i,j);
                        count++;
                    }
                }
            }
            if(maxCount <count)
                maxCount = count;

        }
        System.out.println(maxCount);

    }
    public static void Cal(int dotX,int dotY){
        checked[dotX][dotY] =1;

        for(int i = 0; i <4; i++){
            int x1 = dotX +x[i];
            int y1 = dotY +y[i];
            if(x1 >=0 && y1>=0 && x1 <N && y1 <N){
                if(safeZone[x1][y1] ==1 && checked[x1][y1] !=1){
                    Cal(x1,y1);
                }
            }

        }
    }



}