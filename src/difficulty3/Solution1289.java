package difficulty3;

import java.io.*;

public class Solution1289 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            String str = br.readLine();
            int count=0;
            for(int j=1; j<str.length(); j++){
                if(str.charAt(j-1) != str.charAt(j)) count++;
            }
            if(str.charAt(0)=='1') count++;
            bw.write("#" + i + " " + count+"\n");
            i++;
        }
        bw.close();
    }
}
