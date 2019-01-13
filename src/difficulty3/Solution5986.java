package difficulty3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution5986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i =1;
        int T = Integer.parseInt(br.readLine());
        boolean[] flag = new boolean[1000];
        flag[0] = true;
        flag[1] = true;
        while(i<=T){
            int N = Integer.parseInt(br.readLine());
            int result=0;
            List<Integer> array = new ArrayList<>();
            for(int j=2; j<Math.sqrt(flag.length); j++){
                int k=2;
                while(j*k<=999){
                    if(flag[j*k]) {
                        k++;
                        continue;
                    }
                    flag[j*k]= true;
                    k++;
                }
            }
            for(int j=2; j<=999; j++){
                if(!flag[j]) array.add(j);
            }

            for(int j=array.size()-1; j>=0; j--){
                int z = array.get(j);
                int temp = N-z;
                if(temp>3)
                {
                    int l=0;
                    while(array.get(l)<temp){
                        int y=array.get(l);
                        int x = temp-y;
                        if(x<=y && y<=z){
                            for(int k: array){
                                if(k==x) {
                                    result++;
                                    break;
                                }
                                if(k>x) break;
                            }
                        }
                        l++;
                    }
                }
            }
            bw.write("#"+ i + " " + result+"\n");
            i++;
        }
        bw.close();
    }
}
