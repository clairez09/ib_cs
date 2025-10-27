package OctoberTwentythree;

import java.util.*;

public class labtwo {
    public static void main(String[] args){
        Stack<Character> stack = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the data: ");
        String data = input.nextLine();
        for (int i=0;i<data.length();i++){
            if (data.charAt(i)=='{' || data.charAt(i)== '(' || data.charAt(i)== '<' || data.charAt(i)=='['){
                stack.push(data.charAt(i));
            }
            else if (data.charAt(i)=='}' || data.charAt(i)== ')' || data.charAt(i)== '>' || data.charAt(i)==']'){

            }
        }
        input.close();
    }
}
