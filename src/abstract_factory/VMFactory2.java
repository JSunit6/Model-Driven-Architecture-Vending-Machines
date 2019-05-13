/*
Concrete Factory for Vending Machine 2
 */
package abstract_factory;

import data_store.*;
import output_processor.strategy.*;


/**
 *
 * @author Sunit
 */
public class VMFactory2 extends VMFactory {

    //Gets the DataStore2 object
    @Override
    public DataStore getDataStore() {
        return new DataStore2();
    }
    
    //Gets the DisposeAdditive2 object
    @Override
    public DisposeAdditive getDisposeAdditive() {
        return new DisposeAdditive2();
    }

    //Gets the DataDrink2 object
    @Override
    public DisposeDrink getDisposeDrink() {
        return new DisposeDrink2();
    }

    //Gets the IncreaseCF2 object
    @Override
    public IncreaseCF getIncreaseCF() {
        return new IncreaseCF2();
    }

    //Gets the ZeroCF2 object
    @Override
    public ZeroCF getZeroCF() {
        return new ZeroCF2();
    }

    //Gets the ReturnCoins2 object
    @Override
    public ReturnCoins getReturnCoins() {
        return new ReturnCoins2();
    }

    //Gets the StorePrice2 object
    @Override
    public StorePrice getStorePrice() {
        return new StorePrice2();
    }
}
