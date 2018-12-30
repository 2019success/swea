package difficulty3;

import java.io.*;

public class Solution5162 {
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
            int breadCount;
            if(A<B) breadCount=C/A;

            else breadCount=C/B;
            bw.write("#" + i + " " + breadCount+"\n");
            i++;
        }
        bw.close();
    }
}
