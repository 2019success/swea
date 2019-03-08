package difficulty3;

import java.io.*;
import java.util.StringTokenizer;

public class Solution6900 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i =1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            String[] passNumbers = new String[N];
            int[] moneys = new int[N];
            String[] myNumber = new String[M];
            for(int j=0; j<N; j++){
                st = new StringTokenizer(br.readLine());
                String passNumber = st.nextToken();
                int money = Integer.parseInt(st.nextToken());
                passNumbers[j] = passNumber;
                moneys[j] = money;
            }
            for(int j=0; j<M; j++){
                myNumber[j] = br.readLine();
            }
            long sum=0;
            for(int number=0; number<M; number++){
                boolean flag = true;
                for (int j = 0; j < N; j++) {
                    for (int k=0;k<8; k++) {
                        if (passNumbers[j].charAt(k) == '*') continue;
                        else if(passNumbers[j].charAt(k)!=myNumber[number].charAt(k)){
                            flag = false;
                            break;
                        }
                        else flag = true;
                    }
                    if(flag) sum+=moneys[j];
                }
            }
            bw.write("#"+i + " " + sum+"\n");
            i++;
        }
        bw.close();
    }
}
