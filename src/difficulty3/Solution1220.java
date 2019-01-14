package difficulty3;

import java.io.*;
import java.util.StringTokenizer;

public class Solution1220 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int i =1;
        while(i<=10){
            int result=0;
            int N = Integer.parseInt(br.readLine());
            String [][] matrix = new String[N][N];
            for(int j=0; j<N; j++) {
                st = new StringTokenizer(br.readLine());
                for(int k=0; k<N; k++){
                    matrix[j][k] = st.nextToken();
                }
            }
            for(int j=0; j<N; j++){
                for(int k=0; k<N; k++){
                    if(matrix[k][j].equals("1") && k!=N-1){
                        while(true){
                            k++;
                            if(matrix[k][j].equals("2")){
                                result++;
                                break;
                            }
                            if(k==N-1) break;
                        }
                    }
                }
            }
            bw.write("#"+ i + " " + result+"\n");
            i++;
        }
        bw.close();
    }
}