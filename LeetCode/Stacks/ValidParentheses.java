package Stacks;
import java.util.Stack;

public class ValidParentheses {

    // public boolean isValid(String s) {
    //     String[] ch = s.split("");

    //     Stack<String> stack = new Stack<>();


    //     for(int i = 0; i < ch.length; i++) {
    //         if(ch[i].equals("(") || ch[i].equals("[") || ch[i].equals("{")){
    //             stack.push(ch[i]);
    //         } else {

    //             if(stack.isEmpty()){
    //                 return false;
    //             }

    //             if(ch[i].equals(")")){
    //                 if(!stack.pop().equals("(")){
    //                     return false;
    //                 }
    //             } else if(ch[i].equals("]")){
    //                 if(!stack.pop().equals("[")){
    //                     return false;
    //                 }
    //             } else if(ch[i].equals("}")) {
    //                 if(!stack.pop().equals("{")){
    //                     return false;
    //                 }
    //             }
    //         }

    //     }
    //     return stack.isEmpty();
    // }

    public boolean isValid (String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            } else {
                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();

                if((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')){
                    return false;
                }
            }
        }



        return stack.isEmpty();
    }

    public static void main(String[] args) {

        ValidParentheses v = new ValidParentheses();
        System.out.println(v.isValid("({{{{}}}))"));
        
    }

}
