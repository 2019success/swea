package difficulty2;
import java.io.*;

public class Solution1926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));
        int N = Integer.parseInt(br.readLine());
        String number[] = new String[N];
        int count=0;
        for(int i=1; i<=number.length; i++) {
            number[i-1] = String.valueOf(i);
            for(int j=0; j<number[i-1].length(); j++){
                if(((int)number[i-1].charAt(j))%3==0 && (number[i-1].charAt(j))!='0'){
                    count++;
                }
            }
            if(count==1){
                number[i-1] ="-";
            }
            else if(count==2){
                number[i-1] ="--";
            }else if(count ==3){
                number[i-1] ="---";
            }
            count=0;
        }
        for(int i=0; i<number.length; i++){
            bw.write(number[i]+" ");
        }
        
        bw.close();
    }
}
