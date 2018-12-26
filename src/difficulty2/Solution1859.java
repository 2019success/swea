package difficulty2;

import java.io.*;

public class Solution1859 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        int T = Integer.parseInt(br.readLine());
        int max=0;
        long result=0;
        while(i<=T){
            int N = Integer.parseInt(br.readLine());
            int[] num = new int[N];
            int[] maxNum = new int[N];
            String[] input = br.readLine().split(" ");
            for(int j=0; j<N; j++) {
                num[j] = Integer.parseInt(input[j]);
            }
            for(int j=N-1; j>=0; j--){
                if(num[j]>max){
                    max = num[j];
                }
                maxNum[j] = max;
            }
            for(int j=0; j<N; j++){
                result+=maxNum[j]-num[j];
            }
            bw.write("#"+i + " "+ result+"\n");
            result=0;
            max=0;
            i++;
        }
        bw.close();
    }
}
