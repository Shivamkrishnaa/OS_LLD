package Solid.StackInterface;

public class Client {
    public static void someMethod(Stack s) {
        s.push(1);
        s.push(2);
        s.push(3);
        s.peek();
        s.pop();
        s.peek();
        s.push(4);
        s.peek();
    }
    public static void main(String[] args) {
        Stack items = new ArrayStack();
        Stack llItems = new LinkedListStack();
        someMethod(items);
        someMethod(llItems);
    }
}
