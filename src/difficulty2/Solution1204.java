package difficulty2;

import java.io.*;

public class Solution1204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int i=1;
        while(i<=T){
            int number = Integer.parseInt(br.readLine());
            int[] scoreCount = new int[101];
            String[] score= br.readLine().split(" ");
            int[] scoreNum = new int[1000];
            for(int j=0; j<score.length; j++){
                scoreNum[j] = Integer.parseInt(score[j]);
            }
            for(int j=0; j<scoreNum.length; j++){
                scoreCount[scoreNum[j]]++;
            }
            int max = scoreCount[0];
            int maxIndex=0;
            for(int j=1; j<=scoreCount.length-1; j++){
               if(max<=scoreCount[j]){
                   maxIndex = j;
                   max=scoreCount[j];
               }
            }
            bw.write("#" + i +" " + maxIndex+"\n");
            i++;
        }
        bw.close();
    }
}
