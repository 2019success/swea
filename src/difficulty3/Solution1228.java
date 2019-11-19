package difficulty3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution1228 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        while(i<=10){
            List<String> array = new ArrayList<>();
            int N = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            for(int j=0; j<N; j++){
                array.add(input[j]);
            }
            N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                String instruction = st.nextToken();
                if(instruction.equals("I")){
                    int index = Integer.parseInt(st.nextToken());
                    int length = Integer.parseInt(st.nextToken());
                    for(int k=0; k<length; k++){
                        array.add(index+k, st.nextToken());
                    }
                }
            }

            bw.write("#"+ i +" ");
            for(int j=0; j<10; j++){
                bw.write(array.get(j)+" ");
            }
            bw.write("\n");
            i++;
        }
        
        bw.close();
    }
}
