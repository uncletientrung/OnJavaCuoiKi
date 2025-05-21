/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class NhanVienDTO {
    private int manv;
    private String ho,ten;
    private Date ngaysinh,ngayvaolam;
    public NhanVienDTO(){}
    public NhanVienDTO(int manv, String ho, String ten, Date ngaysinh, Date ngayvaolam){
        this.manv=manv;
        this.ho=ho;
        this.ten=ten;
        this.ngaysinh=ngaysinh;
        this.ngayvaolam=ngayvaolam;
    }
    public int getManv(){
        return manv;
    }
    public void setManv(int manv){
        this.manv=manv;
    }

    public String getHo() {
        return ho;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public Date getNgayvaolam() {
        return ngayvaolam;
    }

    public String getTen() {
        return ten;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public void setNgayvaolam(Date ngayvaolam) {
        this.ngayvaolam = ngayvaolam;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
