/*
 RETURNCOINS STRATEGY FOR VM2
 */
package output_processor.strategy;

import data_store.*;

/**
 *
 * @author Sunit
 */
public class ReturnCoins2 extends ReturnCoins{

    @Override
    public void returnCoins(DataStore dataStore) {
        DataStore2 dataStore2 = (DataStore2) dataStore;
        System.out.println("RETURNED "+dataStore2.getTemp_coin_value()+" COINS.");
    } 
}
