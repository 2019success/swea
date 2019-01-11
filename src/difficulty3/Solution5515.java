package difficulty3;

import java.io.*;

public class Solution5515 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] month={0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int i=1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            String[] input = br.readLine().split(" ");
            int m = Integer.parseInt(input[0]);
            int n = Integer.parseInt(input[1]);
            for(int j=1; j<=m-1; j++){
                n += month[j];
            }
            int result;
            if(n%7<=3) result = n%7+3;
            else result = n%7-4;
            bw.write("#"+ i + " " + result+"\n");
            i++;
        }
        bw.close();
    }
}
