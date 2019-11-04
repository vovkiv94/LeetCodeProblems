package MinStack_155;

public class Main {
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(10);
        obj.push(20);
        obj.push(10);
        obj.top();
        System.out.println(obj.top());
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.getMin());
    }
}