package difficulty3;

import java.io.*;

public class Solution3975 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            String[] input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            int C = Integer.parseInt(input[2]);
            int D = Integer.parseInt(input[3]);
            double aliceWinProb = (double)A/B;
            double bobWinProb = (double)C/D;
            bw.write("#" + i + " ");
            if(aliceWinProb == bobWinProb) bw.write("DRAW\n");
            else if(aliceWinProb>bobWinProb) bw.write("ALICE\n");
            else if(aliceWinProb<bobWinProb) bw.write("BOB\n");

            i++;
        }
        bw.close();
    }
}
