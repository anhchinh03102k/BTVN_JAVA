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
public class Bai_7 {
    public static void main (String[] args){
        float a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen a : ");
        a = scanner.nextFloat();
        System.out.println("Nhap vao so nguyen b : ");
        b = scanner.nextFloat();
        if (a> b)
        {
            System.out.println("Max la so a !!! gia tri la :" +a );
        }
        else 
            System.out.println("Max la so b !!! gia tri la : " +b);
    }
    
}
