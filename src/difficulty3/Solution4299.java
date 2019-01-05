package difficulty3;

import java.io.*;

public class Solution4299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int i=0;
        while(i<T){
            i++;
            String[] input = br.readLine().split(" ");
            int D = Integer.parseInt(input[0]);
            int H = Integer.parseInt(input[1]);
            int M = Integer.parseInt(input[2]);
            if( (D<=11 && H<=11 && M<=10) || (D<=11 && H<=10 && M<=59) ) {
                bw.write("#"+ i + " -1\n");
                continue;
            }
            int result = (D-11)*24*60 + (H-11)*60 + (M-11);
            bw.write("#"+ i + " " + result+"\n");
        }
        bw.close();
    }
}
