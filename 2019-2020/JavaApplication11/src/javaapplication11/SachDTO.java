/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

/**
 *
 * @author DELL
 */
public class SachDTO {
    private int masach,soluong,dongia;
    private String tensach;
    public SachDTO(){}
    public SachDTO(int masach, String tensach, int soluong, int dongia){
        this.masach=masach;
        this.tensach=tensach;
        this.soluong=soluong;
        this.dongia=dongia;
    }

    public int getDongia() {
        return dongia;
    }

    public int getMasach() {
        return masach;
    }

    public int getSoluong() {
        return soluong;
    }

    public String getTensach() {
        return tensach;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public void setMasach(int masach) {
        this.masach = masach;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
