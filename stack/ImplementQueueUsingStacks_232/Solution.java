package ImplementQueueUsingStacks_232;

import java.util.Stack;

/**
 * Implement the following operations of a queue using stacks.
 * <p>
 * push(x) -- Push element x to the back of queue.
 * pop() -- Removes the element from in front of queue.
 * peek() -- Get the front element.
 * empty() -- Return whether the queue is empty.
 * Example:
 * <p>
 * MyQueue queue = new MyQueue();
 * <p>
 * queue.push(1);
 * queue.push(2);
 * queue.peek();  // returns 1
 * queue.pop();   // returns 1
 * queue.empty(); // returns false
 */
class MyQueue {
    Stack<Integer> stack;
    Stack<Integer> helpStack;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        stack = new Stack<>();
        helpStack = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        stack.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (helpStack.isEmpty()) {
            while (!stack.isEmpty())
                helpStack.push(stack.pop());
        }

        return helpStack.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (helpStack.isEmpty()) {
            while (!stack.isEmpty())
                helpStack.push(stack.pop());
        }

        return helpStack.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stack.isEmpty() && helpStack.isEmpty();
    }
}