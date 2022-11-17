import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class M12738 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]  = s.nextInt();
        }
        ArrayList<Integer> numArr = new ArrayList<>();
        numArr.add(-1000000001);

        for(int i = 0; i < n; i++){
            int start = 1;
            int end = numArr.size()-1;
            if(numArr.get(end) < arr[i])
                numArr.add(arr[i]);
            else if (numArr.get(end) == arr[i]){
                numArr.set(end,arr[i]);
            }
            else {
                while (start <= end) {
                    int mid = (start + end) / 2;
                    if (numArr.get(mid) >= arr[i]) {
                        end = mid-1;
                    } else if (numArr.get(mid) < arr[i]) {
                        start = mid+1;
                    }
                }
                numArr.set(start , arr[i]);
            }
        }
        System.out.println(numArr.size()-1);
    }
}
