package factoryAbstractExcerciseCars.cars;

import factoryAbstractExcerciseCars.SteeringWheelPosition;

public class Ford extends Car {
    private FordModel fordModel;

    public Ford(int yearOfProduction, SteeringWheelPosition steeringWheelPosition, FordModel fordModel) {
        super(yearOfProduction, steeringWheelPosition);
        this.fordModel = fordModel;
    }

    @Override
    public String toString() {
        return "Ford{" +
                "fordModel=" + fordModel + ". Steering wheel position " + super.steeringWheelPosition.toString() +
                '}';
    }
}


