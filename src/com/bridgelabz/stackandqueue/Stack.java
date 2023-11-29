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
    /*
     * @desc : prints the stack
     * @params :
     * @return :
     */
    public void display(){
        linkedList.display();
    }
}
