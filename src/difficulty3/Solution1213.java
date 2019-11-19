package difficulty3;

import java.io.*;

public class Solution1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        while(i<=10){
            int testNumber = Integer.parseInt(br.readLine());
            String found = br.readLine();
            char foundStart = found.charAt(0);
            String str = br.readLine();
            int result =0;
            for(int j=0; j<=str.length()-found.length(); j++){
                if(str.charAt(j)==foundStart){
                    int count=0;
                    for(int k=0; k<found.length(); k++) {
                        if (str.charAt(k+j) != found.charAt(k)) break;
                        else count++;
                    }
                    if(count == found.length()) result++;
                }
            }
            bw.write("#" + testNumber + " " + result+ "\n");
            i++;
        }
        
        bw.close();
    }
}
