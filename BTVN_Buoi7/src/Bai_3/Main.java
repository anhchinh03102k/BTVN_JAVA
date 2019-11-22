/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_3;

/**
 *
 * @author PHAN CHINH
 */
public class Main {
    public static void main(String[] args) {
        LOPHOC LopHoc = new LOPHOC();
        LopHoc.nhap();
        LopHoc.xuat();
        int ok = 0;
        for (SINHVIEN SinhVien : LopHoc.getSinhVien()) {
            if (SinhVien.getKhoaHoc() == 11) {
                ok++;
            }
        }
        System.out.println("Có " + ok + " sinh viên khóa 11");
    }
}