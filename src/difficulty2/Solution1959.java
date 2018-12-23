package difficulty2;
import java.io.*;

public class Solution1959 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        int T = Integer.parseInt(br.readLine());
        int result=0;
        while(i<=T){
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            int[] nArray = new int[N];
            int[] mArray = new int[M];
            String[] nArr = br.readLine().split(" ");
            String[] mArr = br.readLine().split(" ");
            for(int j=0; j<N; j++){
                nArray[j] = Integer.parseInt(nArr[j]);
            }
            for(int j=0; j<M; j++){
                mArray[j] = Integer.parseInt(mArr[j]);
            }
            int count=0;
            int max=0;
            if(N<M){
                while(count!=M-N+1){
                    for (int k = count; k < N + count; k++) {
                        for (int j = 0; j < N; j++) {
                            result += nArray[j] * mArray[k];
                            k++;
                        }
                        max = Math.max(result, max);
                        result=0;
                    }
                    count++;
                }
            }
            else{
                while(count!=N-M+1){
                    for(int k=count;k<M+count; k++){
                        for(int j=0; j<M; j++){
                            result += mArray[j]*nArray[k];
                            k++;
                        }
                        max = Math.max(result, max);
                        result=0;
                    }
                    count++;
                }
            }
            bw.write("#" + i + " " + max+"\n");
            i++;
        }
        bw.close();
    }
}
