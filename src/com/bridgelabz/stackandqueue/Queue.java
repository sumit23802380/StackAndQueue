package com.bridgelabz.stackandqueue;

public class Queue <T extends Comparable<T>>{
    private final LinkedList<T> linkedList;

    /*
     * @desc : Constructor to Initialize queue this also initialize linked-list
     */
    public Queue() {
        this.linkedList = new LinkedList<>();
    }
    /*
     * @desc : adds the data to the head of the linked-list or end of the queue
     * @params : Generic data
     * @return :
     */
    public void enqueue(T data){
        linkedList.append(data);
    }
    /*
     * @desc : prints the queue
     * @params :
     * @return :
     */
    public void display(){
        linkedList.display();
    }
}
