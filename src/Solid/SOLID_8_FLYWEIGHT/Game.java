package Solid.SOLID_8_FLYWEIGHT;

import java.util.ArrayList;
import java.util.List;

/*
    The Game class stores and maintains the flyweight objects and their extrinsic states.
 */
public class Game {
    List<Tree> trees;
    List<TreePosition> treePositions;
    TreeFactory treeFactory;
    Game() {
        this.trees = new ArrayList<>();
        this.treePositions = new ArrayList<>();
        this.treeFactory = new TreeFactory();
    }
    void addTree(int x, int y, String color) {
        trees.add(treeFactory.getTree(color));
        treePositions.add(new TreePosition(x, y));
        renderTree(trees.size() - 1);
    }
    void renderTree(int id){
        System.out.println("Tree "+ id + " with "+ trees.get(id).getColor()
                + " rendered at " + treePositions.get(id).getX() + ", " + treePositions.get(id).getY());
    }
}
