package difficulty3;

import java.io.*;

public class Solution1493 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = 1;
        int T = Integer.parseInt(br.readLine());

        while(i<=T){
            String[] input = br.readLine().split(" ");
            int[] xyPosition = new int[4];
            int p = Integer.parseInt(input[0]);
            int q = Integer.parseInt(input[1]);
            Pair pair1=position(p);
            xyPosition[0]=pair1.x;
            xyPosition[1]=pair1.y;
            Pair pair2=position(q);
            xyPosition[2]=pair2.x;
            xyPosition[3]=pair2.y;
            int xSum = xyPosition[0] + xyPosition[2];
            int ySum = xyPosition[1] + xyPosition[3];
            int length = xSum+ySum-1;
            int compare = 0;
            for(int k=1; k<=length; k++){
                compare+=k;
            }
            int score = compare - (length-xSum);
            bw.write("#" + i + " " + score+"\n");
            i++;
        }
        bw.close();
    }
    static private Pair position(int number){
        int j=0;
        int sum=0;
        while(true){
            sum+=j;
            if(sum>=number) break; //6까지 21임
            j++;
        }
        int result=0;
        for(int k=1; k<=j; k++){
            result+=k;
        }
        int xPosition = j - (result-number);
        int yPosition = j - xPosition+1;
        return new Pair(xPosition,yPosition);
    }

}
class Pair{
    int x,y;
    public Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}