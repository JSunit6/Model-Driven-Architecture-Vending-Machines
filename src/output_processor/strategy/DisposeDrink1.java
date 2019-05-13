/*
 DISPOSEDRINK STRATEGY FOR VM1
 */
package output_processor.strategy;

import data_store.*;

/**
 *
 * @author Sunit
 */
public class DisposeDrink1 extends DisposeDrink {

    @Override
    public void disposeDrink(int d) 
    {
        switch(d)
        {
            case 1:
                System.err.print("TEA DISPOSED WITH ");
                break;
            case 2:
                System.err.print("CHOCOLATE DISPOSED WITH ");
                break;
            default:
                System.err.println("INVALID DRINK CHOICE!");
                break;
        }
    }
}
