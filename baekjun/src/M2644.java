import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class M2644 {
    static int n;
    static int[][] map;
    static int[] d;
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        n = s.nextInt();
        int parent = s.nextInt();
        int child = s.nextInt();
        map = new int[n+1][n+1];
        d = new int[n+1];
        int m = s.nextInt();

        for(int i= 0; i < m; i++) {
            int x = s.nextInt();
            int y = s.nextInt();
            map[x][y]=1;
            map[y][x]=1;
        }
        BFS(parent,child);
        if(d[child] == 0)
            System.out.println(-1);
        else
            System.out.println(d[child]);

    }
    private static void BFS(int start, int end) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()) {
            int v = q.poll();
            if(v==end)
                break;
            for(int i = 1; i <=n; i++) {
                if(map[v][i] == 1 && d[i] ==0) {
                    d[i] = d[v] +1;
                    q.add(i);
                }
            }
        }

    }

}