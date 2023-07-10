package StackInterface;

public class Client {
    public static void main(String[] args) {
        ArrayStack items = new ArrayStack();
        LinkedListStack llItems = new LinkedListStack();
        llItems.push(1);
        llItems.push(2);
        llItems.push(3);
        llItems.peek();
        llItems.pop();
        llItems.peek();
        llItems.push(4);
        llItems.peek();


        items.push(1);
        items.push(2);
        items.push(3);
        items.peek();
        items.pop();
        items.peek();
        items.push(4);
        items.peek();
    }
}
