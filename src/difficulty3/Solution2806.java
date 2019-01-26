package difficulty3;

import java.io.*;

public class Solution2806 {
    static int count=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i =1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            count=0;
            int N = Integer.parseInt(br.readLine());
            int[] array = new int[N+1];
            solve(array, 0, N);
            bw.write("#" + i + " " + count+"\n");
            i++;
        }
        bw.close();
    }
    private static void solve(int[] array, int q, int N) {
        if(!promise(array, q)) return;
        if(q==N){
            count++;
            return;
        }
        for(int i=1; i<=N; i++){
            array[q+1] = i;
            solve(array, q+1, N);
        }

    }
    private static boolean promise(int[] array, int q){
        for(int i=1; i<q; i++) {
            if(array[q] == array[i] || Math.abs(q-i) == Math.abs(array[q]-array[i])) return false;
        }
        return true;
    }
}
