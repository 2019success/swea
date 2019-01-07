package difficulty3;

import java.io.*;

public class Solution3131 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] flag = new boolean[1000001];
        flag[0] = true;
        flag[1] = true;

        for(int i=2; i<Math.sqrt(flag.length); i++){
            if(!flag[i]) {
                int j = 2;
                while (i * j <= 1000000) {
                    flag[i * j] = true;
                    j++;
                }
            }
        }
        for(int i=2; i<flag.length; i++){
            if(!flag[i]){
                bw.write(i +" ");
            }
        }
        bw.close();
    }
}
