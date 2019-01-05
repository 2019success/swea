package difficulty3;

import java.io.*;

public class Solution4047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i=0;
        int T = Integer.parseInt(br.readLine());
        while(i<T){
            i++;
            int[] array = new int[53];
            String input = br.readLine();
            String str;
            for(int j=1; j<=input.length()/3; j++){
                String cardNumber ="";
                int number;
                str = input.substring( (j-1)*3, j*3);
                for(int k=1; k<str.length(); k++){
                    cardNumber = cardNumber.concat(String.valueOf(str.charAt(k)));
                }
                number = Integer.parseInt(cardNumber);
                if(str.charAt(0)=='S') array[number]++;
                else if(str.charAt(0)=='D') array[13+number]++;
                else if(str.charAt(0)=='H') array[26+number]++;
                else if(str.charAt(0)=='C') array[39+number]++;
            }
            int count=1;
            int haveCard=0;
            boolean flag=true;
            bw.write("#" + i + " ");

            for(int k=1; k<array.length; k++){
                if(array[k]>=2) {
                    bw.write("ERROR");
                    flag=false;
                    break;
                }
            }

            for(int k=1; k<array.length; k++){
                if(array[k]==1) haveCard++;
                if((k==13*count) && flag){
                    bw.write(13-haveCard+" ");
                    count++;
                    haveCard=0;
                }
            }
            bw.write("\n");
        }

        bw.close();
    }
}
