package difficulty3;

import java.io.*;

public class Solution3142 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            int twinCount = N-M;
            bw.write("#"+ i + " " + (M-twinCount) + " " + (twinCount) + "\n");
            i++;
        }
        bw.close();
    }
}
