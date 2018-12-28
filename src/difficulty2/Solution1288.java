package difficulty2;

import java.io.*;

public class Solution1288 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int i=1;
        while(i<=T){
            int[] count = new int[10];
            String strNum = br.readLine();
            int N = Integer.parseInt(strNum);
            int k=1;
            boolean flag=true;
            while(flag){
                flag=false;
                for(int j=0; j<strNum.length(); j++){
                    count[strNum.charAt(j)-48]++;
                }
                k++;
                for(int j=0; j<count.length; j++){
                    if(count[j]==0){
                        strNum = String.valueOf(k*N);
                        flag=true;
                        break;
                    }
                }
            }
            bw.write("#" + i +" " + strNum+"\n");
            i++;
        }
        bw.close();
    }
}
