/*
 Vending Machine 1
 */
package input_processor;

import data_store.*;
import mdaefsm.MDAEFSM;

/**
 *
 * @author Sunit
 */
public class VM1 
{
    DataStore1 dataStore;                                                       //pointer to DataStore object
    MDAEFSM mdaefsm;                                                            //pointer to MDAEFSM object
    
    public VM1(DataStore ds,MDAEFSM m) 
    {
        this.dataStore = (DataStore1) ds;
        this.mdaefsm = m;
    }
    
    //sets the temporary value of price and calls create method of MDAEFSM
    public void create(int price)
    {
        this.dataStore.setTemp_price(price);
        this.mdaefsm.create();
    }
    
    //sets the temporary value of coin and calls coin(1) or coin(0) method of MDAEFSM
    public void coin(int value)
    {
        this.dataStore.setTemp_coin_value(value);
        
        if((this.dataStore.getCumulative_fund()+value)>= this.dataStore.getPrice())
            this.mdaefsm.coin(1);
        else
            this.mdaefsm.coin(0);
    }
    
    //sets the temporary value of coin and calls coin(1) or coin(0) method of MDAEFSM
    public void card(float card_value)
    {
        if(card_value >= this.dataStore.getPrice())
            this.mdaefsm.card();
    }
    
    public void sugar()
    {
        this.mdaefsm.additive(1);
    }
    
    public void tea()
    {
        this.mdaefsm.dispose_drink(1);
    }
    
    public void chocolate()
    {
        this.mdaefsm.dispose_drink(2);
    }
    
    public void insert_cups(int n_cups)
    {
        this.mdaefsm.insert_cups(n_cups);
    }
    
    //sets the temporary price and calls set_price() method of MDAEFSM
    public void set_price(int price)
    {
        this.dataStore.setTemp_price(price);
        this.mdaefsm.set_price();
    }
    
    public void cancel()
    {
        this.mdaefsm.cancel();
    }
}
