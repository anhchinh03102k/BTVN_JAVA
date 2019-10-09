/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn_buoi2;

import java.util.Scanner;

/**
 *
 * @author PHAN CHINH
 */
public class Bai_9 {
    public static void main (String[] args){
        float a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen a : ");
        a = scanner.nextFloat();
        System.out.println("Nhap vao so nguyen b : ");
        b = scanner.nextFloat();
        if (a == 0 && b != 0)
        {
            System.out.println("Phuong trinh vo nghiem !!!");
        }
        else if (a == 0 && b ==0 ) 
        {
            System.out.println("Phuong trinh co vo so nghiem !!!");
        }
        else
            System.out.println("Phuong trinh co nghiem: x = "+(-b/a));
    }    
}
