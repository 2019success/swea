package difficulty3;

import java.io.*;

public class Solution4789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i =1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            int needPeople=0;
            String input = br.readLine();
            int clapPeople = input.charAt(0)-48;
            for(int j=1; j<input.length(); j++){
                if(input.charAt(j)-48 == 0) continue;
                if(clapPeople >= j) {
                    clapPeople +=input.charAt(j)-48;
                }
                else{
                    needPeople += j-clapPeople;
                    clapPeople = (input.charAt(j)-48 + j);
                }
            }
            bw.write("#" + i + " " + needPeople+"\n");
            i++;
        }
        bw.close();
    }
}
