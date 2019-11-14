package difficulty2;
import java.io.*;

public class Solution1284 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));
        int T = Integer.parseInt(br.readLine());
        int i = 1;
        while (i <= T) {
            String num[] = br.readLine().split(" ");
            int P = Integer.parseInt(num[0]);
            int Q = Integer.parseInt(num[1]);
            int R = Integer.parseInt(num[2]);
            int S = Integer.parseInt(num[3]);
            int W = Integer.parseInt(num[4]);

            int sumA = P * W;
            int sumB = 0;
            if (W <= R) {
                sumB = Q;
            } else {
                sumB = (W - R) * S + Q;
            }
            if (sumA < sumB) {
                bw.write("#" + i + " " + sumA + "\n");
            } else if (sumA > sumB) {
                bw.write("#" + i + " " + sumB + "\n");
            }
            i++;
        }
        bw.close();
        
    }
}
