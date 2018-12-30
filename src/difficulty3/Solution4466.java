package difficulty3;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Solution4466 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        int T=Integer.parseInt(br.readLine());
        while(i<=T){
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int K = Integer.parseInt(input[1]);
            int sum=0;
            input = br.readLine().split(" ");
            Integer[] score = new Integer[N];
            for(int j=0; j<N; j++){
                score[j] = Integer.parseInt(input[j]);
            }
            Arrays.sort(score, Collections.reverseOrder());
            for(int j=0; j<K; j++){
                sum+=score[j];
            }
            bw.write("#" + i + " " +sum+"\n");
            i++;
        }
        bw.close();
    }
}
