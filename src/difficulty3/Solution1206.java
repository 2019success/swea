package difficulty3;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution1206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        while(i<=10){
            int N = Integer.parseInt(br.readLine());
            int[] building = new int[N];
            int[] temp = new int[4];
            int result=0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                building[j] = Integer.parseInt(st.nextToken());
            }
            for(int j=2; j<N-2; j++){
                int index=0;
                temp[index] = building[j] - building[j-2];
                index++;
                temp[index] = building[j] - building[j-1];
                index++;
                temp[index] = building[j] - building[j+2];
                index++;
                temp[index] = building[j] - building[j+1];
                Arrays.sort(temp);
                if(temp[0]>0) result+= temp[0];
            }
            bw.write("#"+ i + " " + result+"\n");
            i++;
        }
        
        bw.close();
    }
}
