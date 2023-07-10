package StackInterface;

import java.util.ArrayList;

public interface Stack {
    ArrayList<Integer> items = new ArrayList<>();
    public void push(Integer item);
    public void push(ArrayList<Integer> items);
    public void pop();
    public int peek();
}
