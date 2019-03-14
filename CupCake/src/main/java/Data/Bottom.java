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
public class Bottom {
    private String bottom;
    private int price;

    /**
     * get a bottom.
     * @return
     */
    public String getBottom() {
        return bottom;
    }

    @Override
    public String toString() {
        return "bottom: " + bottom + "price: " + price;
    }

    /**
     * set a bottom.
     * @param bottom
     */
    public void setBottom(String bottom) {
        this.bottom = bottom;
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
     * constructor. Bottom has a bottom and a price.
     * @param bottom
     * @param price
     */
    public Bottom(String bottom, int price) {
        this.bottom = bottom;
        this.price = price;
    }
}
