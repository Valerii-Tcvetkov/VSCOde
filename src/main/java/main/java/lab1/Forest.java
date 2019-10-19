package main.java.lab1;

import java.util.*;

public class Forest {
    public ArrayList<Tree> trees;
    public ArrayList<Plant> plants;
    public ArrayList<Mushroom> mushrooms;

    public Forest() {
        this.trees = new ArrayList<Tree>();
        this.plants = new ArrayList<Plant>();
        this.mushrooms = new ArrayList<Mushroom>();
    }

    /**
     * Add new tree to Forest
     * 
     * @return Forest
     **/
    public Forest addTree() {
        Tree tree = new Tree(10, "Green", 30, 5);
        this.trees.add(tree);
        return this;
    }

    /**
     * Add new Plant to Forest
     * 
     * @return Forest
     */
    public Forest addPlant() {
        Plant plant = new Plant(3, "Green", 1);
        this.plants.add(plant);
        return this;
    }

    /**
     * Add existing Plant to Forest
     * 
     * @param plant - existing Plant
     * @return Forest
     */
    public Forest addPlant(Plant plant) {
        this.plants.add(plant);
        return this;
    }

    /**
     * Grow all trees on the Forest
     */
    public void sunRise() {
        for (Tree tree : this.trees) {
            tree.grow();
        }
    }

    /**
     * Add water for all trees
     */
    public void rain() {
        for (Tree tree : this.trees) {
            tree.addWater();
        }
    }

    /**
     * Grow trees from Plant to Tree
     */
    public void growTrees() {
        ArrayList<Plant> newArrayList = new ArrayList<Plant>();
        for (Plant plant : this.plants) {
            if (plant.height <= 7) {
                newArrayList.add(plant);
            } else {
                Tree tree = new Tree(9, "Green", 30, 3);
                this.trees.add(tree);
            }
        }
        this.plants = newArrayList;
    }

    /**
     * Add one more mushroom in the Forest
     */
    public void addMushrooms(){
        Mushroom mush = new Mushroom(2, "White");
        this.mushrooms.add(mush);
    }
}