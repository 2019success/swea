package difficulty3;

import java.io.*;

public class Solution5356 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            String[] input = new String[5];
            for(int j=0; j<5; j++){
                input[j] = br.readLine();
            }
            int max=0;
            for(int j=0; j<5; j++){
                if(max<input[j].length()) max = input[j].length();
            }
            String str="";
            for(int j=0; j<max; j++){
                for(int k=0; k<5; k++){
                    if(j<input[k].length()) str = str.concat(String.valueOf(input[k].charAt(j)));
                }
            }
            bw.write("#"+ i + " " +str+"\n");
            i++;
        }
        bw.close();
    }
}