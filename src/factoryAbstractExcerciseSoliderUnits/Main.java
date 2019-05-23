package factoryAbstractExcerciseSoliderUnits;

import factoryAbstractExcerciseSoliderUnits.units.ColorOfArmy;
import factoryAbstractExcerciseSoliderUnits.units.FactoryProvider;
import factoryAbstractExcerciseSoliderUnits.units.UnitType;

public class Main {
    public static void main(String[] args) {
        FactoryProvider factoryProvider = new FactoryProvider();
        System.out.println(factoryProvider.getFactory(ColorOfArmy.RED).createInfantryUnit(UnitType.RIFLEMAN).toString());
        System.out.println(factoryProvider.getFactory(ColorOfArmy.BLUE).createMechanizedUnit(UnitType.TANK).toString());

    }
}
