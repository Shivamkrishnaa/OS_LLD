package Solid.SOLID_8_FLYWEIGHT;

import java.util.Map;
import java.util.TreeMap;

public class TreeFactory {
    Map<String, Tree>  treeMap;
    TreeFactory(){
        treeMap = new TreeMap<>();
    }
    Tree getTree(String color){
     if(treeMap.containsKey(color)){
         return treeMap.get(color);
     } else {
         Tree tree = new Tree(color);
         treeMap.put(color, tree);
         return tree;
     }
    }
}
