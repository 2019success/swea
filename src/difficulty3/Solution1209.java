package difficulty3;

import java.io.*;

public class Solution1209 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        while(i<=10){
            int max=0;
            int sum=0;
            int testCase = Integer.parseInt(br.readLine());
            int[][] matrix = new int[100][100];
            for(int j=0; j<100; j++){
                String[] input = br.readLine().split(" ");
                for(int k=0; k<100; k++){
                    matrix[j][k] = Integer.parseInt(input[k]);
                }
            }
            //가로 및 세로
            for(int j=0; j<100; j++){
                for(int k=0; k<100; k++){
                    sum+=matrix[j][k];
                }
                if(max<sum) max=sum;
                sum=0;
                for(int k=0; k<100; k++){
                    sum+=matrix[k][j];
                }
                if(max<sum) max=sum;
                sum=0;
            }
            //오른아래대각선
            for(int j=0; j<100; j++){
                sum+=matrix[j][j];
            }
            if(max<sum) max=sum;
            sum=0;
            //왼아래대각선
            int k=99;
            for(int j=0; j<100; j++){
                sum+=matrix[j][k];
                k--;
            }
            bw.write("#" + testCase + " " + max+"\n");
            i++;
        }
        
        bw.close();
    }
}
