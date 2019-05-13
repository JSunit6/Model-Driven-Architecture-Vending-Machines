/*
 STOREPRICE STRATEGY FOR VM2
 */
package output_processor.strategy;

import data_store.*;

/**
 *
 * @author Sunit
 */
public class StorePrice2 extends StorePrice {

    @Override
    public void storePrice(DataStore dataStore) {
        DataStore2 dataStore2 = (DataStore2) dataStore;
        dataStore2.setPrice(dataStore2.getTemp_price());
        System.out.println("PRICE SET TO "+dataStore2.getPrice());
    }
    
}
