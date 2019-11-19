package difficulty3;

import java.io.*;

public class Solution1217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i =1;
        while(i<=10){
            int T = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            int result = numberSqrt(N, M);
            bw.write("#" + T + " " + result + "\n");
            i++;
        }
        bw.close();
    }
    private static int numberSqrt(int number, int count){
        if(count == 0)
            return 1;
        return number * numberSqrt(number, count-1);
    }
    
}
