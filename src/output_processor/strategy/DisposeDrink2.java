/*
 DISPOSEDRINK STRATEGY FOR VM2
 */
package output_processor.strategy;

import data_store.*;

/**
 *
 * @author Sunit
 */
public class DisposeDrink2 extends DisposeDrink {

    @Override
    public void disposeDrink(int d)
    {
        switch(d)
        {
            case 1:
                System.err.print("COFFEE DISPOSED WITH ");
                break;
            default:
                System.err.println("INVALID DRINK CHOICE!");
                break;
        }
    }
    
}
