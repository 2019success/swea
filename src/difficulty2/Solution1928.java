package difficulty2;

import java.io.*;
import java.util.Base64;

public class Solution1928 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int i=1;
        while(i<=T){
            String strEncode = br.readLine();
            String strDecode = new String(Base64.getDecoder().decode(strEncode));
            bw.write("#" + i + " " + strDecode+"\n");
            i++;
        }

        bw.close();
    }
}
