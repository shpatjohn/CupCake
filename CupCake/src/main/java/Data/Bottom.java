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

    public String getBottom() {
        return bottom;
    }

    @Override
    public String toString() {
        return "bottom: " + bottom + "price: " + price;
    }

    public void setBottom(String bottom) {
        this.bottom = bottom;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Bottom(String bottom, int price) {
        this.bottom = bottom;
        this.price = price;
    }
}
