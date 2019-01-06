package difficulty3;

import java.io.*;
import java.math.BigInteger;

public class Solution3260 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            String[] input = br.readLine().split(" ");
            BigInteger bigInteger1 = new BigInteger(input[0]);
            BigInteger bigInteger2 = new BigInteger(input[1]);
            String result = String.valueOf(bigInteger1.add(bigInteger2));
            bw.write("#" + i + " " + result+"\n");
            i++;
        }
        bw.close();
    }
}
