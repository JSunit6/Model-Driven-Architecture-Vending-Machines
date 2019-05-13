/*
 DataStore for Vending Machine 1
 */
package data_store;

/**
 *
 * @author Sunit
 */
public class DataStore1 extends DataStore 
{
    private int temp_price;
    private int temp_coin_value;
    private int price;
    private int cumulative_fund;

    //Used by OutputProcessor to get the temporary price
    public int getTemp_price() {
        return temp_price;
    }

    //Used by VM1 to set the temporary price
    public void setTemp_price(int t_price) {
        this.temp_price = t_price;
    }

    //Used by OutputProcessor to get the temporary coin value
    public int getTemp_coin_value() {
        return temp_coin_value;
    }

    //Used by VM1 to set the temporary coin value
    public void setTemp_coin_value(int t_coin_value) {
        this.temp_coin_value = t_coin_value;
    }

    //Used by VM1 to get the price
    public int getPrice() {
        return price;
    }

    //Used by OutputProcessor to set the price
    public void setPrice(int pr) {
        this.price = pr;
    }

    //Used by VM1 to get the cumulative fund
    public int getCumulative_fund() {
        return cumulative_fund;
    }
    
    //Used by OutputProcessor to set the cumulative fund
    public void setCumulative_fund(int c_fund) {
        this.cumulative_fund = c_fund;
    } 
}
