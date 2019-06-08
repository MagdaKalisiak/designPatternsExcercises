package decoratorExcerciseTerrain;

public class SwampDecorator extends TerrainDecorator{
    public SwampDecorator(Terrain terrain) {
        super(terrain);
    }

    public int countFuelCost() {
        return terrain.countFuelCost()+20;
    }
}
