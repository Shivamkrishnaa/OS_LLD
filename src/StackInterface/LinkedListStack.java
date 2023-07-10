package StackInterface;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListStack implements Stack{
    LinkedList items = new LinkedList();
    @Override
    public void pop() {
        items.pop();
    }

    @Override
    public void push(Integer item) {
        items.push(item);
    }

    @Override
    public int peek() {
        System.out.print("Item ->");
        Integer item = (Integer)items.peekLast();
        System.out.println(item);
        return item;
    }
    public void push(ArrayList<Integer> items) {
        this.items.addAll(items);
    }
}
