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
public class CanBo {

    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;
    private String canBo;
    
    public CanBo() {
    }

    public String getCanBo() {
        return canBo;
    }

    public void setCanBo(String canBo) {
        this.canBo = canBo;
    }


    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Họ tên: " + hoTen + "\nTuổi: " + tuoi + "\nGiới tính: " + gioiTinh +
                "\nĐịa chỉ: " + diaChi + "\nCán bộ: " + canBo;
    }
    
    
}
