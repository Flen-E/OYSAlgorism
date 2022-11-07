import java.util.Scanner;

public class M11660 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int arr [][] = new int [N][N];
        int allSum [][] = new int[N][N];


        int result[] = new int[M];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
               arr[i][j] = s.nextInt();
            }
        }
        for(int i =0; i < N; i++){
            for(int j =0; j < N; j++){
                if(i ==0){
                    if(j ==0){
                        allSum[i][j] = arr[i][j];

                    }else
                        allSum[i][j] = arr[i][j] +allSum[i][j-1];//여기까진 맞음

                }else if(j ==0){
                    allSum[i][j] =  allSum[i-1][j] +arr[i][j];
                }else
                    allSum[i][j] = allSum[i][j-1] + allSum[i-1][j] - allSum[i-1][j-1] +arr[i][j];
            }
        }

        //누적 구했으니 이제 값받아서 빼주면됨
        for(int i = 0; i < M; i++){
            int x1 = s.nextInt();
            int y1 = s.nextInt();
            int x2 = s.nextInt();
            int y2 = s.nextInt();
            result[i] =CalPlus(x1,y1,x2,y2,allSum);
        }




        for(int i= 0; i<M; i++){
            System.out.println(result[i]);
        }


    }
    public static int CalPlus(int x1,int y1, int x2, int y2, int allSum[][]){
        int sum = 0;
        sum = allSum[x2-1][y2-1];
        if(y1 !=1)
            sum -= allSum[x2-1][y1-2];
        if(x1 !=1)
            sum -= allSum[x1-2][y2-1];
        if(y1 !=1 && x1 !=1){
            sum += allSum[x1-2][y1-2];
        }

        return sum;
    }

}
