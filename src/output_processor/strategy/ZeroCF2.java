/*
 ZEROCF STRATEGY FOR VM1
 */
package output_processor.strategy;

import data_store.*;


/**
 *
 * @author Sunit
 */
public class ZeroCF2 extends ZeroCF {

    @Override
    public void zeroCF(DataStore dataStore) {
        DataStore2 dataStore2 = (DataStore2)dataStore;
        dataStore2.setCumulative_fund(0);
        System.out.println("CUMULATIVE FUND SET TO:"+dataStore2.getCumulative_fund());
    }
    
}
