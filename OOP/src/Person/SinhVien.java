/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

import java.util.Scanner;

/**
 *
 * @author PHAN CHINH
 */
public class SinhVien {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Person[] sinhvien = new Person[2];
        for(int i=0; i<sinhvien.length;i++)
        {
            sinhvien[i] = new Person();
            sinhvien[i].setTen(sc.nextLine());
            sinhvien[i].setTuoi(sc.nextInt());
            sc.nextLine();
            sinhvien[i].setMaSV(sc.nextLine());
        }
        for (Person x: sinhvien)
        {
            System.out.println(x.getTen());
            System.out.println(x.getTuoi());
            System.out.println(x.getMaSV());
        }
    }
}
