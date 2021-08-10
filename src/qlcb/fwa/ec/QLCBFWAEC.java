/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlcb.fwa.ec;

import java.util.Scanner;

/**
 *
 * @author dangt
 */
public class QLCBFWAEC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number;
        Scanner s = new Scanner(System.in);
        QLCB qlcb = new QLCB();
        while (true) {
            System.out.println("1. Thêm mới cán bộ");
            System.out.println("2. Tìm kiếm theo họ tên");
            System.out.println("3. Hiển thị thông tin vê danh sách cán bộ");
            System.out.println("4. Thoát khỏi chương trình");
            System.out.println("Nhập lựa chọn của bạn: ");
            number = Integer.parseInt(s.nextLine());
            switch (number) {
                case 1:
                    qlcb.themMoi();
                    break;
                case 2:
                    System.out.println("Nhập tên muốn tìm kiếm: ");
                    String ten = s.nextLine();
                    qlcb.timKiemTheoTen(ten);
                    break;
                case 3:
                    qlcb.hienThi();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

}
