package difficulty4;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution1233 {
    private static int N;
    private static String[] data;
    private static int result;
    private static Queue<String> queue;
    private static Stack<Integer> stack;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i =1;
        while(i<=10){
            N = Integer.parseInt(br.readLine());
            queue = new LinkedList<>();
            data = new String[N+1];
            for(int j=0; j<N; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int index = Integer.parseInt(st.nextToken());
                data[index] = st.nextToken();
            }
            result=1;
            postOrder(1);
            printResult();
            bw.write("#" + i + " " + result +"\n");
            i++;
        }
        bw.close();
    }
    private static void postOrder(int num){
        if(num*2<=N) postOrder(num*2);
        if(num*2+1<=N) postOrder(num*2+1);
        queue.offer(data[num]);
    }
    private static void printResult(){
        stack = new Stack<>();
        while(!queue.isEmpty()){
            try {
                if(queue.peek().equals("+") || queue.peek().equals("-") || queue.peek().equals("*") || queue.peek().equals("/")){
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    if(!queue.isEmpty() && queue.peek().equals("+")){
                        queue.poll();
                        stack.add(num1 + num2);
                    }
                    else if(!queue.isEmpty() && queue.peek().equals("-")) {
                        queue.poll();
                        stack.add(num1-num2);
                    }
                    else if(!queue.isEmpty()&& queue.peek().equals("*")){
                        queue.poll();
                        stack.add(num1*num2);
                    }
                    else if(!queue.isEmpty()&& queue.peek().equals("/")){
                        queue.poll();
                        stack.add(num2/num1);
                    }
                } else {
                    stack.push(Integer.parseInt(queue.poll()));
                }
            } catch(ArithmeticException e){
                stack.add(0);
            } catch(Exception e){
                result = 0;
                break;
            }
        }
    }
}