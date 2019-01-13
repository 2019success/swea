package difficulty3;

import java.io.*;
import java.util.StringTokenizer;

public class Solution6692 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i =1;
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while(i<=T){
            int N = Integer.parseInt(br.readLine());
            double money=0;
            for(int j=0; j<N; j++){
                st = new StringTokenizer(br.readLine());
                money = money+Double.parseDouble(st.nextToken()) * Integer.parseInt(st.nextToken());
            }
            bw.write("#" + i + " " + String.format("%.6f", money)+"\n");
            i++;
        }
        bw.close();
    }
}
