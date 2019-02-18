package difficulty4;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Solution1226 {
    private static int result;
    private static int startRow;
    private static int startCol;
    private static int endRow;
    private static int endCol;
    private static String[][] matrix;
    private static boolean[][] visited;
    private static int[] nextRow = {0, 1, 0, -1};
    private static int[] nextCol = {1, 0, -1, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        while(i<=10){
            int N = Integer.parseInt(br.readLine());
            matrix = new String[16][16];
            visited = new boolean[16][16];
            for(int row=0; row<16; row++){
                String[] input = br.readLine().split("");
                for(int col=0; col<16; col++){
                    matrix[row][col] = input[col];
                    if(matrix[row][col].equals("2")){
                        startRow = row;
                        startCol = col;
                    }
                    else if(matrix[row][col].equals("3")){
                        endRow = row;
                        endCol = col;
                    }
                }
            }
            result=0;
            bfs(new Point(startRow, startCol));
            bw.write("#"+N + " "+result+"\n");
            i++;
        }
        bw.close();
    }
    private static void bfs(Point point){
        Queue<Point> queue = new LinkedList<>();
        queue.offer(point);
        visited[point.row][point.col] = true;
        while(!queue.isEmpty()){
            Point curr = queue.poll();
            if(curr.row==endRow && curr.col==endCol) {
                result =1;
                break;
            }
            for(int i=0; i<4; i++){
                int newRow = curr.row + nextRow[i];
                int newCol = curr.col + nextCol[i];
                if(newRow>=0 && newCol>=0 && newRow<=15 && newCol<=15 && !visited[newRow][newCol] && !matrix[newRow][newCol].equals("1")){
                    queue.offer(new Point(newRow, newCol));
                    visited[newRow][newCol] = true;
                }
            }
        }
    }
}
class Point{
    int row;
    int col;

    Point(int row, int col){
        this.row = row;
        this.col = col;
    }
}
