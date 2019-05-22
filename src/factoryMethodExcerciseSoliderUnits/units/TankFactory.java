package factoryMethodExcerciseSoliderUnits.units;

public class TankFactory extends Factory{
    @Override
    public Unit createUnit() {
        return new Tank(200,0,10);
    }
}
