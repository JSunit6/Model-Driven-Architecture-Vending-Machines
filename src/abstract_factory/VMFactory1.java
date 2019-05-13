/*
Concrete Factory for Vending Machine 1
 */
package abstract_factory;

import data_store.DataStore;
import data_store.DataStore1;
import output_processor.strategy.*;


/**
 *
 * @author Sunit
 */
public class VMFactory1 extends VMFactory{
    
    //Gets the DataStore1 object
    @Override
    public DataStore getDataStore() {
        return new DataStore1();
    }

    //Gets the DisposeAdditive1 object
    @Override
    public DisposeAdditive getDisposeAdditive() {
        return new DisposeAdditive1();
    }

    //Gets the DisposeDrink1 object
    @Override
    public DisposeDrink getDisposeDrink() {
        return new DisposeDrink1();
    }

    //Gets the IncreaseCF1 object
    @Override
    public IncreaseCF getIncreaseCF() {
        return new IncreaseCF1();
    }

    //Gets the ZeroCF1 object
    @Override
    public ZeroCF getZeroCF() {
        return new ZeroCF1();
    }

    //Gets the ReturnCoins1 object
    @Override
    public ReturnCoins getReturnCoins() {
        return new ReturnCoins1();
    }

    //Gets the StorePrice1 object
    @Override
    public StorePrice getStorePrice() {
        return new StorePrice1();
    }
}
