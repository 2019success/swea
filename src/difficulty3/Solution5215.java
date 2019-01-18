package difficulty3;

import java.io.*;
import java.util.StringTokenizer;

public class Solution5215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i=1;
        int T= Integer.parseInt(br.readLine());
        while(i<=T){
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int L = Integer.parseInt(input[1]);
            StringTokenizer st;
            Hamburger[] hamburgers = new Hamburger[N+1];
            int[][] dp = new int[N+1][L+1];
            for(int j=1; j<=N; j++){
                st = new StringTokenizer(br.readLine());
                hamburgers[j] = new Hamburger(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            }
            for(int j=1; j<=N; j++){
                for(int k=1; k<=L; k++){
                    if(hamburgers[j].kcal>k) dp[j][k] = dp[j-1][k];
                    else{
                        dp[j][k] = Math.max(hamburgers[j].score + dp[j-1][k-hamburgers[j].kcal], dp[j-1][k]);
                    }
                }
            }
            bw.write("#" + i + " " + dp[N][L] +"\n");
            i++;
        }
        bw.close();
    }
}

class Hamburger{
    int score;
    int kcal;
    public Hamburger(int score, int kcal){
        this.score = score;
        this.kcal = kcal;
    }
}