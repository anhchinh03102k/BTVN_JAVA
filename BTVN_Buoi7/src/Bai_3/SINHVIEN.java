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
public class SINHVIEN extends NGUOI{
    public String MaSV;
    public String Nganh;
    public int KhoaHoc;

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }

    public int getKhoaHoc() {
        return KhoaHoc;
    }

    public void setKhoaHoc(int KhoaHoc) {
        this.KhoaHoc = KhoaHoc;
    }
    
    public SINHVIEN(){
        
    }

    public SINHVIEN(String MaSV, String Nganh, int KhoaHoc) {
        this.MaSV = MaSV;
        this.Nganh = Nganh;
        this.KhoaHoc = KhoaHoc;
    }

    public SINHVIEN(String MaSV, String Nganh, int KhoaHoc, String HoTen, String NgaySinh, String QueQuan) {
        super(HoTen, NgaySinh, QueQuan);
        this.MaSV = MaSV;
        this.Nganh = Nganh;
        this.KhoaHoc = KhoaHoc;
    }


    
}
