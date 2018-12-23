package difficulty2;

import java.io.*;

public class Solution1961 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i=1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T) {
            int N = Integer.parseInt(br.readLine());
             String[][] matrixInput = new String[N][N];
             String[][] matrixOutput = new String[N][3];
             String temp="";
            //N*N행렬에 값 입력받기
            for(int j=0; j<matrixInput.length; j++){
                String[] input = br.readLine().split(" ");
                for(int k=0; k<matrixInput.length; k++){
                    matrixInput[j][k] = input[k];
                }
            }
            //90도
            for(int j=0; j< matrixInput.length; j++){
                for(int k=N-1; k>=0; k--){
                    temp = temp.concat(matrixInput[k][j]);
                    if(k==0){
                        matrixOutput[j][0] = temp;
                        temp="";
                    }
                }
            }
            //180도
            for(int j=N-1; j>=0; j--){
                for(int k=N-1; k>=0; k--){
                    temp = temp.concat(matrixInput[j][k]);
                    if(k==0){
                        matrixOutput[Math.abs(j-N+1)][1] = temp;
                        temp="";
                    }
                }
            }
            //270도
            for(int j=N-1; j>=0; j--){
                for(int k=0; k<matrixInput.length; k++) {
                    temp = temp.concat(matrixInput[k][j]);
                    if (k == N-1) {
                        matrixOutput[Math.abs(j-N+1)][2] =temp;
                        temp="";
                    }
                }
            }
            //출력
            bw.write("#"+ i + "\n");
            for(int j=0; j<matrixOutput.length; j++){
                for(int k=0; k<3; k++){
                    bw.write(matrixOutput[j][k]+" ");
                }
                bw.write("\n");
            }
            i++;
        }
        bw.close();
    }
}
