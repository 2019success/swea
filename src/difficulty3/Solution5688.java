package difficulty3;

import java.io.*;

public class Solution5688 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i=1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
           long N = Long.parseLong(br.readLine());
           long result =(long) Math.cbrt(N);
           if(result * result * result !=N) result = -1;
           bw.write("#" + i + " " + result+"\n");
           i++;
        }
        bw.close();
    }
}