import java.util.Scanner;

public class M2292 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(); //목적지 방
        int sum =1;
        int plus = 6;
        int cnt = 1;
        while(a > sum){
            sum += plus;
            plus+=6;
            cnt++;
        }
        System.out.println(cnt);
    }
}
