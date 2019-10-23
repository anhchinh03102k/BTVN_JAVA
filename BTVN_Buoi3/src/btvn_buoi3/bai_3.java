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
public class bai_3 {
    public static void HienThiMang(int []a){
        for(int b: a){
            System.out.print(b + " ");
        }
    }
    
    public static int[] ThemPhanTu(int []a, Scanner sc){
        int tgIndex = a.length + 1;
        int[] tgMang = new int[tgIndex];
        System.out.print("Nhập phần tử cần thêm: ");
        int pt = sc.nextInt();
        System.out.print("Nhập vị trí cần thêm: ");
        int vt = sc.nextInt();
        int k = 0;
        for (int i = 0; i < tgIndex; i++) {
            if(i == vt){
                tgMang[i] = pt;
            } else {
                tgMang[i] = a[k++];
            }
        }
        return tgMang;
    }
    
    public static int[] XoaPhanTu(int []a, Scanner sc){
        int tgIndex = a.length - 1;
        int[] tgMang = new int[tgIndex];
        System.out.print("Nhập vị trí cần xóa: ");
        int vt = sc.nextInt();
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (i != vt) {
                tgMang[k++] = a[i];
            }
        }
        return tgMang;
    }
    
    public static int[] DaoNguocMang(int []a){
        int[] tgMang = new int[a.length];
        int k = 0;
        for (int i = a.length - 1; i >= 0 ; i--) {
            tgMang[k++] = a[i];
        }
        return tgMang;
    }
    
    public static void HienThiSoChiaHet(int []a){
        int tg = a[1], dem = 0;
        boolean test = false;
        
        for(int i = 0; i < a.length; i++){
            if (a[i] != tg && a[i] % tg == 0) {
                dem++;
            }
        }
        if(dem != 0){
            int[] tgMang = new int[dem];
            dem = 0;
            for(int i = 0; i < a.length; i++){
                if (a[i] != tg && a[i] % tg == 0) {
                    tgMang[dem++] = a[i];
                }
            }
            System.out.print("a[1] = " + tg + ". Số chia hết cho a[1]: ");
            for(int i = 0; i < a.length; i++){
                if (a[i] != tg && a[i] % tg == 0) {
                    System.out.print(a[i] + " ");
                }
            }
        } else {
            System.out.println("Không có số nào chia hết cho a[1]");
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++)
        {
            System.out.print("Nhập a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
        int bien;
            System.out.println("Chào mừng Anh Sơn Đến Với Menu Của Em Chính");
            System.out.println("1. Hiển thị mảng vừa tạo !!!");
            System.out.println("2. Thêm một phần tử vào vị trí thứ k !!!");
            System.out.println("3. Xóa một phần tử ở vị trí thứ k !!");
            System.out.println("4. Đảo ngược mảng !!!");
            System.out.println("5. Hiển thị số a[1] và các số chia hết cho a[1]");
            System.out.println("6. Thoát.");
            
            System.out.print("Lựa chọn cua anh la: ");
            bien = sc.nextInt();
            
            switch(bien)
            {
                case 1:
                    HienThiMang(a);
                    break;
                case 2:
                    a = ThemPhanTu(a, sc);
                    break;
                case 3:
                    a = XoaPhanTu(a, sc);
                    break;
                case 4:
                    a = DaoNguocMang(a);
                    break;
                case 5:
                    HienThiSoChiaHet(a);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default: 
                    System.out.println("Moi nhap lai: ");
            }
