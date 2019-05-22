package factorySimpleExcerciseSoliderUnits;

import factorySimpleExcerciseSoliderUnits.units.Factory;
import factorySimpleExcerciseSoliderUnits.units.Unit;
import factorySimpleExcerciseSoliderUnits.units.UnitType;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Unit infantryman = factory.createUnit(UnitType.RIFLEMAN);
        Unit tank = factory.createUnit(UnitType.TANK);

    }
}




