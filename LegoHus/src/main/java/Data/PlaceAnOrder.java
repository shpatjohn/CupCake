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
    public class PlaceAnOrder {
    private int height;
    private int width;
    private int length;
    private House house;

    public PlaceAnOrder( int height, int width, int length) {
      
        this.height = height;
        this.width = width;
        this.length = length;
     
    }    
    
    public PlaceAnOrder(int height, int width, int length, House house) {
   
        this.height = height;
        this.width = width;
        this.length = length;
   
        this.house = house;
    }


    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

   

    public House getHouse() {
        return house;
    }
    
    

    @Override
    public String toString() {
        return "Order{" + " height=" + height + ", width=" + width + ", length=" + length +'}';
    }
}
