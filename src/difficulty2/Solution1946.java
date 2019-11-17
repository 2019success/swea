package difficulty2;
import java.io.*;

public class Solution1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));
        int T = Integer.parseInt(br.readLine());
        int i=1;
        String result="";
        while(i<=T){
            int N = Integer.parseInt(br.readLine());
            for(int j=0; j<N; j++) {
                String input[] = br.readLine().split(" ");
                for (int k = 0; k < Integer.parseInt(input[1]); k++) {
                    result += input[0];
                }
            }
            int count=0;
            bw.write("#"+i+"\n");
            for(int k=0; k<result.length()/10; k++){
                bw.write(result.substring(k*10, (k+1)*10)+"\n");
                count++;
            }
            bw.write(result.substring(count*10)+"\n");
            result="";
            i++;
        }
        
        bw.close();
    }
}
