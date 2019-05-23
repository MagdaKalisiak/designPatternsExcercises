package factoryAbstractExcerciseCars;

import factoryAbstractExcerciseCars.cars.BMW;
import factoryAbstractExcerciseCars.cars.BMWModel;
import factoryAbstractExcerciseCars.cars.Ford;
import factoryAbstractExcerciseCars.cars.FordModel;

public class ContinentalFactory extends Factory {


    @Override
    public BMW buildBMW(BMWModel bmwModel) {
        switch (bmwModel) {
            case X5:
                return new BMW(2019, SteeringWheelPosition.LEFT, BMWModel.X5);
            case E60:
                return new BMW(2019, SteeringWheelPosition.LEFT, BMWModel.E60);
            default:
                throw new UnsupportedOperationException("Model not known");
        }

    }

    @Override
    public Ford buildFord(FordModel fordModel) {
        switch (fordModel) {
            case CMAX:
                return new Ford(2019, SteeringWheelPosition.LEFT, FordModel.CMAX);
            case FOCUS:
                return new Ford(2019, SteeringWheelPosition.LEFT, FordModel.FOCUS);
            default:
                throw new UnsupportedOperationException("Model not known");
        }

    }
}