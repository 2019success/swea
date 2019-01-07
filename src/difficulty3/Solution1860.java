package difficulty3;

import java.io.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution1860 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = 1;
        int T = Integer.parseInt(br.readLine());
        while (i <= T) {
            String[] input = br.readLine().split(" ");
            List<Integer> array = new ArrayList<>();
            String result = "Possible";
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            int K = Integer.parseInt(input[2]);
            input = br.readLine().split(" ");
            for(String j:input){
                array.add(Integer.parseInt(j));
            }
            Collections.sort(array);
            int bread;
            for(int k=1; k<=array.size(); k++){
                bread = array.get(k-1)/M * K;
                if(k>bread){
                    result = "Impossible";
                    break;
                }
            }
            bw.write("#" + i + " " + result+"\n");
            i++;
        }
        bw.close();
    }
}