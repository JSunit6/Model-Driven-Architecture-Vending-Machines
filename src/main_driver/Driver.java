/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_driver;

import abstract_factory.*;
import data_store.DataStore;
import java.util.InputMismatchException;
import java.util.Scanner;
import mdaefsm.MDAEFSM;
import output_processor.OutputProcessor;
import input_processor.*;
import java.util.ArrayList;
import java.util.regex.Pattern;
import mdaefsm.states.*;

/**
 *
 * @author Sunit
 */
public class Driver 
{
    private OutputProcessor outputProcessor;
    private VMFactory vMFactory;
    private MDAEFSM mda;
    DataStore dataStore;
    private VM1 vm1;
    private VM2 vm2;
    private ArrayList<States> statesList; 
    
    Driver()
    {
        statesList = new ArrayList<States>();
        this.mda = new MDAEFSM();
    }
    
    public  void selectVM()
    {
        int choice = 0;
        boolean flag = true;
        while(flag)
        {
            System.out.println("------------------Main Driver--------------------");
            System.out.println("Please select (Input 1 or 2) the Vending Machine:\n 1. Vending Machine 1 \t 2. Vending Machine 2 ");
            try
            {
                Scanner scanner  = new Scanner (System.in);
                choice = scanner.nextInt();
                flag = false;
            }
            catch(InputMismatchException ip)
            {
                System.err.println("Cannot enter letters");
            }
        }
        this.initialize(choice);
    }
    
    public void initialize(int choice)
    {
        VMFactory vMFactory = null;
        switch(choice)
        {
            case 1:
                this.vMFactory = new VMFactory1();
                this.dataStore = this.vMFactory.getDataStore();
                this.outputProcessor = new OutputProcessor(this.dataStore, this.vMFactory);
               
                this.statesList.add(0, new Start(this.outputProcessor,this.mda));
                this.statesList.add(1, new NoCups(this.outputProcessor,this.mda));
                this.statesList.add(2, new Idle(this.outputProcessor,this.mda));
                this.statesList.add(3, new CoinsInserted(this.outputProcessor,this.mda)); 
                
                this.vm1 = new VM1(this.dataStore, this.mda);
                
                this.mda.setStateList(statesList);
                
                this.selectOP(1);
                break;
            case 2:
                this.vMFactory = new VMFactory2();
                this.dataStore = this.vMFactory.getDataStore();
                this.outputProcessor = new OutputProcessor(this.dataStore, this.vMFactory);
               
                this.statesList.add(0, new Start(this.outputProcessor,this.mda));
                this.statesList.add(1, new NoCups(this.outputProcessor,this.mda));
                this.statesList.add(2, new Idle(this.outputProcessor,this.mda));
                this.statesList.add(3, new CoinsInserted(this.outputProcessor,this.mda)); 
                
                this.vm2 = new VM2(this.dataStore, this.mda);
                
                this.mda.setStateList(statesList);
                
                this.selectOP(2);
                break;
            default:
                System.err.println("Invalid choice! please select again");
                selectVM();
                break;
        }
   }
    
   public void selectOP(int choice)
   {
        String op = "Select Operations (0-9)";
        Scanner sc = new Scanner(System.in);
        if(choice == 1)
        {
            System.out.println("Vending Machine 1 Choosen");
            op = op.concat("\n0. create(int p)"+"\n1. coin(int v)"+"\n2. card(float x)"+"\n3. sugar()"+"\n4. tea()"+"\n5. chocolate()"+"\n6. insert_cups(int n)"+"\n7. set_price(int p)"+"\n8. cancel()"+"\n9. Quit");
            boolean flag = true;
            int ch = 0;
            while(ch!=9)
            {
                System.out.println(op);
                try
                {
                    ch=Integer.parseInt(sc.nextLine());
                    
                    switch(ch)
                    {
                        case 0:
                            System.out.println("Selected: create(int p)");
                            System.out.println("Enter value for price");
                            int price = Integer.parseInt(sc.nextLine());
                            this.vm1.create(price);
                            break;
                        case 1:
                            System.out.println("Selected: coin(int v)");
                            System.out.println("Enter coin value v ");
                            int c_value = Integer.parseInt(sc.nextLine());
                            this.vm1.coin(c_value);
                            break;
                        case 2:
                            System.out.println("Selected: card(float x)");
                            System.out.println("Enter card value x ");
                            float ca_value = Float.parseFloat(sc.nextLine());;
                            this.vm1.card(ca_value);
                            break;
                        case 3:
                            System.out.println("Selected: sugar()");
                            this.vm1.sugar();
                            break;
                        case 4:
                            System.out.println("Selected: tea()");
                            this.vm1.tea();
                            break;
                        case 5:
                            System.out.println("Selected: chocolate()");
                            this.vm1.chocolate();
                            break;
                        case 6:
                            System.out.println("Selected: insert_cups(int n)");
                            System.out.println("Enter no. of cups n");
                            int n_cups = Integer.parseInt(sc.nextLine());;
                            this.vm1.insert_cups(n_cups);
                            break;
                        case 7:
                            System.out.println("Selected: set_price(int p)");
                            System.out.println("Enter price p");
                            int pr = Integer.parseInt(sc.nextLine());;
                            this.vm1.set_price(pr);
                            break;
                        case 8:
                            System.out.println("Selected: cancel()");
                            this.vm1.cancel();
                            break;
                        case 9:
                            System.out.println("Exited");
                            break;
                        default:
                            System.err.println("Invalid option!");
                            break;
                    }
                }
                catch(IllegalArgumentException ip)
                {
                   System.err.println("Invalid input!");
                }
            }
        }
        else if(choice == 2)
        {
            System.out.println("Vending Machine 2 Choosen");
            op = op.concat("\n0. CREATE(float p)"+"\n1. COIN(float v)"+"\n2. SUGAR()"+"\n3. CREAM()"+"\n4. COFFEE()"+"\n5. InsertCups(int n)"+"\n6. SetPrice(float p)"+"\n7. CANCEL()"+"\n8. Quit");
            boolean flag = true;
            int ch = 0;
            while(ch!=8)
            {
                System.out.println(op);
                try
                {
                    ch=Integer.parseInt(sc.nextLine());
                    
                    switch(ch)
                    {
                        case 0:
                            System.out.println("Selected: CREATE(float p)");
                            System.out.println("Enter value for price");
                            float price = Float.parseFloat(sc.nextLine());
                            this.vm2.CREATE(price);
                            break;
                        case 1:
                            System.out.println("Selected: COIN(float v)");
                            System.out.println("Enter coin value v ");
                            float c_value = Float.parseFloat(sc.nextLine());
                            this.vm2.COIN(c_value);
                            break;
                        case 2:
                            System.out.println("Selected: SUGAR()");
                            this.vm2.SUGAR();
                            break;
                        case 3:
                            System.out.println("Selected: CREAM()");
                            this.vm2.CREAM();
                            break;
                        case 4:
                            System.out.println("Selected: COFFEE()");
                            this.vm2.COFFEE();
                            break;
                        case 5:
                            System.out.println("Selected: InsertCups(int n)");
                            System.out.println("Enter no. of cups n");
                            int n_cups = Integer.parseInt(sc.nextLine());
                            this.vm2.InsertCups(n_cups);
                            break;
                        case 6:
                            System.out.println("Selected: SetPrice(float p)");
                            System.out.println("Enter price p");
                            float pr = Float.parseFloat(sc.nextLine());;
                            this.vm2.SetPrice(pr);
                            break;
                        case 7:
                            System.out.println("Selected: CANCEL()");
                            this.vm2.CANCEL();
                            break;
                        case 8:
                            System.err.println("Exited");
                            break;
                        default:
                            System.err.println("Invalid option!");
                            break;
                    }
                }
                catch(IllegalArgumentException ip)
                {
                    //System.out.println("ERROR:"+ch);
                    System.err.println("Invalid input!");
                }
            }
        }
        sc.close();
    }                                                                           //End of selectOP
    
    public static void main(String[] args) {
        new Driver().selectVM();
    }
}
