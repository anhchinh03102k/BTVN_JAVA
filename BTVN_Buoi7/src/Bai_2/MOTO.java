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
public class MOTO extends VEHICLE{

    
    public int PhanKhoi;
        
    public int getPhanKhoi() {
        return PhanKhoi;
    }

    public void setPhanKhoi(int PhanKhoi) {
        this.PhanKhoi = PhanKhoi;
    }

    public MOTO(){
        
    }

    public MOTO(int PhanKhoi, String NhanHieu, int NamSX, String Hang) {
        super(NhanHieu, NamSX, Hang);
        this.PhanKhoi = PhanKhoi;
    }
    
    @Override
    public String toString() {
        return "MOTO{" + "PhanKhoi=" + PhanKhoi + '}';
    }
    
    

}
