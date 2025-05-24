/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication13;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class cau11 {
    public ArrayList<Integer> dayso(){
        ArrayList<Integer> result=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap vao 1 so nguyen khong am: ");
        int n=sc.nextInt();
        sc.nextLine();
        if(n<0){return null;}
        for(int i=0;i<n;i++){
             System.out.print("nhap so thu "+(i+1)+ " ( khong am): ");
             int x=sc.nextInt();
             sc.nextLine();
             if(x<0){
                 System.out.print("nhap so thu "+(i+1)+ " la am nen thanh 0");
                 result.add(i,0);
                 continue;
             }
             result.add(i,x);
        }
        return result;
    }
    public boolean sochinhphuong(int n){
        double result=Math.sqrt(n);
        if(result%1==0){
            return  true;
        }else{
            return false;
        }
    }
    public double tong(ArrayList<Integer> dayso){
        double result=0;
        for(Integer so: dayso){
            boolean check=sochinhphuong(so);
            if (check && so!=0) {
                result+=so;
            }
            continue;
        }
        return result;
    }
    public static void main(String[] args) {
        cau11 obj = new cau11();

        ArrayList<Integer> ds = obj.dayso();
        if (ds == null) {
            System.out.println("Số lượng phần tử không hợp lệ.");
            return;
        }

        double tongCP = obj.tong(ds);
        System.out.println("Tổng các số chính phương trong dãy là: " + tongCP);
    }

}
