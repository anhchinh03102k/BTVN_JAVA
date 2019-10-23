/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn_buoi3;

import java.util.Scanner;

/**
 *
 * @author PHAN CHINH
 */
public class Bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        int s=0;
        System.out.println("Nhap vao mot chuoi bat ki: ");
        a = sc.nextLine();
        for (int i=0 ; i<a.length() ; i++)
        {
            if (a.charAt(i)>='0' && a.charAt(i)<='9')
               s=s+a.charAt(i); 
        }
        System.out.println("Tong cac so trong chuoi la: "+s);
    }
    
}
