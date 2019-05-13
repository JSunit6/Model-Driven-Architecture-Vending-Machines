/*
 RETURNCOINS STRATEGY FOR VM1
 */
package output_processor.strategy;

import data_store.*;

/**
 *
 * @author Sunit
 */
public class ReturnCoins1 extends ReturnCoins{

    @Override
    public void returnCoins(DataStore dataStore) {
        DataStore1 dataStore1 = (DataStore1)dataStore;
        System.out.println("RETURNED "+(dataStore1.getTemp_coin_value())+" COINS.");
    }
    
}
