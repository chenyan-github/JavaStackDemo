package com.cy.javastackdemo.stack;

/**
 * Created by chenyan on 2019/5/26.
 */

public class ArrayStack<E> {

    private int elementCounts;//the stack size;

    private int minSize = 10;//the minimum size of this stack.

    private Object[] elementsData = new Object[minSize];//the stack elements array.

    /**
     * Pushe an item onto the top of this stack.
     * @param item
     * @return the item.
     */
    public synchronized E push(E item) {
        elementCounts ++;
        if(elementCounts > elementsData.length) {
            Object[] newArray = new Object[elementCounts];
            System.arraycopy(elementsData, 0, newArray, 0, elementsData.length);
            elementsData = newArray;
        }
        elementsData[elementCounts-1] = item;
        return item;
    }

    /**
     * Pop the object at the top of this stack.
     * @return the top item of this stack.
     */
    public synchronized E pop() {
        E item = peek();
        elementCounts --;
        if(elementCounts > minSize) {
            Object[] newArray = new Object[elementCounts];
            System.arraycopy(elementsData, 0, newArray, 0, elementCounts);
            elementsData = newArray;
        }
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
        return (E) elementsData[elementCounts-1];
    }

    /**
     * Whehter this stack is empty or not.
     * @return true or false.
     */
    public boolean empty() {
        return elementCounts <= 0;
    }
}
