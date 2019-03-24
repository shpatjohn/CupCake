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
public class LegoBricks {
    private int twox4;
    private int twox2;
    private int onex2;

    @Override
    public String toString() {
        return "LegoBricks{" + "twox4=" + twox4 + ", twox2=" + twox2 + ", onex2=" + onex2 + '}';
    }

    public LegoBricks(int twox4, int twox2, int onex2) {
        this.twox4 = twox4;
        this.twox2 = twox2;
        this.onex2 = onex2;
    }

    public int getTwox4() {
        return twox4;
    }

    public void setTwox4(int twox4) {
        this.twox4 = twox4;
    }

    public int getTwox2() {
        return twox2;
    }

    public void setTwox2(int twox2) {
        this.twox2 = twox2;
    }

    public int getOnex2() {
        return onex2;
    }

    public void setOnex2(int onex2) {
        this.onex2 = onex2;
    }
}
