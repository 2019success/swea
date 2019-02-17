package difficulty4;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Solution1249 {
    private static int N;
    private static int[][] matrix;
    private static boolean[][] visited;
    private static int[][] shortPass;
    private static int[] nextRow ={0, 1, -1, 0};
    private static int[] nextCol ={1, 0, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = 1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            N = Integer.parseInt(br.readLine());
            shortPass = new int[N][N];
            matrix = new int[N][N];
            visited = new boolean[N][N];
            for(int j=0; j<N; j++){
                for(int k=0; k<N ;k++) {
                    shortPass[j][k] = Integer.MAX_VALUE;
                }
            }
            for(int j=0; j<N; j++){
                String[] input = br.readLine().split("");
                for(int k=0; k<N; k++){
                    matrix[j][k] = Integer.parseInt(input[k]);
                }
            }
            bfs(new Pos(0, 0));
            bw.write("#" + i +" " + shortPass[N-1][N-1] + "\n");
            i++;
        }
        bw.close();
    }
    private static void bfs(Pos pos){
        Queue<Pos> queue = new LinkedList<>();
        queue.offer(pos);
        shortPass[pos.row][pos.col]=0;
        while(!queue.isEmpty()) {
            Pos temp = queue.poll();
            for (int i = 0; i <4; i++) {
                int newRow = temp.row + nextRow[i];
                int newCol = temp.col + nextCol[i];
                if (newRow >= 0 && newCol >= 0 && newRow < N && newCol < N) {
                    if(shortPass[newRow][newCol]> shortPass[temp.row][temp.col]+matrix[newRow][newCol]){
                        shortPass[newRow][newCol] = shortPass[temp.row][temp.col] + matrix[newRow][newCol];
                        queue.offer(new Pos(newRow, newCol));
                    }
                }
            }
        }
    }
}
class Pos{
    int row;
    int col;

    Pos(int row, int col){
        this.row = row;
        this.col = col;
    }
}
