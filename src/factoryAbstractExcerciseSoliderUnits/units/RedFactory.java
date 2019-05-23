package factoryAbstractExcerciseSoliderUnits.units;

public class RedFactory extends Factory {
    @Override
    public InfantryUnit createInfantryUnit(UnitType unitType) {
        switch(unitType){
            case RIFLEMAN:
                return new Rifleman(25,0,6, "Red Rifelman");
            default:
                throw new UnsupportedOperationException("Type not known.");
        }
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType unitType) {
        switch(unitType){
            case TANK:
                return new Tank(150,0,12, "Blue Tank");
            default:
                throw new UnsupportedOperationException("Type not known.");
        }
    }
}
