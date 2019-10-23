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
public class Dog {
    private String name = "";
    private int MP=100;
    
    public void InputName(String name){
        this.name = name ;
    }
    public void ShowMP(){
        System.out.println("MP hiện tại la: "+MP);
    }
    int a= name.compareTo("");
    public void Bark(){
        if ((a)== 0x0)
        {
            System.out.println(name + " Sủa");
            MP = MP - 20;
        }
        else
            System.out.println("Xin lỗi bạn chưa nhập tên!!!");
        
    }


}
