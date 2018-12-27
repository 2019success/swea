package difficulty2;

import java.io.*;

public class Solution1948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int T = Integer.parseInt(br.readLine());
        int i =1;
        int result=0;
        int month=0;
        while(i<=T){
            String[] strNum = br.readLine().split(" ");
            int[] intNum = new int[4];
            for(int j=0; j<intNum.length; j++){
                intNum[j] = Integer.parseInt(strNum[j]);
            }
            for(int j=intNum[0]; j<intNum[2];j++ ){
                result += day[j-1];
            }
            result = result-intNum[1]+intNum[3]+1;

            bw.write("#"+ i + " " + result+"\n");
            result =0;
            i++;
        }
        bw.close();
    }
}