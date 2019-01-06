package difficulty3;

import java.io.*;

public class Solution3408 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            long N = Long.parseLong(br.readLine());
            bw.write("#" + i +" "+ N*(N+1)/2 + " " + N*N + " " + N*(N+1) + "\n");
            i++;
        }
        bw.close();
    }
}
