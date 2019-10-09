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
public class Bai_8 {
       public static void main (String[] args){
        float a,b,c, max;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen a : ");
        a = scanner.nextFloat();
        System.out.println("Nhap vao so nguyen b : ");
        b = scanner.nextFloat();
        System.out.println("Nhap vao so nguyen c : ");
        c = scanner.nextFloat(); 
        max =a;
        if (a < b)
        {
            max =b;
        }
        if (max <c)
        {
            max =c;
        }
           System.out.println("So lon nhat trong 3 so la : " +max);

            
    }
     
}
