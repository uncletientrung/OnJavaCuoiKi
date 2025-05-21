/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class NhanVienBUS {
    private NhanVienDAO nvDAO=new NhanVienDAO();
    private ArrayList<NhanVienDTO> list_nv;
    public NhanVienBUS(){
        list_nv=nvDAO.selectAll();
    }
    public Boolean XoaBUS(int manv){
        Boolean result= nvDAO.XoaNhanVien(manv) !=0;
        return result;
    }
    public Boolean SuaBUS(NhanVienDTO nv){
        Boolean result=nvDAO.UpdateNhanVien(nv) !=0;
        return result;
    }
    public NhanVienDTO FindBUS(int manv){
        for(NhanVienDTO nv: list_nv){
            if(nv.getManv()==manv){
                return  nv;
            }
        }
        return null;
    }
}
