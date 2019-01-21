package difficulty4;

import java.io.*;
import java.util.StringTokenizer;

public class Solution1211 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i =1;
        while(i<=10){
            StringTokenizer st;
            int result=0;
            int min=Integer.MAX_VALUE;
            int T = Integer.parseInt(br.readLine());
            int[][] ladder = new int[100][100];
            for(int j=0; j<100; j++){
                st = new StringTokenizer(br.readLine());
                for(int k=0; k<100; k++){
                    ladder[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            for(int j=0; j<100; j++){
                int count=0;
                int left_right_move = j;
                if(ladder[0][j] == 0) continue;
                else{
                    for(int k=0; k<100; k++){
                        if(left_right_move != 0 && ladder[k][left_right_move - 1] != 0){
                            while (left_right_move != 0 && ladder[k][left_right_move - 1] != 0 ) {
                                left_right_move--;
                                count++;
                            }
                        }
                        else if (left_right_move != 99 && ladder[k][left_right_move + 1] != 0) {
                            while (left_right_move != 99 && ladder[k][left_right_move + 1] != 0) {
                                left_right_move++;
                                count++;
                            }
                        }
                        count++;
                    }
                    if(min>=count){
                        min = count;
                        result = j;
                    }
                }
            }
            bw.write("#" + T + " " + result + "\n");
            i++;
        }
        bw.close();
    }
}