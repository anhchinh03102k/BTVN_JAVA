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
public class OTO extends VEHICLE{
    public int SoChoNgoi;
    public int DungTich;

    public int getSoChoNgoi() {
        return SoChoNgoi;
    }

    public void setSoChoNgoi(int SoChoNgoi) {
        this.SoChoNgoi = SoChoNgoi;
    }

    public int getDungTich() {
        return DungTich;
    }

    public void setDungTich(int DungTich) {
        this.DungTich = DungTich;
    }

    @Override
    public String toString() {
        return "OTO{" + "SoChoNgoi=" + SoChoNgoi + ", DungTich=" + DungTich + '}';
    }


    public OTO(){
        
    }
    
    public OTO(int SoChoNgoi, int DungTich, String NhanHieu, int NamSX, String Hang) {
        super(NhanHieu, NamSX, Hang);
        this.SoChoNgoi = SoChoNgoi;
        this.DungTich = DungTich;
    }
    
}