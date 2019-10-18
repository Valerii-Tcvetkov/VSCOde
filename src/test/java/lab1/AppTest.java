package lab1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import main.java.lab1.Plant;
import main.java.lab1.Forest;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    @Test
    public void plantGrowingTest()
    {
        Plant plant = new Plant(4, "Green", 3);
        assertEquals(plant.height, 4);
        plant.grow();
        assertEquals(plant.height, 14);
    }

    @Test
    public void getPlantBySeed()
    {
        Plant plant = new Plant(4, "Green", 3);
        assertEquals(plant.height, 4);
        Plant seedPlant = plant.getSeed();
        assertEquals(seedPlant.height, 3);
    }

    @Test
    public void addWaterLeavesCountTest()
    {
        Plant plant = new Plant(4, "Green", 3);
        assertEquals(plant.leaves, 3);
        plant.addWater();
        assertEquals(plant.leaves, 16);
    }

    @Test
    public void addPlantsTest()
    {
        Plant plant = new Plant(4, "Green", 3);
        Plant plant_2 = new Plant(7, "Green", 5);
        Plant plant_3 = new Plant(11, "Green", 7);
        Forest forest = new Forest();
        forest.addPlant(plant);
        forest.addPlant(plant_2);
        forest.addPlant(plant_3);
        assertEquals(forest.plants.size(), 3);
    }   
    @Test
    public void growTressByPlantsTest()
    {
        Plant plant = new Plant(4, "Green", 3);
        Plant plant_2 = new Plant(6, "Green", 5);
        Plant plant_3 = new Plant(11, "Green", 7);
        Forest forest = new Forest();
        forest.addPlant(plant);
        forest.addPlant(plant_2);
        forest.addPlant(plant_3);
        forest.growTrees();
        assertEquals(forest.trees.size(), 1);
        assertEquals(forest.plants.size(), 2);
    }   
}
