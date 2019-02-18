package difficulty4;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution1219 {
    private static int result;
    private static int[][] matrix;
    private static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k=1;
        while(k<=10) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            matrix = new int[100][100];
            visited = new boolean[100];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < E; i++) {
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                matrix[start][end] = 1;
            }
            result = 0;
            bfs(0);
            bw.write("#" + T + " " + result + "\n");
            k++;
        }
        bw.close();
    }
    private static void bfs(int num){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(num);
        visited[num] = true;
        while(!queue.isEmpty()){
            int curr = queue.poll();
            if(curr==99) {
                result = 1;
                break;
            }
            for(int next=0; next<=99; next++){
                if(!visited[next] && matrix[curr][next]==1){
                    visited[next]=true;
                    queue.offer(next);
                }
            }
        }
    }
}
