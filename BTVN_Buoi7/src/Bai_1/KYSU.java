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
public class KYSU extends PERSON{
    
    public String Nganh;
    public int NamTN;
    
public void Nhap(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập tên của kỹ sư: ");
    HoTen = sc.nextLine();
    System.out.println("Nhập quê quán của kỹ sư: ");
    QueQuan = sc.nextLine();
    System.out.println("Nhập Năm sinh của kỹ sư: ");
    NgaySinh = sc.nextLine();
    System.out.println("Nhập ngành học của kỹ sư: ");
    Nganh = sc.nextLine();
    System.out.println("Nhập vào năm tốt nghiệp của kỹ sư: ");
    NamTN = sc.nextInt();
    
}
public void Xuat(){
    System.out.println("Họ Tên Kỹ Sư: " +HoTen);
    System.out.println("Quê quán kỹ sư: "+QueQuan);
    System.out.println("Năm sinh của kỹ sư: "+NgaySinh);
    System.out.println("Ngành học của kỹ sư: "+Nganh);
    System.out.println("Năm Tốt Nghiệp là: "+NamTN);
}

}

