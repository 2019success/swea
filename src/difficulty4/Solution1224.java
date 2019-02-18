package difficulty4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution1224 {
    private static Stack<String> stack = new Stack<>();
    private static List<String> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i = 1;
        while (i<=10) {
            int N = Integer.parseInt(br.readLine());
            String[] str = br.readLine().split("");
            for (int j = 0; j < N; j++) {
                String tmp = str[j];
                in_to_post(tmp);
            }
            while (!stack.isEmpty()) list.add(stack.pop());

            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals("+")) {
                    int num1 = Integer.parseInt(stack.pop());
                    int num2 = Integer.parseInt(stack.pop());
                    stack.add(String.valueOf(num1 + num2));
                } else if (list.get(j).equals("-")) {
                    int num1 = Integer.parseInt(stack.pop());
                    int num2 = Integer.parseInt(stack.pop());
                    stack.add(String.valueOf(num1 - num2));
                } else if (list.get(j).equals("*")) {
                    int num1 = Integer.parseInt(stack.pop());
                    int num2 = Integer.parseInt(stack.pop());
                    stack.add(String.valueOf(num1 * num2));
                } else if (list.get(j).equals("/")) {
                    int num1 = Integer.parseInt(stack.pop());
                    int num2 = Integer.parseInt(stack.pop());
                    stack.add(String.valueOf(num2 / num1));
                } else stack.push(list.get(j));
            }
            bw.write("#" + i + " " + stack.pop() + "\n");
            list.clear();
            i++;
        }
        bw.close();
    }

    private static void in_to_post(String str) {
        String temp = str;
        if (isOperator(temp)) {
            switch (temp) {
                case "+":
                case "-":
                    if (stack.isEmpty()) stack.add(temp);
                    else {
                        while (priority(stack.peek()) >= priority(temp)) {
                            if (priority(stack.peek()) == (priority(temp))) {
                                list.add(stack.pop());
                                break;
                            }
                            list.add(stack.pop());
                        }
                        stack.add(temp);
                    }
                    break;
                case "*":
                case "/":
                    if (stack.isEmpty()) stack.add(temp);
                    else {
                        while (priority(stack.peek()) >= priority(temp)) {
                            if (priority(stack.peek()) == (priority(temp))) {
                                list.add(stack.pop());
                                break;
                            }
                            list.add(stack.pop());
                        }
                        stack.add(temp);
                    }
                    break;
                case "(":
                    stack.add(temp);
                    break;
                case ")":
                    while (!stack.peek().equals("(")) list.add(stack.pop());
                    stack.pop();
                    break;
            }
        } else
            list.add(temp);
    }

    static private int priority(String str) {
        if (str.equals("(")) return 0;
        else if (str.equals("+") || str.equals("-")) return 1;
        else if (str.equals("*") || str.equals("/")) return 2;
        return -1;
}

    static private boolean isOperator(String str) {
            if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/") || str.equals("(") || str.equals(")"))
                return true;
            return false;
    }
}