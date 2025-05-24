/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author DELL
 */
public class LUONGDAO {
    public int Update(LuongDTO l){
        int result=0;
        try{
            Connection conn= JDBCUtil.getConnection();
            String sql="Update luong Set nam= ?, thang=? ,  songaylv= ?, tiencongngay= ? , tienluong = ? Where manv = ? ";
            PreparedStatement pst= conn.prepareStatement(sql);
            pst.setInt(1, l.getNam()); 
            pst.setInt(2, l.getThang());
            pst.setInt(3, l.getSongaylv());
            pst.setInt(4, l.getTienconngay());
            pst.setInt(5, l.getLuong());
            pst.setInt(6, l.getManv());
            result=pst.executeUpdate();
            System.err.println(result);
            JDBCUtil.closeConnection(conn);
        }catch(Exception er){
            er.printStackTrace();
        }
        return result;
    }
    public ArrayList<LuongDTO> SelectAll(){
        ArrayList<LuongDTO> result= new ArrayList<>();
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql="Select * From luong";
            PreparedStatement pst= conn.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            while (rs.next()) {
                int manv=rs.getInt("manv");
                int nam=rs.getInt("nam");
                int thang=rs.getInt("thang");
                int songaylv=rs.getInt("songaylv");
                int tiencongngay=rs.getInt("tiencongngay");
                int luong=rs.getInt("tienluong");
                LuongDTO l= new LuongDTO(manv, nam, thang, songaylv, tiencongngay, luong);
                result.add(l);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}















    