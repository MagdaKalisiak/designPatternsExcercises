package factoryAbstractExcerciseSoliderUnits.units;

public class FactoryProvider {
    private  ColorOfArmy colour;

    public FactoryProvider() {
    }

    public Factory getFactory(ColorOfArmy colour){
        switch(colour){
            case RED:
                return new RedFactory();
                case BLUE:
                return new BlueFactory();
                default:
                    throw new UnsupportedOperationException("The  army colour not known");
        }

    }


}
