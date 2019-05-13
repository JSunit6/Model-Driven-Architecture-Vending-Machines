/*
 STRATEGY PATTERN FOR STOREPRICE
ABSTRACT SUPER CLASS STOREPRICE 
 */
package output_processor.strategy;

import data_store.DataStore;

/**
 *
 * @author Sunit
 */
public abstract class StorePrice {
    public abstract void storePrice(DataStore dataStore);
}
