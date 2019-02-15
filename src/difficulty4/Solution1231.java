package difficulty4;

import java.io.*;

public class Solution1231 {
    private static String[] data;
    private static int N;
    private static String result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase=0;
        while(testCase<10) {
            int i=0;
            N = Integer.parseInt(br.readLine());
            data = new String[N+1];
            while (i < N) {
                String[] input = br.readLine().split(" ");
                int index = Integer.parseInt(input[0]);
                data[index] = input[1];
                i++;
            }
            result = "";
            inorder(1);
            testCase++;
            bw.write("#" + testCase + " " + result + "\n");
        }
        bw.close();
    }
    private static void inorder(int index){
        if(2*index <= N) inorder(2*index);
        result = result.concat(data[index]);
        if(2*index+1 <= N) inorder(2*index+1);
    }
}