package difficulty3;

import java.io.*;

public class Solution6190 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int i=1;
        while(i<=T){
            int N = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] num = new int[N];
            for(int j=0; j<input.length; j++){
                num[j] = Integer.parseInt(input[j]);
            }

            int max=-1;
            for(int j=0; j<N-1; j++){
                for(int k=j+1; k<N; k++){
                    if(isEncrease(num[j]*num[k]) && num[j]*num[k] > max){
                        max = num[j]*num[k];
                    }
                }
            }
            bw.write("#" + i + " " + max+"\n");
            i++;
        }
        bw.close();
    }
    private static boolean isEncrease(long num){
        long compare = 9;
        for(long i=num; i>0; i=i/10){
            long namerge = i%10;
            if(compare >= namerge){
                compare = namerge;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
