package difficulty3;

import java.io.*;

public class Solution3032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            String[] input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            int x1=1;
            int x2=0;
            int y1=0;
            int y2=1;
            int x=0;
            int y=0;
            int tmp;
            int c = gcb(A,B);
            if(c == 1){
                while(A%B!=0){
                    int mok = A/B;
                    x = x1-x2*mok;
                    y = y1-y2*mok;
                    tmp = B;
                    B = A % B;
                    A = tmp;

                    tmp=x;
                    x1 = x2;
                    x2 = tmp;

                    tmp=y;
                    y1 = y2;
                    y2 = tmp;
                }
                bw.write("#" + i +" " + x +" " + y +"\n");
            }
            else{
                bw.write("-1\n");
            }
            i++;
        }
        bw.close();

    }
    static private int gcb(int a, int b){
        int temp;
        while(b!=0){
            if(a>b) a = a % b;
            else {
                temp = a;
                a = b;
                b = temp;
            }
        }
        return a;
    }
}