package difficulty2;

import java.io.*;

public class Solution2007 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int i=1;
        while(i<=T){
            int strLength=0;
            String str = br.readLine();
            for(int j=1; j<=10; j++){
                String subString = str.substring(0,j);
                String subStringNext = str.substring(j,j+j);
                if(subString.equals(subStringNext)){
                    strLength = j;
                    break;
                }
            }
            bw.write("#" + i +" " + strLength+"\n");
            i++;
        }
        bw.close();
    }
}
