/*
MDA EFSM Class
 */
package mdaefsm;

import java.util.ArrayList;
import mdaefsm.states.*;

/**
 *
 * @author Sunit
 */
public class MDAEFSM 
{
    private States states;                                                      //Pointer to state classes
    private ArrayList<States> stateList;                                        //List of all the state classes
    private int cups;                                                           //Variable for storing cup value
    private int additiveList[];                                                 //List of Additives
    private int id;

    public MDAEFSM() 
    {
        this.additiveList = new int[5];
    }
    
    //returns the additive list
    public int[] getAdditiveList() 
    {
        return this.additiveList;
    }

    //sets the value of additive list
    public void setAdditiveList(int[] additiveList) 
    {
        this.additiveList = additiveList;
    }
    
    //return the value of state pointers
    public States getStates() 
    {
        return states;
    }

    //set the value of state pointer
    public void setStates(States st) {
        this.states = st;
    }

    //sets the stateList
    public void setStateList(ArrayList<States> sl) {
        this.stateList = sl;
        this.setStates(sl.get(0));
    }

    //returns the value of cups varibale
    public int getCups() {
        return this.cups;
    }

    //sets the value of cups varibale
    public void setCups(int cups) {
        this.cups = cups;
    }
    
    public void create()
    {
        this.states.create();
        id = this.states.getID();
        
        switch(id)
        {
            case 0:
                this.setStates(this.stateList.get(1));
                System.out.println("CHANGE OF STATE FROM START TO NO CUPS\n");
                break;
            default:
                System.out.println("INVALID OPERATION FOR THIS STATE!\n");
                break;
        }
    }
    
    public void insert_cups(int n_cups)
    {
        if(n_cups > 0)
        {    
            //this.setCups(this.getCups()+n_cups);
            this.states.insert_cups(n_cups);
            id = this.states.getID();
            
            switch(id)
            {
                case 1:
                    this.setStates(this.stateList.get(2));
                    System.out.println("CHANGE OF STATE FROM NO CUPS TO IDLE\n");
                    break;
                case 2:
                    this.setStates(this.stateList.get(2));
                    System.out.println("REMAINS IN SAME STATE\n");
                    break;
                default:
                    System.out.println("INVALID OPERATION FOR THIS STATE!\n");
                    break;
            }
        }
        else
        {
            System.out.println("Cups cannot be negative!\n");
        }
    }
    
    public void coin(int flag)
    {
        this.states.coin(flag);
        id = this.states.getID();
        
        switch(id)
        {
            case 1:
                this.setStates(this.stateList.get(1));
                System.out.println("REMAINS IN SAME STATE\n");
                break;
            case 2:
                if (flag == 0)
                {
                    this.setStates(this.stateList.get(2));
                    System.out.println("REMAINS IN SAME STATE\n");
                }
                else if(flag == 1)
                {
                    this.setStates(this.stateList.get(3));
                    System.out.println("CHANGE OF STATE FROM IDLE TO COINS INSERTED\n");
                }
                break;
            case 3:
                this.setStates(this.stateList.get(3));
                System.out.println("REMAINS IN SAME STATE\n");
                break;
            default:
                System.out.println("INVALID OPERATION FOR THIS STATE!\n");
                break;
        }
    }
    
    public void card()
    {
        this.states.card();
        id = this.states.getID();
        
        switch(id)
        {
            case 2:
                this.setStates(this.stateList.get(3));
                System.out.println("CHANGE OF STATE FROM IDLE TO COINS INSERTED\n");
                break;
            default:
                System.out.println("INVALID OPERATION FOR THIS STATE!\n");
                break;       
        }
    }
    
    public void cancel()
    {
        this.states.cancel();
        id = this.states.getID();
        
        switch(id)
        {
            case 3:
                this.setStates(this.stateList.get(2));
                System.out.println("STATE CHANGED FROM COINS INSERTED TO IDLE\n");
                break;
            default:
                System.out.println("INVALID OPERATION FOR THIS STATE!\n");
                break;
        }
    }
    
    public void set_price()
    {
        this.states.set_price();
        id = this.states.getID();
        
        switch(id)
        {
            case 2:
                this.setStates(this.stateList.get(2));
                System.out.println("REMAINS IN SAME STATE\n");
                break;
            default:
                System.out.println("INVALID OPERATION FOR THIS STATE!\n");
                break;
        }
    }
    
    public void dispose_drink(int drink)
    {
        this.states.dispose_drink(drink);
        id = this.states.getID();
        
        switch(id)
        {
            case 3:
                if(this.cups>1)
                {
                    this.setStates(this.stateList.get(2));
                    System.out.println("CHANGE OF STATE FROM COINS INSERTED TO IDLE\n");
                }
                else if(this.cups<=1)
                {
                    this.setStates(this.stateList.get(1));
                    System.out.println("CHANGE OF STATE FROM COINS INSERTED TO NO_CUPS\n");
                }
                break;
            default:
                System.out.println("INVALID OPERATION FOR THIS STATE!\n");
                break;
        }
    }
    
    public void additive(int additive)
    {
        this.states.additive(additive);
        id = this.states.getID();
        
        switch(id)
        {
            case 3:
                this.setStates(this.stateList.get(3));
                System.out.println("REMAINS IN SAME STATE\n");
                break;
            default:
                System.out.println("INVALID OPERATION FOR THIS STATE!\n");
                break;
        }
    }  
}
