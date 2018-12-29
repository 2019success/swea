package difficulty3;

import java.io.*;
import java.util.*;

public class Solution5948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int i =1;
        while(i<=T){
            String[] strNum = br.readLine().split(" ");
            int[] num = new int[7];
            for(int j=0; j<strNum.length; j++){
                num[j] = Integer.parseInt(strNum[j]);
            }
            Set<Integer> set = new HashSet<>();
            for(int j=0; j<num.length-2; j++){
                for(int k=j+1; k<num.length-1; k++){
                    for(int l=k+1; l<num.length; l++){
                        set.add(num[j] + num[k] + num[l]);
                    }
                }
            }
            List<Integer> list = new ArrayList<>(set);
            Collections.sort(list);
            Collections.reverse(list);
            bw.write("#"+ i+" " + list.get(4)+"\n");
            i++;
        }
        bw.close();
    }
}
