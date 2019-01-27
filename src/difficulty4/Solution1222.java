package difficulty4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution1222 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> stack = new Stack<>();
        int i=1;
        while(i<=10){
            int N = Integer.parseInt(br.readLine());
            List<Character> list = new ArrayList<>();
            String input = br.readLine();
            for(int j=0; j<N; j++){
                if(input.charAt(j)!='+') list.add(input.charAt(j));
                if (stack.isEmpty()) {
                    if (input.charAt(j) == '+') stack.add(input.charAt(j));
                }
                else{
                    if(stack.peek()=='+') {
                        list.add(stack.pop());
                    }
                    if(input.charAt(j)=='+'){
                        stack.push(input.charAt(j));
                    }
                }
            }
            for(int j=0; j<list.size(); j++){
                if(list.get(j)=='+'){
                    int num1 = stack.pop()-48;
                    int num2 = stack.pop()-48;
                    stack.push((char)(num1+num2+48));
                }
                else{
                    stack.push(list.get(j));
                }
            }
            bw.write("#" + i + " " + (stack.pop()-48)+"\n");
            i++;
        }
        bw.close();
    }
}