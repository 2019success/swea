package difficulty3;

import java.io.*;
import java.util.Arrays;

public class Solution1240 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] change = {"0001101","0011001", "0010011", "0111101","0100011", "0110001", "0101111","0111011", "0110111","0001011" };
        int i=1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            String[] password = new String[8];
            int[] exchange = new int[8];
            int lastIndex=0;
            String[][] matrix = new String[N][M];
            for(int j=0; j<N; j++){
                input = br.readLine().split("");
                for(int k=0; k<M; k++){
                    matrix[j][k] = input[k];
                }
            }

            int count=0;
            for(int j=0; j<N; j++){
                  for(int k=M-1; k>=0; k--){
                      if(matrix[j][k].equals("1")){
                          lastIndex = k;
                          count++;
                          break;
                      }
                  }
                  if(count==1){
                      int index=0;
                      int cir=0;
                      String temp = "";
                      for(int k=lastIndex-55; k<=lastIndex; k++) {
                          temp = temp.concat(matrix[j][k]);
                          cir++;
                          if(cir ==7){
                              password[index] = temp;
                              index++;
                              temp="";
                              cir=0;
                          }

                      }
                      break;
                  }
            }
            for(int j=0; j<password.length; j++){
                for(int k=0; k<change.length; k++){
                    if(password[j].equals(change[k])){
                        exchange[j]=k;
                        break;
                    }
                }
            }
            int odd = (exchange[0] + exchange[2] + exchange[4] + exchange[6])*3;
            int even = exchange[1] + exchange[3] + exchange[5];
            int result=0;
            if((odd+even+exchange[7])%10 == 0){
                for(int j=0; j<exchange.length; j++){
                    result+=exchange[j];
                }
            }
            bw.write("#" + i + " " + result+"\n");
            i++;
        }
        
        bw.close();
    }
}
