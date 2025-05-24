
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class LuongBUS{
    private ArrayList<LuongDTO> list_luong;
    private LUONGDAO lDAO=new LUONGDAO();
    public LuongBUS(){
        list_luong=lDAO.SelectAll();
    }
    public ArrayList<LuongDTO> getListLuong(){
        return list_luong;
    }
    public Boolean Sua(LuongDTO l){
        for(LuongDTO luong: list_luong){
            if(l.getManv() == luong.getManv()){
                boolean result = lDAO.Update(l) !=0;
                return result;
            }
        }
        return false;
    }
    public ArrayList<LuongDTO> Find(int nam, int thang){
        ArrayList<LuongDTO> result=new ArrayList<>();
        for(LuongDTO l: list_luong){
            if(l.getNam() == nam && l.getThang() == thang){
                result.add(l);
            }
        }
        return result;
    }
}
