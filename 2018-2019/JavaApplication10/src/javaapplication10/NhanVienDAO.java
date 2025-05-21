/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class NhanVienDAO {
    public int XoaNhanVien(int manv){
        int result=0;
        try {
            Connection con= JDBCUtil.getConnection();
            String sql="Delete From nhanvien Where manv = ? ";
            PreparedStatement pst= con.prepareStatement(sql);
            pst.setInt(1, manv);
            result=pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch(Exception er) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, er);
        }
        return result;
    }
    public int UpdateNhanVien(NhanVienDTO nv){
        int result=0;
        try {
            Connection con= JDBCUtil.getConnection();
            String sql="Update nhanvien Set ho = ? , ten= ? , ngaysinh= ? , ngaybatdaulam = ? Where manv= ?  ";
            PreparedStatement pst= con.prepareStatement(sql);
            pst.setString(1, nv.getHo());
            pst.setString(2,nv.getTen());
            pst.setDate(3, new java.sql.Date(nv.getNgaysinh().getTime()));
            pst.setDate(4, new java.sql.Date(nv.getNgayvaolam().getTime()));
            pst.setInt(5, nv.getManv());
            result=pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
                System.err.println("Lỗi sửa nhân viên: " + e.getMessage());
                e.printStackTrace(); // Rất hữu ích khi debug
        } 
        return result;
    }
    public ArrayList<NhanVienDTO> selectAll(){
        ArrayList<NhanVienDTO> result=new ArrayList<>();
        try {
            Connection con=JDBCUtil.getConnection();
            String sql="Select * From nhanvien";
            PreparedStatement pst= con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            while(rs.next()) {
                int manv=rs.getInt(1);
                String ho=rs.getString(2);
                String ten=rs.getString(3);
                Date ngaysinh=rs.getDate(4);
                Date ngayvaolam=rs.getDate(5);
                NhanVienDTO nv=new NhanVienDTO(manv, ho, ten, ngaysinh, ngayvaolam);
                result.add(nv);   
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            System.err.println("Lỗi select ALL");
        }
        return result;
    }
    
}
