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
public class Bai_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, max, max1, max2;
         Scanner sc = new Scanner(System.in);
         do{
         System.out.println("Nhap so luong phan tu mang n: ");
         n = sc.nextInt();  
         if (n<3)
                 System.out.println("Xin moi ban nhap lai!!!");
         }
         while (n<3);
         int []a = new int [n];
         for (int i=0; i<a.length ; i++)
         {
             System.out.print("a["+(i+1)+"] =");
             a[i]= sc.nextInt();
         }
         System.out.println("Mang moi duoc nhap la: ");
         for (int i=0 ; i<a.length ; i++)
         {
             System.out.println("a["+(i+1)+"]= " +a[i]);
         }
         max= a[0];
         for (int i=0;i<a.length ; i++ )
         {
             if (a[i]>=max)
                 max=a[i];
         }
         max1=a[1];
         for (int i=0;i<a.length ; i++ )
         {
             if (a[i]>=max1 && a[i]<=max)
                 max1=a[i];
         }         
         max2=a[2];
         for (int i=0;i<a.length ; i++ )
         {
             if (a[i]>=max2 && a[i]<= max && a[i]<= max1)
                 max2=a[i];
         }
         System.out.println("So phan tu lon thu 3 trong mang la: "+max2);
    }
    
}
