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
public class Student {
    private String name;
    private String code;
    private int age;
    
    public void InputInfo(String name , String code , int age ){
        this.name = name;
        this.code = code;
        this.age = age;
    }

    public void ShowInfo(){
        System.out.println("Sinh viên: " +name );
        System.out.print(";  Mã sinh viên: "+ code);
        System.out.print(";  Tuổi: " + age);
    }

}
