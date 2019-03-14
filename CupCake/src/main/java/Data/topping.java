/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author shpattt
 */
public class topping {
    private String topping;
    private int price;
    @Override
    public String toString() {
        return "topping: " + topping + "price: " + price;
    }
  
    /**
     *get a topping.
     * @return
     */
    public String getTopping() {
        return topping;
    }

    /**
     * set a topping.
     * @param topping
     */
    public void setTopping(String topping) {
        this.topping = topping;
    }

    /**
     * get a price.
     * @return
     */
    public int getPrice() {
        return price;
    }

    /**
     * set a price.
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * constructor.Topping has topping and price.
     * @param topping
     * @param price
     */
    public topping(String topping, int price) {
        this.topping = topping;
        this.price = price;
    }
    
}
