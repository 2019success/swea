package difficulty3;

import java.io.*;

public class Solution3456 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            String[] input = br.readLine().split(" ");
            int[] reactangleLength = new int[3];
            for(int j=0; j<input.length; j++){
                reactangleLength[j] = Integer.parseInt(input[j]);
            }
            int A = reactangleLength[0];
            int B = reactangleLength[1];
            int C = reactangleLength[2];

            bw.write("#" + i + " ");
            if(A==B && B==C){
                bw.write(A+"\n");
            }
            else if(A==B) bw.write(C+"\n");
            else if(A==C) bw.write(B+"\n");
            else bw.write(A+"\n");
            i++;
        }
        bw.close();
    }
}
