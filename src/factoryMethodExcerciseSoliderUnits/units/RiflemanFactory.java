package factoryMethodExcerciseSoliderUnits.units;

public class RiflemanFactory extends Factory {


    @Override
    public Unit createUnit( ) {
        return new Rifleman(200,0,5);
    }
}


