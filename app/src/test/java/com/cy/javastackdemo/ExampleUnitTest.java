package com.cy.javastackdemo;

import com.cy.javastackdemo.stack.ArrayStack;
import com.cy.javastackdemo.stack.LinkedStack;

import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    private static Logger log = Logger.getLogger(ExampleUnitTest.class.getSimpleName());

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testArrayStack() {
        ArrayStack<Integer> arrayStack = new ArrayStack();
        for(int i = 0;i < 100;i ++) {
            Integer num = (int) (Math.random() * 100);
            log.info("random number is: " + num);
            assertEquals("Push test failure!", num, arrayStack.push(num));
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            assertEquals("Pop test failure!", num, arrayStack.pop());
        }
    }

    @Test
    public void testLinkedStack() {
        LinkedStack<Integer> arrayStack = new LinkedStack<>();
        for(int i = 0;i < 100;i ++) {
            Integer num = (int) (Math.random() * 100);
            log.info("random number is: " + num);
            assertEquals("Push test failure!", num, arrayStack.push(num));
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            assertEquals("Pop test failure!", num, arrayStack.pop());
        }
    }
}