package difficulty3;

import java.io.*;
import java.util.ArrayList;

public class Solution4676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int i =1;
        ArrayList array = new ArrayList();

        while(i<=T){
            String str = br.readLine();
            int H = Integer.parseInt(br.readLine());
            String[] strIndex = br.readLine().split(" ");
            int[] intIndex = new int[H];

            for(int j=0; j<str.length(); j++){
                array.add(str.charAt(j));
            }
            for(int k=0; k<strIndex.length; k++){
                int count=1;
                int hiponCount=0;
                intIndex[k] = Integer.parseInt(strIndex[k]);

                for(int l=0; l<array.size(); l++) { //wo--w
                    if(array.get(l)!="-") {
                        if(intIndex[k]==0) {
                            array.add(0, "-");
                            break;
                        }
                        if (intIndex[k] == count) { //wo-w
                            array.add(count+hiponCount, "-");
                            break;
                        }
                        count++;
                    }
                    else {
                        hiponCount++;
                    }
                }
            }
            bw.write("#" + i+" ");
            for(int k=0; k<array.size(); k++) {
                bw.write(array.get(k)+"");
            }
            bw.write("\n");
            array.clear();
            i++;
        }
        bw.close();
    }
}
