package difficulty3;

import java.io.*;
import java.util.StringTokenizer;

public class Solution6019 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int D = Integer.parseInt(st.nextToken());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int F = Integer.parseInt(st.nextToken()); // 1mile = 1.609344km
            double time = (double)D/(A+B);
            double result = F*time;
            bw.write("#" + i + " " + String.format("%.6f", result)+"\n");
            i++;
        }
        bw.close();
    }
}
