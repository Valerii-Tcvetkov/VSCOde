package main.java.lab1;

public class Tree extends Plant {
    int width;

    /**
     * Construct new Tree
     * 
     * @param height - height of tree
     * @param color  - color of tree
     * @param leaves - count of Tree's leaves
     * @param width  - width of Tree
     */
    Tree(int height, String color, int leaves, int width) {
        super(height, color, leaves);
        this.width = width;
    }

    /**
     * Grow tree - increase height of Tree, width of Tree and count of leaves
     * 
     * @return
     */
    public Tree growTree() {
        this.height += 10;
        this.leaves += 15;
        this.width += 5;
        return this;
    }

    /**
     * Paint Tree using new color
     * 
     * @param color - new color
     * @return Tree
     */
    public Tree paint(String color) {
        this.color = color;
        return this;
    }
}