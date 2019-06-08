package factoryAbstractExcerciseCars;

import factoryAbstractExcerciseCars.cars.BMWModel;
import factoryAbstractExcerciseCars.cars.Car;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        FactoryProvider factoryProvider = new FactoryProvider();
        Car bmwLeftE60 = factoryProvider.getFactory(SteeringWheelPosition.LEFT).buildBMW(BMWModel.E60);
        System.out.println(bmwLeftE60);
    }
}
