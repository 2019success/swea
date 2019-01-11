package difficulty3;

import java.io.*;
import java.util.StringTokenizer;

public class Solution6485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            StringTokenizer st;
            int N = Integer.parseInt(br.readLine());
            int[] check=new int[2*N];
            int index=0;
            for(int j=0; j<N; j++){
                st = new StringTokenizer((br.readLine()));
                while(st.hasMoreTokens()){
                    check[index] = Integer.parseInt(st.nextToken());
                    index++;
                }
            }
            int P = Integer.parseInt(br.readLine());
            bw.write("#"+ i + " ");
            for(int j=0; j<P; j++){
                int count=0;
                int busStop = Integer.parseInt(br.readLine());
                int pIndex = 0;
                for(int k=0; k<N; k++){
                    if(check[pIndex]<=busStop && busStop<=check[pIndex+1]){
                        count++;
                        pIndex+=2;
                        continue;
                    }
                    pIndex+=2;
                }
                bw.write(count+ " ");
            }
            bw.write("\n");
            i++;
        }
        bw.close();
    }
}