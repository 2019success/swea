package difficulty3;

import java.io.*;
import java.util.StringTokenizer;

public class Solution1873 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int i =1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            String[][] map = new String[H][W];
            for(int j=0; j<H; j++){
                String[] input = br.readLine().split("");
                for(int k=0; k<W; k++){
                    map[j][k] = input[k];
                }
            }
            int N = Integer.parseInt(br.readLine());
            String instruction = br.readLine();
            int count=0;
            for(int j=0; j<H; j++){
                for(int k=0; k<W; k++){
                    if(map[j][k].equals(">") || map[j][k].equals("<") || map[j][k].equals("^") || map[j][k].equals("v")){
                        for(int l=0; l<N; l++){
                            String temp = String.valueOf(instruction.charAt(l));
                            count++;
                            switch(temp) {
                                case "U":
                                    map[j][k]="^";
                                    if(j!=0 && map[j-1][k].equals(".")) {
                                        map[j][k] = ".";
                                        map[j - 1][k] = "^";
                                        j--;
                                    }
                                    break;
                                case "D":
                                    map[j][k]="v";
                                    if(j!= H-1 && map[j+1][k].equals(".")){
                                        map[j][k]=".";
                                        map[j+1][k]="v";
                                        j++;
                                    }
                                    break;
                                case "L":
                                    map[j][k]="<";
                                    if(k!=0 && map[j][k-1].equals(".")){
                                        map[j][k]=".";
                                        map[j][k-1]="<";
                                        k--;
                                    }
                                    break;
                                case "R":
                                    map[j][k]=">";
                                    if(k!=W-1 && map[j][k+1].equals(".")){
                                        map[j][k]=".";
                                        map[j][k+1]=">";
                                        k++;
                                    }
                                    break;
                                case "S":
                                    shooting(j, k, map, H, W);
                                    break;
                            }
                        }
                        if(count == N) break;
                    }
                }
                if(count == N) break;
            }
            bw.write("#" + i +" ");
            for(int j=0; j<H; j++){
                for(int k=0; k<W; k++){
                    bw.write(map[j][k]+"");
                }
                bw.write("\n");
            }
            i++;
        }
        bw.close();
    }
    static private void shooting(int x, int y, String[][] map, int height, int width){
        if(map[x][y].equals("<")) {
            for(int j=y-1; j>=0; j--) {
                if (map[x][j].equals("*")) {
                    map[x][j] = ".";
                    break;
                }
                else if(map[x][j].equals("#")) break;
            }
        }
        else if(map[x][y].equals("^")) {
            for(int j=x-1; j>=0; j--) {
                if (map[j][y].equals("*")) {
                    map[j][y] = ".";
                    break;
                }
                else if(map[j][y].equals("#")) break;
            }
        }
        else if(map[x][y].equals("v")){
            for(int j=x+1; j<height; j++) {
                if(map[j][y].equals("*")) {
                    map[j][y] = ".";
                    break;
                }
                else if(map[j][y].equals("#")) break;
            }
        }
        else if(map[x][y].equals(">")){
            for(int j=y+1; j<width; j++) {
                if (map[x][j].equals("*")) {
                    map[x][j] = ".";
                    break;
                }
                else if(map[x][j].equals("#")) break;
            }
        }
    }
}
