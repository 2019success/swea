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
            matrix = new int[N][N];
            for(int j=0; j<N; j++){
                input = br.readLine().split(" ");
                for(int k=0; k<N; k++){
                    matrix[j][k] = Integer.parseInt(input[k]);
                }
            }

            i++;
        }
        bw.close();

    }
}
