/*
 STRATEGY PATTERN FOR ZEROCF
ABSTRACT SUPER CLASS ZEROCF 
 */
package output_processor.strategy;

import data_store.DataStore;

/**
 *
 * @author Sunit
 */
public abstract class ZeroCF {
    public abstract void zeroCF(DataStore dataStore);
}
