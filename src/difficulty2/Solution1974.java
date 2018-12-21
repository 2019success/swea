package difficulty2;

import java.io.*;

public class Solution1974 {
    private static int[][] matrix;
    private static int[] temp = new int[9];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int i=0;
        int result=0;
        while(i++<T){

            matrix = new int[9][9];
            for(int j=0; j< matrix.length; j++) {
                String input[] = br.readLine().split(" ");
                for(int k=0; k< matrix.length; k++){
                    matrix[j][k] = Integer.parseInt(input[k]);
                }
            }

            for(int j=0; j<matrix.length; j++){
                for(int k=0; k<matrix.length; k++){
                    temp[matrix[j][k]-1]++;
                }
                result = tempArrayCheck();
                if(result==0) break;
            }
            if(result==0) {
                bw.write("#"+i+ " " + result+"\n");
                continue;
            }

            for(int j=0; j<matrix.length; j++){
                for(int k=0; k<matrix.length; k++){
                    temp[matrix[k][j]-1]++;
                }
                result = tempArrayCheck();
                if(result==0)break;
            }
            if(result==0) {
                bw.write("#"+i+ " " + result+"\n");
                continue;
            }

            int count=0;
            int row=0;
            int col=0;
            while(count != 9) {
                for (int j=col; j < (matrix.length)/3+col; j++) {
                    for (int k=row; k < (matrix.length)/3+row; k++) {
                        temp[matrix[j][k] - 1]++;
                    }
                }
                result = tempArrayCheck();
                if (result == 0) break;
                row+=3;
                if(row==9){
                    row=0;
                    col+=3;
                }
                count++;
            }
            bw.write("#"+i+ " " + result+"\n");
        }
        bw.close();

    }
    private static void init(){
        for(int i=0; i<temp.length; i++){
            temp[i]=0;
        }
    }
    private static int tempArrayCheck(){
        int result=1;
        for (int l = 0; l < matrix.length; l++) {
            if (temp[l] != 1) {
                result = 0;
                break;
            }
        }
        init();
        return result;
    }
}
