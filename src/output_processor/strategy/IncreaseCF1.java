/*
 INCREASECF STRATEGY FOR VM1
 */
package output_processor.strategy;

import data_store.*;

/**
 *
 * @author Sunit
 */
public class IncreaseCF1 extends IncreaseCF {

    @Override
    public void increaseCF(DataStore dataStore) {
        DataStore1 dataStore1 = (DataStore1) dataStore;
        dataStore1.setCumulative_fund(dataStore1.getCumulative_fund()+dataStore1.getTemp_coin_value());
        System.out.println("CUMULATIVE FUND SET TO:"+dataStore1.getCumulative_fund());
    }
    
}
