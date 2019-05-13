/*
 Coin Inserted State
 */
package mdaefsm.states;

import mdaefsm.MDAEFSM;
import output_processor.OutputProcessor;

/**
 *
 * @author Sunit
 */
public class CoinsInserted extends States {

    public CoinsInserted(OutputProcessor outputProcessor,MDAEFSM m) 
    {
        super(outputProcessor,m);
        this.id = 3;
    }

    @Override
    public  void create() {
        //Do nothing (Not applicable for this state)   
    }

    @Override
    public void insert_cups(int cups) {
        //Do nothing (Not applicable for this state)   
    }

    @Override
    public void coin(int flag) {
        this.outputProcessor.returnCoins();
    }

    @Override
    public void card() {
        //Do nothing (Not applicable for this state)   
    }

    @Override
    public void cancel() {
        this.outputProcessor.returnCoins();
        this.outputProcessor.zeroCF();
    }

    @Override
    public void set_price() {
        //Do nothing (Not applicable for this state)   
    }

    @Override
    public void dispose_drink(int drink) 
    {
        if(this.mdaefsm.getCups()>1)
        {
            this.outputProcessor.disposeDrink(drink);
            this.outputProcessor.disposeAdditive(this.mdaefsm.getAdditiveList());
            this.mdaefsm.setCups((this.mdaefsm.getCups()-1));
            this.outputProcessor.zeroCF();
        }
        else if(this.mdaefsm.getCups()<=1)
        {
            this.outputProcessor.disposeDrink(drink);
            this.outputProcessor.disposeAdditive(this.mdaefsm.getAdditiveList());
        }
    }

    @Override
    public void additive(int additive) 
    {
        int additiveList[] = this.mdaefsm.getAdditiveList();
        if(additiveList[additive] == 0)
        {
           additiveList[additive] = 1; 
            System.out.println("ADDITIVE SELECTED");
        }
        else if(additiveList[additive]==1)
        {
           additiveList[additive] = 0;  
           System.out.println("ADDITIVE UNSELECTED");
        }
    }
    
}
