package difficulty3;

import java.io.*;

public class Solution4751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            StringBuilder line1= new StringBuilder();
            StringBuilder line2= new StringBuilder();
            StringBuilder line3= new StringBuilder();
            String str=br.readLine();
            line1.append(".");
            line2.append(".");
            line3.append("#");
            for(int j=0; j<str.length(); j++){
                line1.append(".#..");
                line2.append("#.#.");
                line3.append("." + str.charAt(j)+".#");
            }
            System.out.println(line1);
            System.out.println(line2);
            System.out.println(line3);
            System.out.println(line2);
            System.out.println(line1);
            i++;
        }
        bw.close();
    }
}

