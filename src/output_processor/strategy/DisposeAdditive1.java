/*
 DISPOSEADDITIVE STRATEGY FOR VM1
 */
package output_processor.strategy;

import data_store.DataStore;

/**
 *
 * @author Sunit
 */
public class DisposeAdditive1 extends DisposeAdditive
{
    @Override
    public void disposeAdditive(int additive_list[]) 
    {
        switch (additive_list[1]) 
        {
            case 1:
                System.err.println("ADDITIVE SUGAR");
                break;
            default:
                System.err.println("NO ADDITIVE");
                break;
        }
        
    }
    
}
