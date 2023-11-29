package com.bridgelabz.stackandqueue;
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(56);
        stack.push(30);
        stack.push(70);
//        stack.display();
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.display();
    }
}
