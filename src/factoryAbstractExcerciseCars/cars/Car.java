package factoryAbstractExcerciseCars.cars;

import factoryAbstractExcerciseCars.SteeringWheelPosition;

public abstract class Car {
    protected int yearOfProduction;
    protected SteeringWheelPosition steeringWheelPosition;

    protected Car(int yearOfProduction, SteeringWheelPosition steeringWheelPosition) {
        this.yearOfProduction = yearOfProduction;
        this.steeringWheelPosition = steeringWheelPosition;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public SteeringWheelPosition getSteeringWheelPosition() {
        return steeringWheelPosition;
    }
}
