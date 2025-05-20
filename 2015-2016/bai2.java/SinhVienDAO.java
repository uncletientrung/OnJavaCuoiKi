// import java.sql.Connection;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.util.ArrayList;

// import SinhVienDTO;

// public class SinhVienDAO {
//     public ArrayList<SinhVienDTO> SelectAll(){
//         ArrayList<SinhVienDTO> result=new ArrayList<>();
//         try {
//             Connection con= mySQL.getConnection();
//             String sql="Select * from sinhvien";
//             PreparedStatement pst=con.prepareStatement(sql);
//             ResultSet rs=pst.executeQuery();
//             while (rs.next()) {
//                 int masv=rs.getInt(1);
//                 String hosv=rs.getString(2);
//                 String tensv=rs.getString(3);
//                 String ngaysinh=rs.getString(4);
//                 String gioitinh=rs.getString(5);
//                 SinhVienDTO sv=new SinhVienDTO(masv,hosv,tensv,ngaysinh,gioitinh);
//                 result.add(sv);
//             }
//             mySQL.getCloseConnection();
//         } catch (Exception e) {
//             System.out.println("Loi");
//         }
//         return result;
//     }
//     public int Insert(SinhVienDTO svnew){
//         int result=0;
//         try {
//             Connection con=mySQL.getConnection();
//             String sql="Insert into sinhvien(masv,ho,ten,ngaysinh,gioitinh) values (?,?,?,?,?)";
//             PreparedStatement pst=con.prepareStatement(sql);
//             pst.setInt(1, svnew.getMaSV());
//             pst.setString(2,svnew.getHo());
//             pst.setString(3,svnew.getTen());
//             pst.setString(4,svnew.getNgaySinh());
//             pst.setString(5,svnew.getGioiTinh());
//             result=pst.executeUpdate();
//             mySQL.getCloseConnection();
//         } catch (Exception e) {
//             System.out.println("Loi");
//         }
//         return result;
//     }
// }
