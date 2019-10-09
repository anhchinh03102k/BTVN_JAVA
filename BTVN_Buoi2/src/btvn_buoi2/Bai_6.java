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
public class Bai_6 {
    public static void main(String[] args){
    int n1, m1;
    float n2, m2;        
    Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen n1 :  ");
        n1 = scanner.nextInt();
        System.out.println("Nhap vao so nguyen m1 : ");
        m1 = scanner.nextInt();
        System.out.println("Nhap vao so thuc n2 : ");
        n2 = scanner.nextFloat();
        System.out.println("Nhap vao so thuc m2 : ");
        m2 = scanner.nextFloat();
        System.out.println("Tong cua hai so nguyen la : " +(n1+m1));
        System.out.println("Tong cua hai so thuc la : " +(n2+m2));
        System.out.println("Tong cua hai so n1+n2 la : " +(n1+n2));
    
    }
}
