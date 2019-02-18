package difficulty4;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Solution1227 {
    private static String[][] matrix;
    private static boolean[][] visited;
    private static int startRow;
    private static int startCol;
    private static int endRow;
    private static int endCol;
    private static int result;
    private static int[] nextRow={-1, 0, 1, 0};
    private static int[] nextCol={0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i=1;
        while(i<=10){
            int N = Integer.parseInt(br.readLine());
            matrix = new String[100][100];
            visited = new boolean[100][100];
            for(int j=0; j<=99; j++){
                String[] input = br.readLine().split("");
                for(int k=0; k<=99; k++){
                    matrix[j][k] = input[k];
                    if(matrix[j][k].equals("2")){
                        startRow = j;
                        startCol = k;
                    }
                    else if(matrix[j][k].equals("3")){
                        endRow = j;
                        endCol = k;
                    }
                }
            }
            result = 0;
            bfs(new Position(startRow, startCol));
            bw.write("#" + N + " " + result + "\n");
            i++;
        }
        bw.close();
    }
    private static void bfs(Position position){
        Queue<Position> queue = new LinkedList<>();
        queue.offer(position);
        visited[position.row][position.col] = true;
        while(!queue.isEmpty()){
            Position curr = queue.poll();
            if(curr.row == endRow && curr.col == endCol){
                result = 1;
                break;
            }
            for(int i=0; i<4; i++){
                int newRow = curr.row+nextRow[i];
                int newCol = curr.col+nextCol[i];
                if(newRow>=0 && newCol>=0 && newRow<=99 && newCol<=99 && !visited[newRow][newCol] && !matrix[newRow][newCol].equals("1")){
                    visited[newRow][newCol]=true;
                    queue.offer(new Position(newRow, newCol));
                }
            }
        }
    }
}
class Position{
    int row;
    int col;
    Position(int row, int col){
        this.row = row;
        this.col = col;
    }
}
