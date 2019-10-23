/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_1;

/**
 *
 * @author PHAN CHINH
 */
public class RunMain {
    public static void main(String[] args) {
        Person SonNghien = new Person();
        Person TuBueDe = new Person();
        SonNghien.setName("Trần Hải Sơn");
        SonNghien.setAge(20);
        SonNghien.setHobby("Ngắm gái, Ngủ");
        SonNghien.setSex("I don't no");
        TuBueDe.setName("Anh Tú");
        TuBueDe.setAge(20);
        TuBueDe.setHobby("Ngắm giai");
        TuBueDe.setSex("I don't no");
            System.out.println("Person 1");
            System.out.println("Full name: " +SonNghien.getName());
            System.out.println("Age: "+ SonNghien.getAge());
            System.out.println("Hobby: "+ SonNghien.getHobby());
            System.out.println("Status: "+ SonNghien.getSex());
            System.out.println("Person 2");
            System.out.println("Full name: " +TuBueDe.getName());
            System.out.println("Age: "+ TuBueDe.getAge());
            System.out.println("Hobby: "+ TuBueDe.getHobby());
            System.out.println("Status: "+ TuBueDe.getSex());            
        
    }
}
