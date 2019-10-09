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
public class Bai_10 {
       public static void main (String[] args){
        float a,b,c, max, delta = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen a : ");
        a = scanner.nextFloat();
        System.out.println("Nhap vao so nguyen b : ");
        b = scanner.nextFloat();
        System.out.println("Nhap vao so nguyen c : ");
        c = scanner.nextFloat();
        if (a == 0)
        {
            if (b == 0 && c != 0)
            {
                System.out.println("Phuong trinh vo nghiem !!!");
            }
            else if (b == 0 && c ==0 ) 
            {
                System.out.println("Phuong trinh co vo so nghiem !!!");
            }
            else
                System.out.println("Phuong trinh co nghiem: x = "+(-c/b));
        }
        else
        {
            delta = b*b - 4*a*c ;
            if( delta > 0)
            {
                System.out.println("Phuong Trinh co nghiem X1 = "+((-b-Math.sqrt(delta))/(2*a)));
                System.out.println("Phuong Trinh co nghiem X2 = "+((b-Math.sqrt(delta))/(2*a)));
            }
            else if ( delta == 0)
            {
                System.out.println("Phuong trinh co nghiem kep X1 = X2 = : "+(-b/ (2*a)));
            }
            else
            {
                System.out.println("Phuong trinh tren vo nghiem !!!");
            }
        }
       }
}
