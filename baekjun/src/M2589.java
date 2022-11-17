import java.util.Scanner;

public class M2589 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int height = s.nextInt();
        int weight = s.nextInt();

        char plane [][] = new char[height][weight];

        for(int i = 0 ; i < height; i ++ ){
            for(int j = 0; j < weight; j ++){
                plane[i][j] = s.next().charAt(0);
            }
        }



    }
}
