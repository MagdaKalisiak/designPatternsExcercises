package decoratorExcerciseTerrain;

public class ForestDecorator extends TerrainDecorator {

    public ForestDecorator(Terrain terrain) {
        super(terrain);
    }

    public int countFuelCost() {
        return terrain.countFuelCost()+5;
    }
}
