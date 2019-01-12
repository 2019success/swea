package difficulty3;

import java.io.*;

public class Solution4522 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i =1;
        int T = Integer.parseInt(br.readLine());

        while(i<=T){
            String input = br.readLine();
            String result = "Exist";
            boolean flag=true;
            int start=0;
            int end=input.length()-1;
            while(flag && start<input.length()/2){
                if(input.charAt(start) == input.charAt(end)){
                    start++;
                    end--;
                }
                else if(input.charAt(start) =='?' || input.charAt(end) =='?'){
                    start++;
                    end--;
                }
                else{
                    result = "Not exist";
                    break;
                }

            }
            bw.write("#"+ i + " " + result+"\n");
            i++;
        }
        bw.close();
    }
}