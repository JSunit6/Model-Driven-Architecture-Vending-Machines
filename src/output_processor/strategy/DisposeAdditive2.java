/*
 DISPOSEADDITIVE STRATEGY FOR VM2
 */
package output_processor.strategy;

import data_store.DataStore;

/**
 *
 * @author Sunit
 */
public class DisposeAdditive2 extends DisposeAdditive {

    @Override
    public void disposeAdditive(int additive_list[]) 
    {
        if(additive_list[1] == 1 && additive_list[2] == 1)
        {
            System.err.println("ADDITIVE CREAM AND SUGAR");
        }
        else if(additive_list[1] == 1 && additive_list[2] == 0)
        {
            System.err.println("ADDITIVE CREAM");
        }
        else if(additive_list[1] == 0 && additive_list[2] == 1)
        {
            System.err.println("ADDITIVE SUGAR");
        }
        else
        {
            System.err.println("NO ADDITIVE");
        }
    }
    
}
