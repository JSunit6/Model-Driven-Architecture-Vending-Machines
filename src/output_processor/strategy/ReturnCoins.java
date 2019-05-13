/*
 STRATEGY PATTERN FOR RETURNCOINS
ABSTRACT SUPER CLASS RETURNCOINS 
 */
package output_processor.strategy;

import data_store.DataStore;

/**
 *
 * @author Sunit
 */
public abstract class ReturnCoins 
{
    public abstract void returnCoins(DataStore dataStore);
}
