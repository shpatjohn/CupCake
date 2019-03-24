/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.HashMap;

/**
 *
 * @author shpattt
 */
public class House {

  private HashMap<String, Integer> SideW;

    @Override
    public String toString() {
        return "CalculateHouse{" + "SideW=" + SideW + ", sideL=" + sideL + ", height=" + height + ", allBricks=" + allBricks + '}';
    }
  private HashMap<String, Integer> sideL;

    public HashMap<String, Integer> getSideW() {
        return SideW;
    }

    public void setSideW(HashMap<String, Integer> SideW) {
        this.SideW = SideW;
    }

    public HashMap<String, Integer> getSideL() {
        return sideL;
    }

    public void setSideL(HashMap<String, Integer> sideL) {
        this.sideL = sideL;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public LegoBricks getAllBricks() {
        return allBricks;
    }

    public void setAllBricks(LegoBricks allBricks) {
        this.allBricks = allBricks;
    }

    public House(HashMap<String, Integer> SideW, HashMap<String, Integer> sideL, int height, LegoBricks allBricks) {
        this.SideW = SideW;
        this.sideL = sideL;
        this.height = height;
        this.allBricks = allBricks;
    }
    private int height;
    private LegoBricks allBricks;
   
    
}
