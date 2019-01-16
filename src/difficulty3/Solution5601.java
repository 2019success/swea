package difficulty3;

import java.io.*;

public class Solution5601 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            int N = Integer.parseInt(br.readLine());
            bw.write("#"+i+ " ");
            for(int j=0; j<N; j++){
                bw.write(1+"/"+N+ " ");
            }
            bw.write("\n");
            i++;
        }
        bw.close();
    }
}
