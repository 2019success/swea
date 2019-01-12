package difficulty3;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution1208 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        while(i<=10){
            int N = Integer.parseInt(br.readLine());
            int[] array= new int[100];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<100; j++){
                array[j] = Integer.parseInt(st.nextToken());
            }
            for(int k=0; k<N; k++) {
                int max=array[0];
                int min=array[0];
                int maxIndex=0;
                int minIndex=0;
                for(int j=1;j<100; j++){
                    if (max < array[j]) {
                        max = array[j];
                        maxIndex=j;
                    }
                    if (min > array[j]) {
                        min = array[j];
                        minIndex=j;
                    }
                }
                if(max-min >1) {
                    array[maxIndex]--;
                    array[minIndex]++;
                }
                else {
                    break;
                }
            }
            Arrays.sort(array);
            bw.write("#" + i + " " + (array[array.length-1]-array[0])+"\n");
            i++;
        }
        bw.close();
    }
}