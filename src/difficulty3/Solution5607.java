package difficulty3;

import java.io.*;
import java.math.BigInteger;

public class Solution5607 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int R = Integer.parseInt(input[1]);
            int namerge = 1234567891;
            BigInteger result = factorial(N, R, namerge);
            bw.write("#" + i +" " + result+"\n");
            i++;
        }
        bw.close();
    }
    static private BigInteger factorial(int N, int R, int namerge){
        long[] factorial = new long[N+1];
        for(int i=0; i<=N; i++){
            if(i>=1) factorial[i] = factorial[i-1]*i % namerge;
            else factorial[i] =1;
        }
        BigInteger bigNamerge = BigInteger.valueOf(namerge);
        BigInteger bigN = BigInteger.valueOf(factorial[N]);
        BigInteger bigR = BigInteger.valueOf(factorial[R]).modInverse(bigNamerge).remainder(bigNamerge);
        BigInteger bigN_R = BigInteger.valueOf(factorial[N-R]).modInverse(bigNamerge).remainder(bigNamerge);
        return bigN.multiply(bigR).multiply(bigN_R).remainder(bigNamerge);
    }
}