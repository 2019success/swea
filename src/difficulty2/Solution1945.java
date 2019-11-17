package difficulty2;
import java.io.*;

public class Solution1945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));
        int soinsoo[] = {2, 3, 5, 7, 11};
        int result[] = new int[5];
        int T = Integer.parseInt(br.readLine());
        int i = 1;
        while(i<=T){
            int N = Integer.parseInt(br.readLine());
            while(N>1){
                for(int j=0; j<soinsoo.length; j++){
                    if(N%soinsoo[j]==0){
                        result[j]++;
                        N /=soinsoo[j];
                    }
                }
            }
            bw.write("#" + i + " ");
            for(int k=0; k<result.length; k++){
                bw.write(result[k]+" ");
                result[k]=0;
            }
            bw.write("\n");
            i++;
        }
        
        bw.close();
    }
}
