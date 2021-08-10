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
public class KySu extends CanBo{
    String nganhDaoTao;

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNgành Đào Tạo: " + nganhDaoTao;
    }
    
    
    
}
