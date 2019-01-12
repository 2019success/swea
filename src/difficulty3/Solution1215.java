package difficulty3;

import java.io.*;

public class Solution1215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        while(i<=10){
            int length = Integer.parseInt(br.readLine());
            char[][] matrix= new char[8][8];
            for(int j=0; j<matrix.length; j++){
                matrix[j] = br.readLine().toCharArray();
            }
            int result =0;
            for(int j=0; j<matrix.length; j++){
                for(int k=0; k<=matrix.length-length; k++){
                    int start = k;
                    int end = k+length-1;
                    int count=0;
                    //가로
                    while(count != length/2) {
                        if (matrix[j][start] != matrix[j][end]) break;
                        else {
                            count++;
                            start++;
                            end--;
                            if(count == length/2) result++;
                        }
                    }
                    start = k;
                    end = k+length-1;
                    count=0;
                    //세로
                    while(count != length/2) {
                        if (matrix[start][j] != matrix[end][j]) break;
                        else {
                            count++;
                            start++;
                            end--;
                            if(count == length/2) result++;
                        }
                    }
                }
            }
            bw.write("#" + i + " " + result+"\n");
            i++;
        }
        bw.close();
    }
}
