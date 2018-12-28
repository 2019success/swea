package difficulty2;

import java.io.*;
public class Solution2005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int i=1;
        while(i<=T){
            int N = Integer.parseInt(br.readLine());
            int[] arrayCopy = new int[N];
            bw.write("#" + i + "\n");
            for(int j=1; j<=N; j++){
                int[] array = new int[j];
                array[0]=1;
                array[j-1]=1;
                for(int k=1; k<j-1; k++){
                    array[k] = arrayCopy[k-1]+arrayCopy[k];
                }
                for(int k=0; k<array.length; k++){
                    bw.write(array[k]+" ");
                }
                System.arraycopy(array, 0, arrayCopy,0 ,array.length);
                bw.write("\n");
            }
            i++;
        }
        bw.close();
    }
}
