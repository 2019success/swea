package difficulty3;

import java.io.*;
import java.util.StringTokenizer;

public class Solution7102 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = 1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            if(N==M){
                bw.write("#" + i + " " + (N+1)+"\n");
            }
            else if(N<M){
                int temp = N;
                bw.write("#" + i + " ");
                for(int j=0; j<=M-N; j++){
                    bw.write((++temp) +" ");
                }
                bw.write("\n");
            }
            else{
                int temp = M;
                bw.write("#" + i + " ");
                for(int j=0; j<=N-M; j++){
                    bw.write((++temp)+" ");
                }
                bw.write("\n");
            }
            i++;
        }
        bw.close();
    }
}
