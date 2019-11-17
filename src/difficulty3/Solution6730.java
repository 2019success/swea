package difficulty3;

import java.io.*;
import java.util.StringTokenizer;

public class Solution6730 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i=1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            int increaseMax = 0;
            int decreaseMax = 0;
            int N = Integer.parseInt(br.readLine());
            int[] barrier = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                barrier[j] =Integer.parseInt(st.nextToken());
            }
            for(int j=0; j<N-1; j++){
                int compare = barrier[j+1]-barrier[j];
                if(compare>0){
                    if(increaseMax < compare)
                    increaseMax = compare;
                }
                else{
                    if(decreaseMax < Math.abs(compare))
                        decreaseMax = Math.abs(compare);
                }
            }
            bw.write("#" + i + " " + increaseMax + " " + decreaseMax + "\n");
            i++;
        }
        bw.close();
    }
}
