package difficulty2;
import java.io.*;
import java.util.Arrays;

public class Solution1984 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));
        int T = Integer.parseInt(br.readLine());
        int i=1;
        int sum=0;
        int input[] = new int[10];
        while(i<=T) {
            String[] num = br.readLine().split(" ");
            for(int j=0; j<num.length; j++){
                input[j] = Integer.parseInt(num[j]);
            }
            Arrays.sort(input);
            for(int j=1; j<input.length-1; j++){
                sum+=input[j];
            }
            bw.write( String.format("#%d %.0f",i,(double)sum/8)+"\n");
            sum=0;
            i++;
        }
        
        bw.close();
    }
}
