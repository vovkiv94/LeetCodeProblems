package ImplementQueueUsingStacks_232;

public class Main {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(10);
        obj.push(20);
        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();
    }
}