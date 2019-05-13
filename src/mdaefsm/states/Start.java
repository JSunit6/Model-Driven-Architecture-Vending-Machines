/*
 Start state
 */
package mdaefsm.states;

import mdaefsm.MDAEFSM;
import output_processor.OutputProcessor;

/**
 *
 * @author Sunit
 */
public class Start extends States {

    public Start(OutputProcessor outputProcessor, MDAEFSM m) {
        super(outputProcessor,m);
        this.id= 0;
    }

    @Override
    public void create() {
        this.outputProcessor.storePrice();
    }

    @Override
    public void insert_cups(int cups) {
        //Do nothing (Not applicable for this state)   
    }

    @Override
    public void coin(int flag) {
        //Do nothing (Not applicable for this state)
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
