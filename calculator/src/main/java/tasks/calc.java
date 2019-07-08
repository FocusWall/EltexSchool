package tasks;

import java.util.Stack;

public class calc { //Realizing calculator using reverse polish notation

    public static String exprToPolska(String expression){ //This method trasltates our expression into RPN
        String curr = "";
        Stack<Character> stack = new Stack<>();

        int priority;
        for(int i = 0; i < expression.length(); i++){
            priority = getPriority(expression.charAt(i));

            if(priority == 0)
                curr += expression.charAt(i);

            if(priority == 2)
                stack.push(expression.charAt(i));

            if(priority == 1){
                curr += ' ';
                while(getPriority(stack.peek()) != 2){
                    curr += stack.pop();
                }
                stack.pop();
            }

            if(priority > 2) {
                curr += ' ';
                while (!stack.empty()) {
                    if (getPriority(stack.peek()) >= priority)
                        curr += stack.pop();
                    else
                        break;
                }
                stack.push(expression.charAt(i));
            }
        }
        while(!stack.empty())
            curr += stack.pop();

        return curr;
    }

    public static double polskaToAnswer(String polska){ //This method translate our RPN into answer
        String number = new String();
        Stack<Double> stack = new Stack<>();

        for(int i = 0; i < polska.length(); i++){
            if(polska.charAt(i) == ' ')
                continue;

            if(getPriority(polska.charAt(i)) == 0){
                while(polska.charAt(i) != ' ' && getPriority(polska.charAt(i)) == 0) {
                    number += polska.charAt(i++);
                    if (i == polska.length())
                        break;
                }
                stack.push(Double.parseDouble(number));
                number = new String();
            }

            if(getPriority(polska.charAt(i)) > 2){
                double a = stack.pop();
                double b = stack.pop();
                if(polska.charAt(i) == '+')
                    stack.push(b + a);
                if(polska.charAt(i) == '-')
                    stack.push(b - a);
                if(polska.charAt(i) == '*')
                    stack.push(b * a);
                if(polska.charAt(i) == '/')
                    stack.push(b / a);
            }
        }
        return stack.pop();
    }

    private static int getPriority(char chr){ //This method returns the priority of the current symbol
        if(chr == '*' || chr == '/')
            return 4;
        else if(chr == '+' || chr == '-')
            return 3;
        else if(chr == '(')
            return 2;
        else if(chr == ')')
            return 1;
        else
            return 0;
    }
}
