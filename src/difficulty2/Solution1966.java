package difficulty2;

import java.io.*;

public class Solution1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        int i=1;
        while(i<=T){
            int N = Integer.parseInt(br.readLine());
            int [] intNum = new int[N];
            String[] strNum = br.readLine().split(" ");
            for(int j=0; j<intNum.length; j++){
                intNum[j] = Integer.parseInt(strNum[j]);
            }
            for(int j=0; j<intNum.length; j++){ //0~4
                for(int k=1; k<intNum.length-j; k++){
                    if(intNum[k-1]>intNum[k]){
                        int temp=intNum[k];
                        intNum[k] = intNum[k-1];
                        intNum[k-1] = temp;
                    }
                }
            }
            bw.write("#" + i+" ");
            for(int j=0; j<intNum.length; j++){
                bw.write(intNum[j]+" ");
            }
            bw.write("\n");
            i++;
        }
        bw.close();
    }
}
