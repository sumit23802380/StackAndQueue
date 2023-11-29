package com.bridgelabz.stackandqueue;
/*
 *@desc : Node Class Generic
 */
public class Node<T> {
    T data;
    Node<T> next;
    Node(T data) {
        this.data = data;
        this.next = null;
    }
}