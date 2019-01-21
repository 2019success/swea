package difficulty3;

import java.io.*;
import java.util.StringTokenizer;

public class Solution5642 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        int T= Integer.parseInt(br.readLine());
        while(i<=T){
            int N = Integer.parseInt(br.readLine());
            int[] array = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) array[j] = Integer.parseInt(st.nextToken());
            int sum=0;
            int max=Integer.MIN_VALUE;
            for(int j=0; j<N; j++){
                sum+=array[j];
                if(sum>max) max=sum;
                if(sum<0) sum=0;
            }
            bw.write("#" + i + " " +max+"\n");
            i++;
        }
        bw.close();
    }
}