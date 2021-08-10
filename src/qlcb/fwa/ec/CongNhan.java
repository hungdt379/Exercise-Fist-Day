/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlcb.fwa.ec;



/**
 *
 * @author dangt
 */
public class CongNhan extends CanBo{
    private int bac;

    public CongNhan() {
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBậc: " + bac;
    }
    
    
}
