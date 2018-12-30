package difficulty3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution4406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i =1;
        int T= Integer.parseInt(br.readLine());
        List array = new ArrayList();
        while(i<=T){
            String input = br.readLine();
            for(int j=0; j<input.length(); j++){
                char moeum= input.charAt(j);
                    if (moeum != 'a' && moeum != 'e' && moeum != 'i' && moeum != 'o' && moeum != 'u')
                        array.add(input.charAt(j));
            }
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<array.size(); j++){
                sb.append(array.get(j));
            }
            bw.write("#" + i + " " + sb.toString()+ "\n");
            array.clear();
            i++;
        }
        bw.close();
    }
}
