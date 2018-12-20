package difficulty2;

import java.io.*;

public class Solution1940 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        int T = Integer.parseInt(br.readLine());
        int i=1;
        int nowSpeed=0;
        int move=0;

        while(i<=T){
            int N = Integer.parseInt(br.readLine());
            String input;
            for(int j=0; j<N; j++){
                input = br.readLine();

                if(input.charAt(0)=='1'){
                    nowSpeed+= input.charAt(2)-48;
                    move += nowSpeed*1;
                }
                else if(input.charAt(0)=='2'){
                    if(input.charAt(2)-48 > nowSpeed){
                        nowSpeed = 0;
                    }
                    else {
                        nowSpeed -= input.charAt(2) - 48;
                        move += nowSpeed * 1;
                    }
                }
                else move+= nowSpeed*1;
            }
            bw.write("#"+i+" "+move+"\n");
            move=0;
            nowSpeed=0;
            i++;
        }
        bw.close();
    }


}
