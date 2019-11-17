package difficulty3;

import java.io.*;
import java.util.StringTokenizer;

public class Solution6913 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            int count=0;
            int maxScore=0;
            StringTokenizer st;
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[] score = new int[N];
            for(int j=0; j<N; j++){
                st = new StringTokenizer(br.readLine());
                for(int k=0; k<M; k++){
                    score[j] += Integer.parseInt(st.nextToken());
                }
            }
            for(int j=0; j<score.length; j++) if(maxScore<=score[j]) maxScore = score[j];
            for(int j=0; j<score.length; j++) if(maxScore==score[j]) count++;
            bw.write("#" + i + " " + count + " " + maxScore +"\n");
            i++;
        }
        
        bw.close();
    }
}
