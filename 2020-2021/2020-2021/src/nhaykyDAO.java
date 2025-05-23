


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author DELL
 */
public class nhaykyDAO {
    public int Insert(nhatkyDTO nk){
        int result=0;
        try {
            Connection con=JDBCUtil.getConnection();
            String sql=" Insert into nhatkychi( id, ngay, muchi, sotien, ghichu) values (?, ?, ?, ?, ?) ";
            PreparedStatement pst= con.prepareStatement(sql);
            pst.setInt(1, nk.getId());
            pst.setDate(2, new java.sql.Date(nk.getNgay().getTime()));
            pst.setString(3, nk.getMucchi());
            pst.setInt(4, nk.getSotien());
            pst.setString(5, nk.getGhichu());
            result=pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public ArrayList<nhatkyDTO> selectAll(){
         ArrayList<nhatkyDTO> list_nk=new ArrayList<>();
         try{
             Connection con=JDBCUtil.getConnection();
             String sql="Select * From nhatkychi";
             PreparedStatement pst=con.prepareStatement(sql);
             ResultSet rs=pst.executeQuery();
             while (rs.next()) {
                 int id=rs.getInt(1);
                 Date ngay=rs.getDate(2);
                 String muchi=rs.getString(3);
                 int sotien=rs.getInt(4);
                 String ghichu=rs.getString(5);
                 nhatkyDTO nk= new nhatkyDTO(id, ngay, muchi, sotien, ghichu);
                 list_nk.add(nk);
             }
             JDBCUtil.closeConnection(con);
         }catch (Exception e) {
            e.printStackTrace();
        }
         return list_nk;
    }
}
