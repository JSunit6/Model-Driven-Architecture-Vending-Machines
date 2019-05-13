/*
 Idle State
 */
package mdaefsm.states;

import mdaefsm.MDAEFSM;
import output_processor.OutputProcessor;
import java.util.*;
/**
 *
 * @author Sunit
 */
public class Idle extends States {

    public Idle(OutputProcessor outputProcessor,MDAEFSM m) {
        super(outputProcessor,m);
        this.id = 2;
    }

    @Override
    public void create() {
         //Do nothing (Not applicable for this state)   
    }

    @Override
    public void insert_cups(int n_cups) 
    {
        this.mdaefsm.setCups(this.mdaefsm.getCups()+n_cups);
        System.out.println("NO. OF CUPS SET TO:"+this.mdaefsm.getCups());
    }

    @Override
    public void coin(int flag) {
        if(flag == 1)
        {
            Arrays.fill(this.mdaefsm.getAdditiveList(), 0);
        }
        this.outputProcessor.increaseCF();
    }

    @Override
    public void card() {
        Arrays.fill(this.mdaefsm.getAdditiveList(), 0);
        this.outputProcessor.zeroCF();
    }

    @Override
    public void cancel() {
         //Do nothing (Not applicable for this state)   
    }

    @Override
    public void set_price() {
        this.outputProcessor.storePrice();
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
