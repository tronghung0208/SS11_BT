package baitapvenha.baitap5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào chuỗi cần kiểm tra");
        String input =sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("chuỗi "+input+" là chuỗi Palindrome");
        }else {
            System.out.println("chuỗi "+input+" không phải là chuỗi Palindrome");
        }

    }
    public static boolean isPalindrome(String str){
        str=str.replaceAll("\\s+","").toLowerCase();
        Stack<Character> stack=new Stack<>();
        Queue<Character> queue=new LinkedList<>();

        for (char c:str.toCharArray()
             ) {
stack.push(c);
queue.offer(c);
        }
        while (!stack.isEmpty()&&!queue.isEmpty()){
            char stackChar=stack.pop();
            char queueChar=queue.poll();
            if (stackChar!=queueChar){
                return false;
            }
        }
        return true;
    }
}
