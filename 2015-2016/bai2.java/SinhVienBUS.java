// import java.util.ArrayList;

// public class SinhVienBUS {
//     private ArrayList<SinhVienDTO> list_sv;
//     private SinhVienDAO svDAO=new SinhVienDAO();
//     public SinhVienBUS(){
//         list_sv=svDAO.SelectAll();
//     }
//     public Boolean CheckMaDuyNhat(int masv){
//         for(SinhVienDTO sv: list_sv){
//             if(sv.getMaSV() == masv){
//                 return true;
//             }
//         }
//         return false;
//     }
//     public Boolean ThemSinhVien(SinhVienDTO svnew){
//         Boolean check=CheckMaDuyNhat(svnew.getMaSV());
//         Boolean result;
//         if(check){
//             return false;
//         }else{
//             result=svDAO.Insert(svnew) !=0;
//         }
//         if(result){
//             list_sv.add(svnew);
//             return true;
//         }else{
//             System.out.println("Loi khong the them");
//             return false;
//         }
//     }
// }
