package difficulty3;

import java.io.*;
import java.util.StringTokenizer;

public class Solution2817 {
    private static int N;
    private static int K;
    private static int[] array;
    private static int answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int i=1;
        while(i<=T){
            answer=0;
            StringTokenizer st;
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            array = new int[N];
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) array[j] = Integer.parseInt(st.nextToken());
            solve(0,0);
            bw.write("#" + i + " "+ answer+"\n");
            i++;
        }
        bw.close();
    }
    private static void solve(int sum, int index){
        if(index==N) {
            if(sum==K)answer++;
            return ;
        }
        solve(sum+array[index], index+1);
        solve(sum, index+1);
    }
}
