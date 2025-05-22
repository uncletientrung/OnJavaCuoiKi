/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class SachBUS {
    private ArrayList<SachDTO> list_sach;
    private SachDAO sDAO=new SachDAO();
    public SachBUS(){
        list_sach=sDAO.SelectAll();
    }
    public Boolean themSach(SachDTO snew){
        for(SachDTO sach: list_sach){
            if(sach.getMasach()==snew.getMasach()){
                return false;
            }
        }
        Boolean result=sDAO.Insert(snew) !=0;
        if (result) {
            list_sach.add(snew);
        }
        return  result;
    }
    public  ArrayList<SachDTO> getListSach(){
        return list_sach;
    }
}
