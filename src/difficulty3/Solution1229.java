package difficulty3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution1229 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        while(i<=10){
            List<String> array = new ArrayList<>();
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                array.add(st.nextToken());
            }
            N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                String instruction = st.nextToken();
                switch(instruction){
                    case "I":
                        int iIndex = Integer.parseInt(st.nextToken());
                        int iLength = Integer.parseInt(st.nextToken());
                        for(int k=0; k<iLength; k++){
                            array.add(iIndex+k, st.nextToken());
                        }
                        break;
                    case "D" :
                        int dIndex = Integer.parseInt(st.nextToken());
                        int dLength = Integer.parseInt(st.nextToken());
                        for(int k=0; k<dLength; k++){
                            array.remove(dIndex);
                        }
                        break;
                }
            }
            bw.write("#" + i +" ");
            for(int j=0; j<10; j++){
                bw.write(array.get(j)+ " ");
            }
            bw.write("\n");
            i++;
        }
        bw.close();
    }
}
