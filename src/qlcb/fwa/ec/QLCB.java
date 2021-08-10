/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlcb.fwa.ec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dangt
 */
public class QLCB {

    List<CanBo> canBos = new ArrayList<>();

    public void themMoi() {
        String hoten;
        int tuoi;
        int numGioiTinh;
        String gioiTinh = null;
        String diaChi;
        int numCanbo;
        String canBo;
        Scanner s = new Scanner(System.in);
        System.out.println("Họ tên: ");
        hoten = s.nextLine();
        System.out.println("Tuổi: ");
        tuoi = Integer.parseInt(s.nextLine());
        System.out.println("Giới tính");
        System.out.println("1. Nam");
        System.out.println("2. Nữ");
        System.out.println("3. Khác");
        System.out.println("Chọn giới tính theo số ở trên: ");
        numGioiTinh = Integer.parseInt(s.nextLine());
        switch (numGioiTinh) {
            case 1:
                gioiTinh = "Nam";
                break;
            case 2:
                gioiTinh = "Nữ";
                break;
            case 3:
                gioiTinh = "Khác";
                break;
            default:
                break;
        }
        System.out.println("Địa chỉ: ");
        diaChi = s.nextLine();
        System.out.println("Cán bộ");
        System.out.println("1. Công nhân");
        System.out.println("2. Kỹ sư");
        System.out.println("3. Nhân viên");
        System.out.println("Chọn cán bộ theo số ở trên: ");
        numCanbo = Integer.parseInt(s.nextLine());
        switch (numCanbo) {
            case 1:
                canBo = "Công nhân";
                int bac;
                while (true) {
                    System.out.println("Nhập bậc: ");
                    bac = Integer.parseInt(s.nextLine());
                    if (bac >= 1 && bac <= 10) {
                        break;
                    } else {
                        System.out.println("Nhập bậc lơn hoặc bằng 1 và nhỏ hơn hoặc bằng 10");
                    }
                }
                CongNhan cn = new CongNhan();
                cn.setHoTen(hoten);
                cn.setTuoi(tuoi);
                cn.setGioiTinh(gioiTinh);
                cn.setCanBo(canBo);
                cn.setBac(bac);
                canBos.add(cn);
                break;
            case 2:
                canBo = "Kỹ sư";
                System.out.println("Nhập Ngành Đào Tạo: ");
                String nganhDaoTao = s.nextLine();
                KySu ks = new KySu();
                ks.setHoTen(hoten);
                ks.setTuoi(tuoi);
                ks.setGioiTinh(gioiTinh);
                ks.setCanBo(canBo);
                ks.setNganhDaoTao(nganhDaoTao);
                canBos.add(ks);
                break;
            case 3:
                canBo = "Nhân viên";
                System.out.println("Nhập Công Việc: ");
                String congViec = s.nextLine();
                NhanVien nv = new NhanVien();
                nv.setHoTen(hoten);
                nv.setTuoi(tuoi);
                nv.setGioiTinh(gioiTinh);
                nv.setCanBo(canBo);
                nv.setCongViec(congViec);
                canBos.add(nv);
                break;
            default:
                break;
        }
    }

    public void timKiemTheoTen(String ten) {
        canBos.forEach((canBo) -> {
            if (canBo.getHoTen().equalsIgnoreCase(ten)) {
                System.out.println(canBo);
            }
        });
    }

    public void hienThi() {
        canBos.forEach((canBo) -> {
            System.out.println(canBo);
        });
    }
}
