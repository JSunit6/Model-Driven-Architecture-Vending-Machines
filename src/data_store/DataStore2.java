/*
DataStore for Vending Machine 2
 */
package data_store;

/**
 *
 * @author Sunit
 */
public class DataStore2 extends DataStore {
    private float temp_price;
    private float temp_coin_value;
    private float price;
    private float cumulative_fund;

    //Used by OutputProcessor to get the temporary price
    public float getTemp_price() {
        return this.temp_price;
    }

    //Used by VM2 to set the temporary price
    public void setTemp_price(float t_price) {
        this.temp_price = t_price;
    }

    //Used by OutputProcessor to get the temporary coin value
    public float getTemp_coin_value() {
        return this.temp_coin_value;
    }

    //Used by VM2 to set the temporary coin value
    public void setTemp_coin_value(float t_coin_value) {
        this.temp_coin_value = t_coin_value;
    }

    //Used by VM2 to get the cumulative fund
    public float getPrice() {
        return this.price;
    }
    
    //Used by OutputProcessor to set the price
    public void setPrice(float pr) {
        this.price = pr;
    }

    //Used by VM2 to get the cumulative fund
    public float getCumulative_fund() {
        return this.cumulative_fund;
    }

    //Used by OutputProcessor to set the cumulative fund
    public void setCumulative_fund(float c_fund) {
        this.cumulative_fund = c_fund;
    }
}
