package difficulty3;

import java.io.*;
import java.util.StringTokenizer;

public class Solution3282 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int K = Integer.parseInt(input[1]);
            Weight_Value[] weight_value = new Weight_Value[N+1];
            int[][] dp = new int[N+1][K+1];
            StringTokenizer st;
            for(int j=1; j<=N; j++){
                st = new StringTokenizer(br.readLine());
                weight_value[j] = new Weight_Value(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            }

            for(int j=1; j<=N; j++){ //item
                for(int k=1; k<=K; k++){ //가방
                    if(weight_value[j].weight>k){
                        dp[j][k] = dp[j-1][k];
                    }
                    else{
                        dp[j][k] = Math.max(dp[j-1][k], weight_value[j].value+dp[j-1][k-weight_value[j].weight]);
                    }
                }
            }
            bw.write("#" + i+ " " + dp[N][K]+"\n");
            i++;
        }
        bw.close();
    }
}
class Weight_Value{
    int weight;
    int value;
    public Weight_Value(int weight, int value){
        this.weight = weight;
        this.value = value;
    }
}
