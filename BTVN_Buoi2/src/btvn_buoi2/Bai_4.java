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
public class Bai_4 {
    public static void main (String[] args)  {
        String chuoi;
        int n;
        float x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen n : ");
        n = scanner.nextInt();
        System.out.println("Nhap vao so thuc x : ");
        x = scanner.nextFloat();
        scanner.nextLine(); /*nextLine*/
        System.out.println("Nhập vào chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();
        System.out.println("So nguyen n vua nhap la : "+ n);
        System.out.println("So thuc x vua nhap la : "+ x);  
        System.out.println("Chuoi vua moi nhap : "+ chuoi);      

    }   
    
    
}
