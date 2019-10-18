package main.java.lab1;

public class Plant {
    public int height;
    public String color;
    public int leaves;
    // Are u sure u wanna be a programmer, guy??
    /**
     * Construct object Plant
     * 
     * @param height - height of Plant
     * @param color  - color of Plant
     * @param leaves - count of Plant's leaves
     */
    public Plant(int height, String color, int leaves) {
        this.height = height;
        this.color = color;
        this.leaves = leaves;
    }

    /**
     * Grow plant - increase height of Plant and count of leaves
     * 
     * @return Plant
     */
    public Plant grow() {
        this.height += 10;
        this.leaves += 3;
        return this;
    }

    /**
     * Get new Plant by parent-Plant
     * 
     * @return Plant
     */
    public Plant getSeed() {
        Plant newPlant = new Plant(3, "Green", 2);
        return newPlant;
    }

    /**
     * Add count of leaves and grow Plant
     * 
     * @return Plant
     */
    public Plant addWater() {
        this.leaves += 20;
        this.grow();
        return this;
    }
}