package difficulty3;

import java.io.*;
import java.util.Scanner;

public class Solution3809 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i =1;
        int T = sc.nextInt();

        while(i<=T){
            StringBuilder sb = new StringBuilder();
            int N = sc.nextInt();

            for(int j=0; j<N; j++){
                sb.append(sc.next());
            }
            int find=0;
            while(true){
                if(!sb.toString().contains(String.valueOf(find))){
                    break;
                }
                find++;
            }
            bw.write("#" + i + " " + find+ "\n");
            i++;
        }
        bw.close();
    }
}
