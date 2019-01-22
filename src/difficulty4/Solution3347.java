package difficulty4;

import java.io.*;
import java.util.StringTokenizer;

public class Solution3347 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i=1;
        int T= Integer.parseInt(br.readLine());
        StringTokenizer st;
        while(i<=T){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[] list = new int[N];
            int[] people = new int[M];
            int[] vote = new int[N];
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) list[j] = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) people[j] = Integer.parseInt(st.nextToken());
            for(int j=0; j<M; j++){
                for(int k=0; k<N; k++){
                    if(people[j]>=list[k]){
                        vote[k]++;
                        break;
                    }
                }
            }
            int max=0;
            int index=0;
            for(int j=0; j<vote.length; j++){
                if(max < vote[j]) {
                    max = vote[j];
                    index = j;
                }
            }
            bw.write("#" + i + " " + (index+1)+"\n");
            i++;
        }
        bw.close();
    }
}
