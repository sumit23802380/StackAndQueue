package com.bridgelabz.stackandqueue;
/*
 * @desc: Queue Class using linked-list
 */
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
     * @desc : remove the head of the linked-list or front element of queue
     * @params :
     * @return : front element of queue
     */
    public T dequeue(){
        if(linkedList.size() == 0){
            System.out.println("Queue is empty");
            return null;
        }
        T topElement = linkedList.head.data;
        linkedList.pop();
        return topElement;
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
