package difficulty4;

import java.io.*;
import java.util.StringTokenizer;

public class Solution1210 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i =1;
        while(i<=10){
            StringTokenizer st;
            int T = Integer.parseInt(br.readLine());
            int[][] matrix = new int[100][100];
            for(int j=0; j<100; j++){
                st = new StringTokenizer(br.readLine());
                for(int k=0; k<100; k++){
                    matrix[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            for(int j=0; j<100; j++){
                int left_right=j;
                if(matrix[0][j] == 0)
                    continue;
                else{
                    for(int k=0; k<100; k++){
                        if(left_right!=99 && matrix[k][left_right+1]==1){
                            while(left_right!=99 && matrix[k][left_right+1]==1){
                                left_right++;
                            }
                        }
                        else if(left_right!=0 && matrix[k][left_right-1]==1){
                            while(left_right!=0 && matrix[k][left_right-1]==1){
                                left_right--;
                            }
                        }
                    }
                }
                if(matrix[99][left_right]==2) {
                    bw.write("#" + T + " " + j+"\n");
                    break;
                }
            }
            i++;
        }
        bw.close();
    }
}