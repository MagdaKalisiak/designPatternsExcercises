package factoryAbstractExcerciseSoliderUnits.units;

public class BlueFactory extends Factory{
    @Override
    public InfantryUnit createInfantryUnit(UnitType unitType) {
        switch(unitType){
            case RIFLEMAN:
                return new Rifleman(25,0,5, "Blue Riffelman");
            default:
                throw new UnsupportedOperationException("Type not known.");
        }
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType unitType) {
        switch(unitType){
            case TANK:
                return new Tank(100,0,25, "Blue Tank");
            default:
                throw new UnsupportedOperationException("Type not known.");
        }
    }
}
