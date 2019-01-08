package difficulty3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Solution1221 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i=1;
        int T = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        String[] strNumber ={"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};
        for(int j=0; j<strNumber.length; j++){
            map.put(strNumber[j], j);
        }
        while(i<=T){
            int[] count = new int[10];
            StringBuilder sb = new StringBuilder();
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[1]);
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                count[map.get(st.nextToken())]++;
            }
            sb.append(input[0]+ " ");
            for(int j=0; j<count.length; j++){
                for(int k=0; k<count[j]; k++){
                    sb.append(strNumber[j]+" ");
                }
            }
            System.out.println(sb);
            i++;
        }
    }
}