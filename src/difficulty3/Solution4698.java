package difficulty3;

import java.io.*;

public class Solution4698 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            String[] input = br.readLine().split(" ");
            int D = Integer.parseInt(input[0]);
            int A = Integer.parseInt(input[1]);
            int B = Integer.parseInt(input[2]);
            boolean[] check = new boolean[B+1];
            check[0] = true;
            check[1] = true;
            for(int j=2; j<Math.sqrt(B); j++){
                if(!check[j]){
                    int k=2;
                    while(j*k<=B){
                        check[j*k]=true;
                        k++;
                    }
                }
            }
            int count=0;
            for(int j=A; j<=B; j++){
                if(!check[j]){
                    for(int k=j; k>0; k/=10){
                        if(k%10 == D){
                            count++;
                            break;
                        }
                    }
                }
            }
            bw.write("#" + i + " "+ count+"\n");
            i++;
        }
        bw.close();
    }
}
