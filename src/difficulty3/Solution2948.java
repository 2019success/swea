package difficulty3;

import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Solution2948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        int T = Integer.parseInt(br.readLine());
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        PriorityQueue<String> pq2 = new PriorityQueue<>();
        StringTokenizer st1;
        StringTokenizer st2;
        while(i<=T){
            int count=0;
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            st1 = new StringTokenizer(br.readLine());
            st2 = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) pq1.add(st1.nextToken());
            for(int j=0; j<M; j++) pq2.add(st2.nextToken());
            boolean flag = true;
            while(flag){
                if(pq1.isEmpty() || pq2.isEmpty()) flag = false;
                int compare =  pq1.peek().compareTo(pq2.peek());
                if(compare<0) pq1.poll();
                else if(compare>0) pq2.poll();
                else {
                    pq1.poll();
                    pq2.poll();
                    count++;
                }
            }
            bw.write("#"+ i + " "+ count+"\n");
            i++;
        }
        bw.close();
    }
}