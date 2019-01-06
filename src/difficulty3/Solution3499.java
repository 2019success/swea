package difficulty3;

import java.io.*;

public class Solution3499 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        int T = Integer.parseInt(br.readLine());

        while(i<=T){
            String N = br.readLine();
            String length;
            String[] card = br.readLine().split(" ");

            length = String.format("%.0f", Double.parseDouble(N) / 2);
            int arrayLength = Integer.parseInt(length);

            bw.write("#" + i + " ");
            for(int j=0; j<arrayLength; j++){
                bw.write(card[j]+ " ");
                if(card.length%2==1 && arrayLength-1==j) break;
                bw.write(card[j + arrayLength]+ " ");
            }
            bw.write("\n");
            i++;
        }
        bw.close();
    }
}
