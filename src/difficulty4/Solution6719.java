package difficulty4;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution6719 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i = 1;
        int T = Integer.parseInt(br.readLine());
        while (i <= T) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] M = new int[N];
            int K = Integer.parseInt(st.nextToken());
            boolean flag = true;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) M[j] = Integer.parseInt(st.nextToken());
            int count = 0;
            int length = N - K;
            double A = 0;
            Arrays.sort(M);
            while (flag) {
                A = (A + M[length++]) / 2;
                count++;
                if (count == K) {
                    flag = false;
                }
            }
            bw.write("#" + i + " " + String.format("%.6f", A) + "\n");
            i++;
        }
        bw.close();
    }
}
