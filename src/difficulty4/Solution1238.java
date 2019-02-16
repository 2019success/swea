package difficulty4;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution1238 {
    private static int[][] matrix;
    private static int N;
    private static boolean[] visited;
    private static int max;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i =1;
        while(i<=10){
            matrix = new int[101][101];
            visited = new boolean[101];
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            int init = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N/2; j++){
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                matrix[start][end] = 1;
            }
            bfs(init);
            bw.write("#" + i + " " + max + " \n");
            i++;
        }
        bw.close();
    }
    private static void bfs(int num){
        max = 0;
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> temp = new LinkedList<>();
        queue.offer(num);
        visited[num] = true;
        while(!queue.isEmpty()){
            int length = queue.size();
            while(!temp.isEmpty()) temp.poll();
            for(int i=0; i<length; i++) {
                int curr = queue.poll();
                temp.offer(curr);
                for (int next = 1; next <= 100; next++) {
                    if (!visited[next] && matrix[curr][next] == 1) {
                        visited[next] = true;
                        queue.offer(next);
                    }
                }
            }
        }
        while(!temp.isEmpty()){
            int tmp = temp.poll();
            if(max<tmp) max =tmp;
        }
    }
}
