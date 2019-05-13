/*
 STATE PATTERN
Abstract State super class for all the states
 */
package mdaefsm.states;

import mdaefsm.MDAEFSM;
import output_processor.OutputProcessor;

/**
 *
 * @author Sunit
 */
public abstract class States 
{
    public int id;
    public OutputProcessor outputProcessor;
    public MDAEFSM mdaefsm;
    
    public States(OutputProcessor op,MDAEFSM m) 
    {
        this.id = -1;
        this.outputProcessor = op;
        this.mdaefsm = m;
    }
    
    public int getID()
    {
        return id;
    }
    
    public abstract void create();
    public abstract void insert_cups(int cups);
    public abstract void coin(int flag);
    public abstract void card();
    public abstract void cancel();
    public abstract void set_price();
    public abstract void dispose_drink(int drink);
    public abstract void additive(int additive);
    
}
