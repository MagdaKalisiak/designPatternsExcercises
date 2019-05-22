package factorySimpleExcerciseSoliderUnits.units;

public class Factory {

    public Unit createUnit(UnitType unitType ){

        switch (unitType){
            case TANK:
                return new Tank(200,0,5);
            case RIFLEMAN:
                return new Rifleman(100,0,2);
            default:
                throw new UnsupportedOperationException("No such type");

        }
    }

}
