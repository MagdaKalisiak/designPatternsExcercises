package factoryMethodExcerciseSoliderUnits;

import factoryMethodExcerciseSoliderUnits.units.Factory;
import factoryMethodExcerciseSoliderUnits.units.RiflemanFactory;
import factoryMethodExcerciseSoliderUnits.units.TankFactory;
import factoryMethodExcerciseSoliderUnits.units.Unit;


public class Main {
    public static void main(String[] args) {
        Factory riflemanFactory = new RiflemanFactory();
        Factory tankFactory = new TankFactory();
      Unit infantryman = riflemanFactory.createUnit();
        Unit tank = tankFactory.createUnit();
    }
}
