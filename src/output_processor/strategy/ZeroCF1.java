/*
 ZEROCF STRATEGY FOR VM1
 */
package output_processor.strategy;

import data_store.*;

/**
 *
 * @author Sunit
 */
public class ZeroCF1 extends ZeroCF{

    @Override
    public void zeroCF(DataStore dataStore) {
        DataStore1 dataStore1 = (DataStore1)dataStore;
        dataStore1.setCumulative_fund(0);
        System.out.println("CUMULATIVE FUND SET TO:"+dataStore1.getCumulative_fund());
    }
    
}
