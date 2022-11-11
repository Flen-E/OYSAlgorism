import java.util.Scanner;

public class M2477 {
    static int numX;
    static int numY;
    static int maxPosX =0;
    static int maxPosY =0;
    static int minPosX = 0;
    static int minPosY = 0;


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int K = s.nextInt();
        int sum = 0;

        int dir [] = new int[6];
        int pos [] = new int[6];

        for(int i = 0; i < 6; i++){
            dir[i] = s.nextInt();
            pos[i] = s.nextInt();
            if((dir[i] == 1 || dir[i] == 2) && maxPosX <pos[i]){
                maxPosX = pos[i];
                numX = i;
            }
            else if((dir[i] == 3 || dir[i] == 4) && maxPosY <pos[i]){
                maxPosY = pos[i];
                numY = i;
            }
        }

        if(numX > numY){
            int small = numY;
            numY = numX;
            numX = small;
        }

        if(numX ==0 && numY ==5){
            minPosX = numX + 2;
            minPosY = numY - 2;
        }else{
            if(numX - 2 <0){
                minPosX= numX - 2 + 6;
            }else
                minPosX = numX - 2;
            if(numY +2 > 5){
                minPosY = numY +2 -6;
            }else
                minPosY = numY + 2;
        }
        sum = maxPosX*maxPosY - pos[minPosX]*pos[minPosY];

        System.out.println(sum*K);
    }
}

