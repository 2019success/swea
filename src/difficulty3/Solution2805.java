package difficulty3;

import java.io.*;

public class Solution2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            int N = Integer.parseInt(br.readLine());
            int[][] matrix = new int[N][N];
            int profit=0;
            for(int j=0; j<N; j++){
                String[] input = br.readLine().split("");
                for(int k=0; k<N; k++){
                    matrix[j][k]=Integer.parseInt(input[k]);
                }
            }

            int start = N/2;
            int end = N-2;
            for(int j=0; j<N; j++){
                if(j<=N/2) {
                    for(int k=start; k <= N / 2 + j; k++) {
                        profit += matrix[j][k];
                    }
                    if(start>0)start--;
                }
                else{
                    start++;
                    for(int k=start; k<=end; k++){
                        profit+=matrix[j][k];
                    }
                    end--;
                }
            }
            bw.write("#"+ i + " "+profit+"\n");
            i++;
        }
        bw.close();
    }
}