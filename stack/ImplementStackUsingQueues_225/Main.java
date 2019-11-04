package ImplementStackUsingQueues_225;

public class Main {
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(10);
        obj.push(20);
        int param_2 = obj.pop();
        int param_3 = obj.top();
        boolean param_4 = obj.empty();
    }
}