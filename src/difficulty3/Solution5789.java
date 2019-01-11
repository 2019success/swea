package difficulty3;

import java.io.*;
import java.util.StringTokenizer;

public class Solution5789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while(i<=T){
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int[] boxs = new int[N];
            int Q = Integer.parseInt(input[1]);
            int count=1;
            while(count<=Q) {
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                for (int j = start - 1; j < end; j++) {
                    boxs[j] = count;
                }
                count++;
            }
            bw.write("#" + i + " ");
            for(int k:boxs){
                bw.write(k+" ");
            }
            bw.write("\n");
            i++;
        }
        bw.close();
    }
}
