/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_2;

import java.util.Scanner;

/**
 *
 * @author PHAN CHINH
 */
public class RunMain {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in) ;
        Dog meo = new Dog();
        System.out.println("Nhập vào tên: ");
        meo.InputName(sc.nextLine());
        meo.Bark();
        meo.ShowMP();
        meo.Bark();
        meo.ShowMP();
        meo.Bark();
        meo.ShowMP();
    }
    
}
