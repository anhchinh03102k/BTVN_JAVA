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
public class NGUOI {
    public String HoTen;
    public String NgaySinh;
    public String QueQuan;

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }
    
    public NGUOI(){
        
    }

    public NGUOI(String HoTen, String NgaySinh, String QueQuan) {
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.QueQuan = QueQuan;
    }
    
    public void Nhap()
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập tên: ");
    HoTen = sc.nextLine();
    System.out.println("Nhập quê quán : ");
    QueQuan = sc.nextLine();
    System.out.println("Nhập Năm sinh : ");
    NgaySinh = sc.nextLine();
    }
    public void Xuat()
    {
    System.out.println("Họ Tên : " +HoTen);
    System.out.println("Quê quán : "+QueQuan);
    System.out.println("Năm sinh : "+NgaySinh);
    }
}
