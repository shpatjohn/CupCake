/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Mapper.DataMapper;

/**
 *
 * @author shpattt
 */
public class CupCake {
    //DataMapper data = new DataMapper();
    //int price;
    //topping t;
    // Bottom m;

    /**
     * calculates the total price.
     * @param toppingprice
     * @param bottomprice
     * @return
     */
    
     public int TotalPrice(int toppingprice, int bottomprice)
     { 
        int price = toppingprice + bottomprice;
        return price;
        
     }
     
//     public int GetTotalPrice()
//     {
//         price += t.getPrice() + m.getPrice();
//     }
     
    
}
