/*
 STOREPRICE STRATEGY FOR VM1
 */
package output_processor.strategy;

import data_store.*;

/**
 *
 * @author Sunit
 */
public class StorePrice1 extends StorePrice {

    @Override
    public void storePrice(DataStore dataStore) 
    {
        DataStore1 dataStore1 = (DataStore1) dataStore;
        dataStore1.setPrice(dataStore1.getTemp_price());
        System.out.println("PRICE SET TO "+dataStore1.getPrice());
    }
    
}
