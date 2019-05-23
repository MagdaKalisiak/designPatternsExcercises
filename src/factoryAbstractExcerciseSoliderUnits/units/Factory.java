package factoryAbstractExcerciseSoliderUnits.units;

public abstract class Factory {
    abstract public InfantryUnit createInfantryUnit(UnitType unitType);
    abstract public MechanizedUnit createMechanizedUnit(UnitType unitType);

}
