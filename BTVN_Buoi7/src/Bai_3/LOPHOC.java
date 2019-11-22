/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_3;

import java.util.Scanner;

/**
 *
 * @author PHAN CHINH
 */
public class LOPHOC {
    public String MaLH;
    public String TenLH;
    public String NgayMo;
    public SINHVIEN[] SinhVien;
    public String GiaoVien;
    public int n;

    public String getMaLH() {
        return MaLH;
    }

    public void setMaLH(String MaLH) {
        this.MaLH = MaLH;
    }

    public String getTenLH() {
        return TenLH;
    }

    public void setTenLH(String TenLH) {
        this.TenLH = TenLH;
    }

    public String getNgayMo() {
        return NgayMo;
    }

    public void setNgayMo(String NgayMo) {
        this.NgayMo = NgayMo;
    }

    public SINHVIEN[] getSinhVien() {
        return SinhVien;
    }

    public void setSinhVien(SINHVIEN[] SinhVien) {
        this.SinhVien = SinhVien;
    }

    public String getGiaoVien() {
        return GiaoVien;
    }

    public void setGiaoVien(String GiaoVien) {
        this.GiaoVien = GiaoVien;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public LOPHOC(){
        
    }

    public LOPHOC(String MaLH, String TenLH, String NgayMo, SINHVIEN[] SinhVien, String GiaoVien, int n) {
        this.MaLH = MaLH;
        this.TenLH = TenLH;
        this.NgayMo = NgayMo;
        this.SinhVien = SinhVien;
        this.GiaoVien = GiaoVien;
        this.n = n;
    }
        public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã lớp học : ");
        MaLH = sc.nextLine();
        System.out.print("Nhập tên lớp học : ");
        TenLH = sc.nextLine();
        System.out.print("Nhập ngày mở : ");
        NgayMo = sc.nextLine();
        System.out.print("Nhập giáo viên : ");
        GiaoVien = sc.nextLine();
        System.out.print("Nhập số lượng sinh viên: ");
        n = sc.nextInt();
        SinhVien = new SINHVIEN[n];
        System.out.println("hập thông tin sinh viên");
        for (int i = 0; i < n; i++) {
            SinhVien[i] = new SINHVIEN();
            System.out.println("Nhập sinh viên thứ " + (i + 1) + ":");
            SinhVien[i].Nhap();
        }
    }

    public void xuat(){
        System.out.println("Thông tin lớp học:");
        System.out.println("Mã lớp học: " + MaLH);
        System.out.println("Tên lớp học: " + TenLH);
        System.out.println("Ngày mở: " + NgayMo);
        System.out.println("Giáo viên: " + GiaoVien);
        System.out.println("Có "+n+" sinh viên là :");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên thứ " + (i + 1) + ":");
            SinhVien[i].Xuat();
        }
    }
}
