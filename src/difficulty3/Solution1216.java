package difficulty3;

import java.io.*;

public class Solution1216 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        while(i<=10){
            int T = Integer.parseInt(br.readLine());
            char[][] matrix = new char[100][100];
            for(int j=0; j<matrix.length; j++){
                matrix[j] = br.readLine().toCharArray();
            }
            int max=0;
            for(int j=0; j<matrix.length; j++){ //행 탐색
                for(int e=0; e<matrix.length; e++) { // 시작점 설정. 총 8번
                    for(int l=matrix.length-1; l>=e; l--) { //끝점부터 내려오기
                        int count=0;
                        int start=e;
                        int end=l;
                        while (count != (l-e+1) / 2) {
                            if (matrix[j][start] != matrix[j][end]) break;
                            else {
                                start++;
                                end--;
                                count++;
                            }
                            if (count == (l-e+1)/2) {
                                if (max < (l-e+1)) {
                                    max = l-e+1;
                                    break;
                                }
                            }

                        }
                        count=0;
                        start=e;
                        end=l;
                        while (count != (l-e+1) / 2) {
                            if (matrix[start][j] != matrix[end][j]) break;
                            else {
                                start++;
                                end--;
                                count++;
                            }
                            if (count == (l-e+1)/2) {
                                if (max < (l-e+1)) {
                                    max = l-e+1;
                                    break;
                                }
                            }

                        }
                    }

                }
            }
            bw.write("#" + T + " " + max+"\n");
            i++;
        }
        bw.close();
    }
}
