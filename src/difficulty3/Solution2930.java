package difficulty3;

import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Solution2930 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i=1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            StringTokenizer st;
            int N = Integer.parseInt(br.readLine());
            bw.write("#" + i + " ");
            for(int j=0; j<N; j++){
                st = new StringTokenizer(br.readLine());
                if(Integer.parseInt(st.nextToken()) == 1) {
                    pq.add(-1*Integer.parseInt(st.nextToken()));
                    continue;
                }
                if(pq.isEmpty()){
                    bw.write("-1 ");
                    continue;
                }
                bw.write(-1*pq.poll()+" ");
            }
            bw.write("\n");
            pq.clear();
            i++;
        }
        bw.close();
    }
}