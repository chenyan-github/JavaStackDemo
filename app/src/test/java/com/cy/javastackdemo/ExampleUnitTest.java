package com.cy.javastackdemo;

import com.cy.javastackdemo.stack.ArrayStack;
import com.cy.javastackdemo.stack.LinkedStack;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testArrayStack() {
        ArrayStack<Integer> arrayStack = new ArrayStack();
        for(int i = 0;i < 100;i ++) {
            int num = (int) (Math.random() * 100);
            System.out.println("push: " + i + ", " + arrayStack.push(num));
        }

        while (!arrayStack.empty()) {
            System.out.println("pop: " + arrayStack.pop());
        }
    }

    @Test
    public void testLinkedStack() {
        LinkedStack<Integer> arrayStack = new LinkedStack<>();
        for(int i = 0;i < 100;i ++) {
            int num = (int) (Math.random() * 100);
            System.out.println("push: " + i + ", " + arrayStack.push(num));
        }

        while (!arrayStack.empty()) {
            System.out.println("pop: " + arrayStack.pop());
        }
    }
}