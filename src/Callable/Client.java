package Callable;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception{
        List<Integer> list = new ArrayList<>(8);

        list.add(7);
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(9);
        list.add(8);
        list.add(2);
        list.add(6);
        System.out.println(list);
        ExecutorService executorService = Executors.newCachedThreadPool();
        MergeSorter mergeSorter =  new MergeSorter(list, executorService);
//        List<Integer> sortedArray = mergeSorter.call();
        Future<List<Integer>> sortedArray = executorService.submit(mergeSorter);
        System.out.println("sortedArray");
//        sortedArray.get();
        System.out.println(sortedArray.get());
        System.out.println("sortedArray");
    }
}
