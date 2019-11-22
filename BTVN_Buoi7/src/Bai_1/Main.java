/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_1;

import java.util.Scanner;

/**
 *
 * @author PHAN CHINH
 */
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in); 
        
        System.out.println("Nhập số lượng kỹ sư: ");
        n = sc.nextInt();
        KYSU[]Kysu = new KYSU[n];
        System.out.println("Nhập thông tin của từng kỹ sư: ");
        for(int i= 0 ; i<n ; i++)
        {
            System.out.println("Nhập kỹ sư thứ "+(i+1)+":");
            Kysu[i] = new KYSU();
            Kysu[i].Nhap();
        }
        System.out.println("Thông tin của từng kỹ sư là: ");
        for(int i=0 ; i<n ;i++)
        {
            System.out.println("Thông tin của kỹ sư thứ "+(i+1)+" là :");
            Kysu[i].Xuat();
        }
        int max = Kysu[0].NamTN;
        for(int i=0 ; i<n ;i++)
        {
            if(Kysu[i].NamTN > max)
                max = Kysu[i].NamTN;
        }
        System.out.println("Kỹ sư có năm tốt nghiệp lớn nhất là: ");
        for(int i=0 ; i<n ; i++)
        {
            if(Kysu[i].NamTN == max)
                Kysu[i].Xuat();
        }
    }
}
