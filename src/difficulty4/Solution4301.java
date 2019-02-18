package difficulty4;

import java.io.*;
import java.util.StringTokenizer;

public class Solution4301 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i =1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            int count=0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[][] matrix = new int[M][N];
            for(int j=0; j<M; j++){
                for(int k=0; k<N; k++){
                    if(j+2<M && matrix[j][k] !=1 && matrix[j+2][k]==0) matrix[j+2][k]=1;
                    if(k+2<N && matrix[j][k] !=1 && matrix[j][k+2]==0) matrix[j][k+2]=1;
                }
            }
            for(int j=0; j<M; j++){
                for(int k=0; k<N; k++){
                    if(matrix[j][k]==0) count++;
                }
            }
            bw.write("#" + i + " " + count + "\n");
            i++;
        }
        bw.close();
    }
}