/*
 STRATEGY PATTERN FOR INCREASECF
ABSTRACT SUPER CLASS INCREASECF 
 */
package output_processor.strategy;

import data_store.DataStore;

/**
 *
 * @author Sunit
 */
public abstract class IncreaseCF 
{
    public abstract void increaseCF(DataStore dataStore);
}
