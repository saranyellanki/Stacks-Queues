package com.bridgelabz;

public class Stack<T> {
    LinkedList<T> linkedList;

    /**
     * stack constructor is used to declare linked list
     */
    public Stack() {
        this.linkedList = new LinkedList<>();
    }

    /**
     * push method is used in stack operation to push the data
     * @param data is of generic type
     */
    public void push(T data){
        linkedList.add(data);
    }

    public static void main(String[] args) {
        Stack<Integer> stackObj = new Stack<>();
        stackObj.push(70);
        stackObj.push(30);
        stackObj.push(56);
    }
}