package difficulty4;

import java.io.*;
import java.util.StringTokenizer;

public class Solution3143 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = 1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String A = st.nextToken();
            String B = st.nextToken();
            int result=0;
            for(int j=0; j<A.length(); j++){
                int k=0;
                if(A.charAt(j) == B.charAt(0)){
                    while(A.charAt(j+k) == B.charAt(k)){
                        k++;
                        if(j+k == A.length() || k == B.length()) break;
                    }
                    if(k == B.length()) {
                        result++;
                    }
                    j+=k-1;
                }
            }
            bw.write("#" + i + " " + (A.length()- (B.length()*result-result)) + "\n");
            i++;
        }
        bw.close();
    }
}
