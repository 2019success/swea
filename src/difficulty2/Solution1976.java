package difficulty2;

import java.io.*;

public class Solution1976 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));
        int T = Integer.parseInt(br.readLine());
        int i=1;
        int sum=0;
        int input[] = new int[4];
        int hour=0;
        int minutes=0;
        while(i<=T) {
            String num[] = br.readLine().split(" ");
            for(int j=0; j<num.length; j++){
                input[j] = Integer.parseInt(num[j]);
                if (j % 2 == 0) {
                    hour += input[j];
                } else {
                    minutes += input[j];
                }
            }
            if(hour>=12 && hour<=24){
                hour-=12;
            }
            if(minutes>=60){
                hour+=1;
                minutes -= 60;
            }
            bw.write("#" + i + " " + hour +" "+ minutes+"\n");
            hour=0;
            minutes=0;
            i++;
        }
        bw.close();
    }
}
