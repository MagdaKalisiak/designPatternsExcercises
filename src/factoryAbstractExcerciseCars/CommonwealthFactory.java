package factoryAbstractExcerciseCars;

import factoryAbstractExcerciseCars.cars.BMW;
import factoryAbstractExcerciseCars.cars.BMWModel;
import factoryAbstractExcerciseCars.cars.Ford;
import factoryAbstractExcerciseCars.cars.FordModel;

public class CommonwealthFactory extends Factory{

    @Override
    public BMW buildBMW(BMWModel bmwModel) {
        switch (bmwModel) {
            case X5:
                return new BMW(2019, SteeringWheelPosition.RIGHT, BMWModel.X5);
            case E60:
                return new BMW(2019, SteeringWheelPosition.RIGHT, BMWModel.E60);
            default:
                throw new UnsupportedOperationException("Model not known");
        }

    }

    @Override
    public Ford buildFord(FordModel fordModel) {
        switch (fordModel) {
            case CMAX:
                return new Ford(2019, SteeringWheelPosition.RIGHT, FordModel.CMAX);
            case FOCUS:
                return new Ford(2019, SteeringWheelPosition.RIGHT, FordModel.FOCUS);
            default:
                throw new UnsupportedOperationException("Model not known");
        }

    }
}
