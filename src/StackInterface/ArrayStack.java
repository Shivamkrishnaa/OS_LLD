package StackInterface;

import java.util.ArrayList;

public class ArrayStack implements Stack{
    ArrayList<Integer> items = new ArrayList<>();
    public int peek() {
        System.out.print("Item ->");
        Integer item = items.get(items.size()-1);
        System.out.println(item);
        return item;
    }
    public void push(Integer item) {
        items.add(item);
    };
    public void push(ArrayList<Integer> items) {
        this.items.addAll(items);
    }
    public void pop() {
        this.items.remove(this.items.size()-1);
    }

}
