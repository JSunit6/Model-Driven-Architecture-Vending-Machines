/*
 Vending Machine 2
 */
package input_processor;

import data_store.*;
import mdaefsm.MDAEFSM;

/**
 *
 * @author Sunit
 */
public class VM2 
{
    DataStore2 dataStore;
    MDAEFSM mdaefsm;
    
    public VM2(DataStore ds,MDAEFSM m) 
    {
        this.dataStore =(DataStore2) ds;
        this.mdaefsm = m;
    }
    
    //sets the temporary value of price and calls create method of MDAEFSM
    public void CREATE(float price)
    {
        this.dataStore.setTemp_price(price);
        this.mdaefsm.create();
    }
    
    //sets the temporary value of coin and calls coin(1) or coin(0) method of MDAEFSM
    public void COIN(float coin_value)
    {
        this.dataStore.setTemp_coin_value(coin_value);
        if((this.dataStore.getCumulative_fund()+coin_value)>=this.dataStore.getPrice())
            this.mdaefsm.coin(1);
        else
            this.mdaefsm.coin(0);
    }
    
    public void SUGAR()
    {
        this.mdaefsm.additive(2);
    }
    
    public void CREAM()
    {
        this.mdaefsm.additive(1);
    }
    
    public void COFFEE()
    {
        this.mdaefsm.dispose_drink(1);
    }
    
    public void InsertCups(int n_cups)
    {
        this.mdaefsm.insert_cups(n_cups);
    }
    
    //sets the temporary price and calls set_price() method of MDAEFSM
    public void SetPrice(float price)
    {
        this.dataStore.setTemp_price(price);
        this.mdaefsm.set_price();
    }
    
    public void CANCEL()
    {
        this.mdaefsm.cancel();
    }
}
