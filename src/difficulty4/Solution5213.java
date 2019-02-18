package difficulty4;

import java.io.*;
import java.util.StringTokenizer;

public class Solution5213 {
    private static long[] sum;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = 1;
        int T = Integer.parseInt(br.readLine());
        sum = new long[1000001];
        sumNumber();
        while(i<=T){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            bw.write("#" + i + " "+(sum[R]-sum[L-1])+"\n");
            i++;
        }
        bw.close();
    }
    private static void sumNumber(){
        for(int i=1; i<=1000000; i+=2){ //각 숫자에 대한 약수의 홀수의 합을 배열에 저장
            for(int j=i; j<=1000000; j+=i){
                sum[j] += i;
            }
        }
        for(int i=1; i<=1000000; i++) sum[i] += sum[i-1]; //SUM 배열의 값을 누적으로 저장.
    }
}