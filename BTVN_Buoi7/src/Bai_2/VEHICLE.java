/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_2;

/**
 *
 * @author PHAN CHINH
 */
public class VEHICLE {

    public String NhanHieu;
    public int NamSX;
    public String Hang;
    
    public String getNhanHieu() {
        return NhanHieu;
    }

    public void setNhanHieu(String NhanHieu) {
        this.NhanHieu = NhanHieu;
    }

    public int getNamSX() {
        return NamSX;
    }

    public void setNamSX(int NamSX) {
        this.NamSX = NamSX;
    }

    public String getHang() {
        return Hang;
    }

    public void setHang(String Hang) {
        this.Hang = Hang;
    }

    @Override
    public String toString() {
        return "VEHICLE{" + "NhanHieu=" + NhanHieu + ", NamSX=" + NamSX + ", Hang=" + Hang + '}';
    }


    public VEHICLE(){
        
    }
    public VEHICLE(String NhanHieu, int NamSX, String Hang) {
        this.NhanHieu = NhanHieu;
        this.NamSX = NamSX;
        this.Hang = Hang;
    }
    
    
}

