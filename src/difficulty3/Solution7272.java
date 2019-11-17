package difficulty3;

import java.io.*;
import java.util.StringTokenizer;

public class Solution7272 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int i=1;
        while(i<=T){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            a = change(a);
            b = change(b);
            if(a.equals(b)) bw.write("#" + i + " SAME\n");
            else bw.write("#" + i + " DIFF\n");
            i++;
        }
        bw.close();
    }
    private static String change(String temp){
        String tmp="";
        for(int i=0; i<temp.length(); i++){
            if(temp.charAt(i)=='A' || temp.charAt(i)=='D' || temp.charAt(i)=='O' || temp.charAt(i)=='P' || temp.charAt(i)=='Q' || temp.charAt(i)=='R')
                tmp = tmp.concat("1");
            else if(temp.charAt(i)=='B') tmp = tmp.concat("2");
            else tmp = tmp.concat("0");
        }
        
        return tmp;
    }
}
