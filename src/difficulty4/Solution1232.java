package difficulty4;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution1232 {
    private static int N;
    private static String[] data;
    private static int[] left;
    private static int[] right;
    private static Queue<String> queue;
    private static Stack<Integer> stack;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i=1;
        while(i<=10) {
            N = Integer.parseInt(br.readLine());
            data = new String[N+1];
            left = new int[N+1];
            right = new int[N+1];
            queue = new LinkedList<>();
            for(int j=0; j<N; j++){
                String[] input = br.readLine().split(" ");
                int index = Integer.parseInt(input[0]);
                data[index] = input[1];
                if(input.length >2){
                    left[index] = Integer.parseInt(input[2]);
                    right[index] = Integer.parseInt(input[3]);
                }
            }
            postOrder(1);
            while(!queue.isEmpty()){
                System.out.print(queue.poll() + " ");
            }
            printSum();
            bw.write("#" + i + " " + stack.pop()+"\n");
            i++;
        }
        bw.close();
    }
    private static void postOrder(int num){
        if(num==0) return;
        postOrder(left[num]);
        postOrder(right[num]);
        queue.offer(data[num]);
    }
    private static void printSum(){
        stack = new Stack<>();
        while(!queue.isEmpty()){
            String temp = queue.poll();
            int num1, num2;
            try {
                switch (temp) {
                    case "+":
                        num2 = stack.pop();
                        num1 = stack.pop();
                        stack.push(num1 + num2);
                        break;
                    case "-":
                        num2 = stack.pop();
                        num1 = stack.pop();
                        stack.push(num1 - num2);
                        break;
                    case "*":
                        num2 = stack.pop();
                        num1 = stack.pop();
                        stack.push(num1 * num2);
                        break;
                    case "/":
                        num2 = stack.pop();
                        num1 = stack.pop();
                        stack.push(num1 / num2);
                        break;
                    default:
                        stack.add(Integer.parseInt(temp));
                }
            }catch(ArithmeticException e){
            }
        }
    }
}
