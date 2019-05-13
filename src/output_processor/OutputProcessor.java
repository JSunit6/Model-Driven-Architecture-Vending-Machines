/*
 OutputProcessor
 */
package output_processor;

import abstract_factory.VMFactory;
import data_store.DataStore;
import output_processor.strategy.*;

/**
 *
 * @author Sunit
 */
public class OutputProcessor 
{
    
    private DataStore dataStore;                                                //pointer to DataStore
    private VMFactory vMFactory;                                                //pointer to abstract factory
    private DisposeAdditive disposeAdditive;                                    //pointer to DisposeAdditive class
    private DisposeDrink disposeDrink;                                          //pointer to DisposeDrink class
    private IncreaseCF increaseCF;                                              //pointer to IncreaseCF class
    private ZeroCF zeroCF;                                                      //pointer to ZeroCF class
    private ReturnCoins returnCoins;                                            //pointer to ReturnCoins class
    private StorePrice storePrice;                                              //pointer to StorePrice class

    public OutputProcessor(DataStore ds, VMFactory vmf) 
    {
        this.dataStore = ds;
        this.vMFactory = vmf;
        intialize();
    }
    private void intialize() 
    {
        this.disposeAdditive = this.vMFactory.getDisposeAdditive();             //set the pointer to either DisposeAdditive1/DisposeAdditive2
        this.disposeDrink = this.vMFactory.getDisposeDrink();                   //set the pointer to either DisposeDrink1/DisposeDrink2
        this.zeroCF = this.vMFactory.getZeroCF();                               //set the pointer to either ZeroCF1/ZeroCF2
        this.increaseCF = this.vMFactory.getIncreaseCF();                       //set the pointer to either IncreaseCF1/IncreaseCF2
        this.returnCoins = this.vMFactory.getReturnCoins();                     //set the pointer to either ReturnCoins1/ReturnCoins2
        this.storePrice = this.vMFactory.getStorePrice();                       //set the pointer to either StorePrice1/StorePrice2
    }
    
    //Calls StorePrice1 or StorePrice2
    public void storePrice()
    {
        this.storePrice.storePrice(this.dataStore);
    }

    //Calls DisposeAdditive1 or DisposeAdditive2
    public void disposeAdditive(int additive_list[])
    {
        this.disposeAdditive.disposeAdditive(additive_list);
    }
    
    //Calls DisposeDrink1 or DisposeDrink2
    public void disposeDrink(int d)
    {
        this.disposeDrink.disposeDrink(d);
    }
    
    //Calls IncreaseCF1 or IncreaseCF2
    public void increaseCF()
    {
        this.increaseCF.increaseCF(this.dataStore);
    }
    
    //Calls ZeroCF1 or ZeroCF2
    public void zeroCF()
    {
        this.zeroCF.zeroCF(this.dataStore);
    }
    
    //Calls ReturnCoins1 or ReturnCoins2
    public void returnCoins()
    {
        this.returnCoins.returnCoins(this.dataStore);
    }
    
}
