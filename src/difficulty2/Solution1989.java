package difficulty2;
import java.io.*;

public class Solution1989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        int T = Integer.parseInt((br.readLine()));
        int i=1;
        String reverseStr="";
        while(i<=T){
            String str = br.readLine();
            for(int j=str.length()-1; j>=0; j--){
                reverseStr += String.valueOf(str.charAt(j));
            }
            if(str.equals(reverseStr)){
                bw.write("#"+ i+ " 1\n");
            }
            else bw.write("#" + i+ " 0\n");
            reverseStr="";
            i++;
        }
        bw.close();
    }
}
