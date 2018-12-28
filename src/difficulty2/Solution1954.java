package difficulty2;

import java.io.*;

public class Solution1954 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int i=1;
        while(i<=T){
            int count=1;
            int x=0, y=-1, direction=1;
            int N = Integer.parseInt(br.readLine());
            int arrLength = N;
            int[][] arrayNumber = new int[N][N];
            while(count!=(arrLength*arrLength)+1 ){
                //y좌표 이동
                for (int j=0; j<N; j++) {
                    y+=direction;
                    arrayNumber[x][y] = count;
                    count++;
                }
                N--;
                //x좌표 이동
                for(int j=0; j<N; j++){
                    x+=direction;
                    arrayNumber[x][y] = count;
                    count++;
                }
                //방향 전환
                direction = -direction;
            }
            bw.write("#" + i + "\n");
            for(int j=0; j<arrLength; j++){
                for(int k=0; k<arrLength; k++){
                    bw.write(arrayNumber[j][k]+" ");
                }
                bw.write("\n");
            }
            i++;
        }
        bw.close();
    }
}