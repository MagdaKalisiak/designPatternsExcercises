package factoryAbstractExcerciseCars;

public class FactoryProvider {


    public Factory getFactory(SteeringWheelPosition steeringWheelPosition) {
        switch (steeringWheelPosition) {
            case LEFT:
                return new ContinentalFactory();
            case RIGHT:
                return new CommonwealthFactory();
            default:
                throw new UnsupportedOperationException("The position RIGHT or LEFT required");
        }

    }
}
