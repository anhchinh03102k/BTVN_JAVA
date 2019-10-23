/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_3;

import java.util.Scanner;

/**
 *
 * @author PHAN CHINH
 */
public class JavaClass {
    private Student[] sv;
    private int ratingStar;
    private String leader;
    static  Scanner sc = new Scanner(System.in);
    public void InputStudent(){

        System.out.print("Nhập số lượng sinh viên trong lớp:  ");
        int n = sc.nextInt();
        sv = new Student[n];
        for(int i = 0; i < sv.length; i++){
            sv[i] = new Student();
            sv[i].InputInfo(sc.nextLine(), sc.nextLine(), sc.nextInt());
        }
    }
            
    public void ShowStudent(){
        for (Student x : sv)
        {
            x.ShowInfo();
        }
    }
            
    public void InputClassInfo(){
        //Scanner sc = new Scanner (System.in);
        System.out.print("Nhập tên leader: ");
        leader = sc.nextLine();
        System.out.print("Đánh giá chất lượng: ");
        ratingStar = sc.nextInt();
        InputStudent();
    }
            
    public void ShowClassInfo(){
        System.out.println("Leader: " + leader);
        System.out.println("Rating Star: " + ratingStar);
        ShowStudent();
    }    
        
}
