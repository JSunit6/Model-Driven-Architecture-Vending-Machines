/*
 Abstract Factory Class
*/

package abstract_factory;

import data_store.DataStore;
import output_processor.strategy.*;

/**
 *
 * @author Sunit
 */

public abstract class VMFactory {
    
    public abstract DataStore getDataStore();                                   //get DataStore1/DataStore2 object
    public abstract DisposeAdditive getDisposeAdditive();                       //get DisposeAdditive1/DisposeAdditive2 object
    public abstract DisposeDrink getDisposeDrink();                             //get DisposeDrink1/DisposeDrink2 object
    public abstract IncreaseCF getIncreaseCF();                                 //get IncreaseCF1/IncreaseCF2 object
    public abstract ZeroCF getZeroCF();                                         //get ZeroCF1/ZeroCF2 object
    public abstract ReturnCoins getReturnCoins();                               //get ReturnCoins1/ReturnCoins2 object
    public abstract StorePrice getStorePrice();                                 //get StorePrice1/StorePrice2 object
    
}
