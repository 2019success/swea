package difficulty2;

import java.io.*;

public class Solution1979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T= Integer.parseInt(br.readLine());
        int i=1;
        int[][] matrix;
        while(i<=T){
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int K = Integer.parseInt(input[1]);
            matrix = new int[N+1][N+1];
            for(int j=0; j<N; j++){
                input = br.readLine().split(" ");
                for(int k=0; k<N; k++){
                    matrix[j][k] = Integer.parseInt(input[k]);
                }
            }
            int rowSum, colSum;
            int possible=0;
            for(int j=0; j<N; j++){
                rowSum=0;
                colSum=0;
                for(int k=0; k<N; k++){
                    if(matrix[j][k]==0)
                        rowSum=0;
                    else
                        rowSum++;
                    if(matrix[k][j]==0)
                        colSum=0;
                    else
                        colSum++;
                    if(rowSum==K){
                        if(matrix[j][k+1]==0)
                            possible++;
                    }
                    if(colSum==K){
                        if(matrix[k+1][j]==0)
                            possible++;
                    }
                }
            }
            bw.write("#"+ i + " " + possible+ "\n");
            i++;
        }
        bw.close();

    }
}
