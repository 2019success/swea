package difficulty3;

import java.io.*;

public class Solution3314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i =1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            String[] input = br.readLine().split(" ");
            int[] score = new int[5];
            int sum=0;
            for(int j=0; j<5; j++){
                score[j] = Integer.parseInt(input[j]);
                if(score[j]<40) score[j] = 40;
                sum+=score[j];
            }
            bw.write("#" + i + " " + (sum/5) +"\n");
            i++;
        }
        bw.close();
    }
}
