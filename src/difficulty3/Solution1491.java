package difficulty3;

import java.io.*;

public class Solution1491 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int A = Integer.parseInt(input[1]);
            int B = Integer.parseInt(input[2]);
            long min = Integer.MAX_VALUE;
            long value;
            for(long R=1; R<=N/2; R++){
                for(long C=R; R*C<=N; C++){
                    value = A*Math.abs(R-C) + B*(N-R*C);
                    if(value<min) min = value;
                }
            }
            bw.write("#" + i + " " + min + "\n");
            i++;
        }
        bw.close();
    }
}