package decoratorExcerciseTerrain;

public abstract class TerrainDecorator extends Terrain {
    Terrain terrain;
    public TerrainDecorator(Terrain terrain) {
        super("", 0);
        this.terrain=terrain;
    }

}
