/*
No Cups State
 */
package mdaefsm.states;

import mdaefsm.MDAEFSM;
import output_processor.OutputProcessor;

/**
 *
 * @author Sunit
 */
public class NoCups extends States {

    public NoCups(OutputProcessor outputProcessor,MDAEFSM m) {
        super(outputProcessor,m);
        this.id = 1;
    }

    @Override
    public void create() {
        //Do nothing (Not applicable for this state)
    }

    @Override
    public void insert_cups(int n_cups) 
    {
        this.mdaefsm.setCups(n_cups);
        this.outputProcessor.zeroCF();
        System.out.println("NO. OF CUPS SET TO:"+this.mdaefsm.getCups());
    }

    @Override
    public void coin(int flag) 
    {
        this.outputProcessor.returnCoins();
    }

    @Override
    public void card() {
        //Do nothing (Not applicable for this state)
    }

    @Override
    public void cancel() {
        //Do nothing (Not applicable for this state)
    }

    @Override
    public void set_price() {
        //Do nothing (Not applicable for this state)
    }

    @Override
    public void dispose_drink(int drink) {
        //Do nothing (Not applicable for this state)
    }

    @Override
    public void additive(int additive) {
        //Do nothing (Not applicable for this state)
    }
}
