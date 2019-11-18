package difficulty2;

import java.io.*;

public class Solution2001 {
    private static int n,m;
    private static int[][] map;
    private static int count(int p,int q){
        int ret=0;
        for(int i=p;i<p+m;i++){
            for(int j=q;j<q+m;j++){
                ret+=map[i][j];
            }
        }
        return ret;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int T=Integer.parseInt(br.readLine());
        int t=0;
        while(t++<10){
            String[] str=br.readLine().split(" ");
            n=Integer.parseInt(str[0]);
            m=Integer.parseInt(str[1]);
            map=new int[n][n];
            for(int i=0;i<n;i++){
                str=br.readLine().split(" ");
                for(int j=0;j<n;j++){
                    map[i][j]=Integer.parseInt(str[j]);
                }
            }
            int res=0;
            for(int i=0;i<=n-m;i++){
                for(int j=0;j<=n-m;j++){
                    res=Integer.max(res,count(i,j));
                }
            }
            bw.write("#"+t+" "+res+"\n");
        }
        bw.close();
    }
}
