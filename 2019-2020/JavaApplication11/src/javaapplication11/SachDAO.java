/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javaapplication10.JDBCUtil;

/**
 *
 * @author DELL
 */
public class SachDAO {
    public ArrayList<SachDTO> SelectAll(){
        ArrayList<SachDTO> result=new ArrayList<>();
        try {
            Connection con= JDBCUtil.getConnection();
            String sql="Select * From sach";
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                int masach=rs.getInt(1);
                String tensach=rs.getString(2);
                int soluong=rs.getInt(3);
                int dongia=rs.getInt(4);
                SachDTO sach= new SachDTO(masach, tensach, soluong, dongia);
                result.add(sach);
            }
            JDBCUtil.closeConnection(con);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public int Insert(SachDTO snew){
        int result=0;
        try {
            Connection con=JDBCUtil.getConnection();
            String sql="Insert into sach(masach, tensach, soluong, dongia) values (? , ? , ? , ?)";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setInt(1, snew.getMasach());
            pst.setString(2, snew.getTensach());
            pst.setInt(3, snew.getSoluong());
            pst.setInt(4, snew.getDongia());
            result=pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
