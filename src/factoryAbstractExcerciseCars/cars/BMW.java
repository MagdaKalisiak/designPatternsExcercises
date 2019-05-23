package factoryAbstractExcerciseCars.cars;

import factoryAbstractExcerciseCars.SteeringWheelPosition;

public class BMW extends Car {
    private BMWModel bmwModel;

    public BMW(int yearOfProduction, SteeringWheelPosition steeringWheelPosition, BMWModel bmwModel) {
        super(yearOfProduction, steeringWheelPosition);
        this.bmwModel = bmwModel;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "bmwModel=" + bmwModel  + ". Steering wheel position " + super.steeringWheelPosition.toString() +
                '}';
    }
}
