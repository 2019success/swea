package difficulty3;

import java.io.*;

public class Solution3431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i =1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            String[] input = br.readLine().split(" ");
            int L = Integer.parseInt(input[0]); // L분 이상
            int U = Integer.parseInt(input[1]); // U분 이하
            int X = Integer.parseInt(input[2]); // 일주일에 운동 한 시간(분)
            if(X>U) bw.write("#" + i + " -1\n");
            else if(L<=X && X<=U) bw.write("#"+ i+ " 0\n");
            else if(L>X){
                bw.write("#" + i+ " " + (L-X) + "\n");
            }
            i++;
        }
        bw.close();
    }
}
