/*
 INCREASECF STRATEGY FOR VM2
 */
package output_processor.strategy;

import data_store.*;

/**
 *
 * @author Sunit
 */
public class IncreaseCF2 extends IncreaseCF{

    @Override
    public void increaseCF(DataStore dataStore) {
        DataStore2 dataStore2 = (DataStore2) dataStore;
        dataStore2.setCumulative_fund(dataStore2.getCumulative_fund()+dataStore2.getTemp_coin_value());
        System.out.println("CUMULATIVE FUND SET TO:"+dataStore2.getCumulative_fund());
    }
    
}
