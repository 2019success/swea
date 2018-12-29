package difficulty3;

import java.io.*;

public class Solution5431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]); //학생 수
            int K = Integer.parseInt(input[1]); //과제를 제출한 사람
            int[] studentNo = new int[N];
            int[] passNo = new int[K];

            for(int j=0; j<N; j++) {
                studentNo[j] = j+1;
            }
            input = br.readLine().split(" ");
            for(int j=0; j<K; j++){
                passNo[j] = Integer.parseInt(input[j]);
                for(int k=0; k<N; k++){
                    if(studentNo[k]==passNo[j]){
                        studentNo[k]=0;
                    }
                }
            }
            bw.write("#" + i + " ");
            for(int j=0; j<N; j++){
                if(studentNo[j]!=0){
                    bw.write(studentNo[j]+" ");
                }
            }
            bw.write("\n");
            i++;
        }
        bw.close();
    }
}
