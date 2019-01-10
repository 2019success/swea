package difficulty3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution1234 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        while(i<=10){
            List<Integer> array = new ArrayList<>();
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            for(int j=0; j<N; j++){
                array.add(input[1].charAt(j)-48);
            }
            while(true) {
                String s =array.toString();
                for (int j = 0; j < array.size()-1; j++) {
                    if (array.get(j).equals(array.get(j+1)) ) {
                        array.remove(j);
                        array.remove(j);
                    }
                }
                if(s.equals(array.toString()))break;
            }

            bw.write("#" + i + " ");
            for(int k : array){
                bw.write(k+"");
            }
            bw.write("\n");
            i++;
        }
        bw.close();
    }
}
