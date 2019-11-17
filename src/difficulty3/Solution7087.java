package difficulty3;

import java.io.*;

public class Solution7087 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i =1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T) {
            int[] counts = new int[26];
            int count=0;
            int N = Integer.parseInt(br.readLine());
            for(int j=0; j<N; j++){
                String input = br.readLine();
                char temp = input.charAt(0);
                counts[temp-65]++;
            }
            for(int j=0; j<counts.length; j++){
                if(counts[j]==0) break;
                count++;
            }
            bw.write("#" + i + " " + count+"\n");
            i++;
        }
        
        bw.close();
    }
}
