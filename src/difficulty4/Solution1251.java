package difficulty4;

import java.io.*;
import java.util.StringTokenizer;

public class Solution1251 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i=1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T) {
            int N = Integer.parseInt(br.readLine());
            Island[] island = new Island[N];
            boolean[] visited = new boolean[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                island[j] = new Island();
                island[j].x = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                island[j].y = Integer.parseInt(st.nextToken());
                island[j].length = Long.MAX_VALUE;
            }
            double E = Double.parseDouble(br.readLine());
            long minDistanceSum = prim(island, N, visited);
            bw.write("#" + i + " " + String.format("%.0f", minDistanceSum*E)+"\n");
            i++;
        }
        bw.close();
    }
    private static long prim(Island[] island, int N, boolean[] visited){
        island[0].length=0;
        long sum=0;
        for(int i=0; i<N; i++){
            long weight = Long.MAX_VALUE;
            int index=0;
            for(int j=0; j<N; j++){ //현재위치에서 최소 거리 찾기.
                if(!visited[j] && weight>island[j].length){
                    weight = island[j].length;
                    index = j;
                }
            }
            sum+=weight;
            visited[index] = true;
            for(int j=0; j<N; j++){ //현재 위치에서 다음 위치 거리 업데이트.
                if(!visited[j] && index!=j){
                    weight = (long)Math.pow(island[index].x-island[j].x,2) + (long)Math.pow(island[index].y-island[j].y,2);
                    if(island[j].length > weight) island[j].length=weight;
                }
            }
        }
        return sum;
    }
}
class Island{
    int x;
    int y;
    long length;
}
