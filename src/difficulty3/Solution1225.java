package difficulty3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution1225 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        while(i<=10) {
            int testNumber = Integer.parseInt(br.readLine());
            List<Integer> array = new ArrayList<>();
            String[] input = br.readLine().split(" ");

            for(String a : input){
                array.add(Integer.parseInt(a));
            }

            while(array.get(array.size()-1)!=0){
                for(int j=1; j<=5; j++){
                    int temp = array.get(0)-j;
                    array.remove(0);
                    if(temp<=0) {
                        array.add(array.size(), 0);
                        break;
                    }
                    else array.add(array.size(), temp);
                }
            }

            bw.write("#" + testNumber + " ");

            for(int a : array){
                bw.write(a+" ");
            }

            bw.write("\n");
            i++;
        }
        
        bw.close();
    }
}
