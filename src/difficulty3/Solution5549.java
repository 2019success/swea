package difficulty3;

import java.io.*;
import java.math.BigInteger;

public class Solution5549 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int i=1;
        while(i<=T) {
            String str = br.readLine();
            BigInteger bigInteger = new BigInteger(str);
            if(bigInteger.mod(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0))){
                bw.write("#"+ i+ " Even\n");
            }else
                bw.write("#"+ i+ " Odd\n");
            i++;
        }
        bw.close();
    }

}
