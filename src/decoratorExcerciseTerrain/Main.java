package decoratorExcerciseTerrain;

public class Main {
    public static void main(String[] args) {
        Terrain terrain =new SwampDecorator( new ForestDecorator(new Plain())) ;

        System.out.println(terrain.countFuelCost());
    }
}
