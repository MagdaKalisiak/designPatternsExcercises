package factoryAbstractExcerciseCars;

import factoryAbstractExcerciseCars.cars.BMW;
import factoryAbstractExcerciseCars.cars.BMWModel;
import factoryAbstractExcerciseCars.cars.Ford;
import factoryAbstractExcerciseCars.cars.FordModel;

public  abstract class Factory {
    public  abstract BMW buildBMW(BMWModel bmwModel);
    public abstract Ford buildFord(FordModel fordModel);
}
