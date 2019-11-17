package difficulty3;

import java.io.*;

public class Solution6718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i =1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            int d = Integer.parseInt(br.readLine());
            int result;
            double kmD;
            kmD = (double)d/1000;
            if(kmD < 0.1) result=0;
            else if(kmD>=0.1 && kmD<1) result=1;
            else if(kmD>=1 && kmD<10) result=2;
            else if(kmD>=10 && kmD<100) result=3;
            else if(kmD>=100 && kmD<1000) result=4;
            else result=5;
            bw.write("#" + i + " " + result+"\n");
            i++;
        }
        bw.close();
    }
}
