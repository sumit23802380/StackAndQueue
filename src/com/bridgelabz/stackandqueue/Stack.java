package com.bridgelabz.stackandqueue;
/*
 * @desc : Stack Generic Class
 */
public class Stack <T extends Comparable<T>>{
    private final LinkedList<T> linkedList;

    /*
     * @desc : Constructor to Initialize stack this also initialize linked-list
     */
    public Stack(){
        linkedList = new LinkedList<T>();
    }
    /*
     * @desc : adds the data to the head of the linked-list or top of the stack
     * @params : Generic data
     * @return :
     */
    public void push(T data){
        linkedList.addToHead(data);
    }
    public T peek(){
        if(linkedList.size() == 0){
            System.out.println("Stack is empty");
            return null;
        }
        return linkedList.head.data;
    }
    public T pop(){
        if(linkedList.size() == 0){
            System.out.println("Stack is empty");
            return null;
        }
        T topElement = linkedList.head.data;
        linkedList.pop();
        return topElement;
    }
    /*
     * @desc : prints the stack
     * @params :
     * @return :
     */
    public void display(){
        linkedList.display();
    }
}
