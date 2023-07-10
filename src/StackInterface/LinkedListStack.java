package StackInterface;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListStack implements Stack{
    LinkedList items = new LinkedList();
    @Override
    public void pop() {

        Integer item = (Integer)items.pop();
//        System.out.print("Pop to LL stack->");
//        System.out.println(item);
    }

    @Override
    public void push(Integer item) {
//        System.out.print("Push to LL stack->");
//        System.out.println(item);
        items.push(item);
    }

    @Override
    public int peek() {
        System.out.print("Peek LL Stack ->");
        Integer item = (Integer)items.peek();
        System.out.println(item);
        return item;
    }
    public void push(ArrayList<Integer> items) {
        this.items.addAll(items);
    }
}
