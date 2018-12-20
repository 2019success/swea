package difficulty2;
import java.io.*;

public class Solution1970 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        int T = Integer.parseInt(br.readLine());
        int money[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        int i=1;
        int N;
        while(i<=T){
            N = Integer.parseInt(br.readLine());
            System.out.format("#%d\n", i);
            for(int u : money){
                System.out.format("%d ", N/u);
                N%=u;
            }
            System.out.format("\n");
            i++;
        }
    }
}
