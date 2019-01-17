package difficulty3;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution3307 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = 1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            int N = Integer.parseInt(br.readLine());
            int[] array = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0; j<N; j++){
                array[j] = Integer.parseInt(st.nextToken());
            }
            list.add(array[0]);
            for(int j=1; j<N; j++){
                if(array[j]>list.get(list.size()-1)){
                    list.add(array[j]);
                }
                else{
                    int a= lower_bound(list, 0,list.size()-1, array[j]);
                    list.set(a, array[j]);
                }
            }

            bw.write("#" + i + " " +list.size()+"\n");
            i++;
        }
        bw.close();
    }

    static private int lower_bound(ArrayList<Integer>arr , int s, int e, int k) {
        while (s < e) {
            int m = (s + e) / 2;
            if (arr.get(m) < k) {
                s = m + 1;
            } else {
                e = m;
            }
        }
        return s;
    }
}
