package difficulty2;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Solution1983 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] grade = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
        int i =1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            String[] strNum = br.readLine().split(" ");
            int N = Integer.parseInt(strNum[0]);
            int K = Integer.parseInt(strNum[1]);
            String result=null;
            Double[] scoreArray = new Double[N];
            double sumScore;
            for(int j=0; j<N; j++){
                String[] strScore = br.readLine().split(" ");
                sumScore = (0.35*Integer.parseInt(strScore[0])) + (0.45*Integer.parseInt(strScore[1])) + (0.2*Integer.parseInt(strScore[2]));
                scoreArray[j] = sumScore;
            }
            double student = scoreArray[K-1];
            Arrays.sort(scoreArray, Collections.reverseOrder());

            for(int k=0; k<scoreArray.length; k++){
                if(student == scoreArray[k]){
                    int r = N/10;
                    result = grade[k/r];
                    break;
                }
            }
            bw.write("#"+i+" "+result+"\n");
            i++;
        }
        bw.close();
    }
}
