package com.cy.javastackdemo.stack;

/**
 * Created by chenyan on 2019/5/26.
 */

public class LinkedStack<E> {

    private Node<E> topItem;//the top node of this stack.

    /**
     * Pushe an item onto the top of this stack.
     * @param item
     * @return the item.
     */
    public synchronized E push(E item) {
        Node<E> newNode = new Node(item, topItem);
        topItem = newNode;
        return item;
    }

    /**
     * Pop the object at the top of this stack.
     * @return the top item of this stack.
     */
    public synchronized E pop() {
        E item = peek();
        topItem = topItem.nextNode;
        return item;
    }

    /**
     * Looks at the object at the top of this stack without removing it
     * from the stack.
     * @return the top item of this stack.
     */
    public synchronized E peek() {
        if(empty()) {
            throw new RuntimeException("The Stack is empty!");
        }
        return topItem.data;
    }

    /**
     * Whehter this stack is empty or not.
     * @return true or false.
     */
    public boolean empty() {
        return topItem == null;
    }

    public static class Node<E> {
        protected E data;
        protected Node nextNode;

        public Node(E data, Node nextNode) {
            this.data = data;
            this.nextNode = nextNode;
        }
    }
}
