
// import java.sql.Connection;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.util.ArrayList;
// import javax.swing.JOptionPane;

// public class sachDAO {
    
//     public static sachDAO getInstance(){
//         return new sachDAO;
//     }
//     public ArrayList<SachDTO> selectAll(){
//         ArrayList<SachDTO> result=new ArrayList<>();
//         try{
//             Connection con= Mysqlconnect.getConnection();
//             String sql= ("Select * From sach");
//             PreparedStatement pst= con.prepareStatement(sql);
//             ResultSet rs=pst.executeQuery();
//             while (rs.next()) {
//                 String masach=rs.getString(1);
//                 String tensach=rs.getString(2);
//                 sachDTO snew= new sachDTO(masach,tensach);
//                 result.add(snew);
//             }
//             Mysqlconnect.closeConnection();
//         }catch(Exception e){
//             JOptionPane.showMessageDialog(null,"Looi");
//         }
//         return result;
//     }
//     public int Insert(sachDTO snew){
//         int result=0;
//         try{
//             Connection con= Mysqlconnect.getConnection();
//             String sql= ("Insert into sach(masach, tensach) values ( ? , ? )");
//             PreparedStatement pst= con.prepareStatement(sql);
//             pst.setString(1, snew.getMasach());
//             pst.setString(2, snew.gettensach());
//             result = pst.executeUpdate();
//             Mysqlconnect.closeConnection();
//         }catch(Exception e){
//             JOptionPane.showMessageDialog(null,"Looi");
//         }
//         return result;

//     }


// }
