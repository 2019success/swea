package difficulty3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution3750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        int T = Integer.parseInt(br.readLine());
        List<Integer> array = new ArrayList<>();
        while(i<=T){
            String inputNumber = br.readLine();
            int sum=0;
            boolean flag = true;
            while(flag) {
                for (int j = 0; j < inputNumber.length(); j++) {
                    array.add(inputNumber.charAt(j) - 48);
                    sum += array.get(j);
                }
                if(sum>=1 && sum <=9) {
                    bw.write("#" + i + " " + sum+"\n");
                    flag=false;
                }
                inputNumber = String.valueOf(sum);
                sum=0;
                array.clear();
            }
            i++;
        }
        bw.close();
    }
}
