package difficulty4;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

public class Solution1223 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i =1;
        while(i<=10){
            int N = Integer.parseInt(br.readLine());
            Stack<String> operator = new Stack<>();
            ArrayList<String> array = new ArrayList<>();
            String[] input = br.readLine().split("");
            for(int j=0; j<N; j++){
                String oper = input[j];
                if(!oper.equals("+") && !oper.equals("*")){
                    array.add(input[j]);
                }
                switch(oper){
                    case "+":
                        if(!operator.isEmpty() && operator.peek().equals("*")) {
                            while(!operator.isEmpty()) array.add(String.valueOf(operator.pop()));
                            operator.push(oper);
                        }
                        else if(!operator.isEmpty() && operator.peek().equals("+")){
                            array.add(String.valueOf(operator.pop()));
                            operator.push(oper);
                        }
                        else operator.push(oper);
                        break;
                    case "*":
                        if(!operator.isEmpty() && operator.peek().equals("+")){
                            operator.push(oper);
                        }
                        else if(!operator.isEmpty() && operator.peek().equals("*")){
                            array.add(String.valueOf(operator.pop()));
                            operator.push(oper);
                        }
                        else operator.push(oper);
                        break;
                    default:
                        if(j == input.length-1) while(!operator.isEmpty()) array.add(String.valueOf(operator.pop()));
                }
            }

            for(int j=0; j<array.size(); j++){
                if(array.get(j).equals("*")){
                    int num1 = Integer.parseInt(operator.pop());
                    int num2 = Integer.parseInt(operator.pop());
                    operator.push(String.valueOf(num1*num2));
                }
                else if(array.get(j).equals("+")){
                    int num1 = Integer.parseInt(operator.pop());
                    int num2 = Integer.parseInt(operator.pop());
                    operator.push(String.valueOf(num1+num2));
                }
                else operator.push(array.get(j));
            }
            bw.write("#" + i + " " + operator.pop()+"\n");
            i++;
        }
        
        bw.close();
    }
}
