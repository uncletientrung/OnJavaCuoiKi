
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class nhatkyDTO {
    private int id,sotien;
    private String mucchi,ghichu;
    private Date ngay;
    public nhatkyDTO(int id, Date ngay, String mucchi, int sotien, String ghichu){
        this.id=id;
        this.ngay=ngay;
        this.mucchi=mucchi;
        this.sotien=sotien;
        this.ghichu=ghichu;
    }

    public String getGhichu() {
        return ghichu;
    }

    public int getId() {
        return id;
    }

    public String getMucchi() {
        return mucchi;
    }

    public Date getNgay() {
        return ngay;
    }

    public int getSotien() {
        return sotien;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMucchi(String mucchi) {
        this.mucchi = mucchi;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public void setSotien(int sotien) {
        this.sotien = sotien;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
