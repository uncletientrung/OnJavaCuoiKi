/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class LuongDTO {
    private int manv, nam,thang, songaylv, tienconngay, luong;
    public LuongDTO(int manv, int nam, int thang, int songay, int tiencongngay, int luong){
        this.manv=manv;
        this.nam=nam;
        this.thang=thang;
        this.songaylv=songay;
        this.tienconngay=tiencongngay;
        this.luong=luong;
    }

    public int getLuong() {
        return luong;
    }

    public int getManv() {
        return manv;
    }

    public int getNam() {
        return nam;
    }

    public int getSongaylv() {
        return songaylv;
    }

    public int getThang() {
        return thang;
    }

    public int getTienconngay() {
        return tienconngay;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public void setManv(int manv) {
        this.manv = manv;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public void setSongaylv(int songaylv) {
        this.songaylv = songaylv;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public void setTienconngay(int tienconngay) {
        this.tienconngay = tienconngay;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
           
}
