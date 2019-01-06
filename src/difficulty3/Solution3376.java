package difficulty3;

import java.io.*;

public class Solution3376 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i=1;
        int T = Integer.parseInt(br.readLine());
        long[] padoArray = new long[100];
        padoArray[0]=1;
        padoArray[1]=1;
        padoArray[2]=1;
        for(int j=3; j<padoArray.length; j++){
            padoArray[j] = padoArray[j-3]+padoArray[j-2];
        }

        while(i<=T){
            int N = Integer.parseInt(br.readLine());
            bw.write("#" + i + " " + padoArray[N-1]+"\n");
            i++;
        }
        bw.close();
    }
}
