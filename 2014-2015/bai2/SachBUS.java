// public class SachBUS {
//     private ArrayList<SachDTO> listSach;

//     public SachBUS() {
//         listSach = sachDAO.getInstance().selectAll();
//     }

//     public void themSach(SachDTO snew) {
//         for (SachDTO s : listSach) {
//             if (s.getMasach().equalsIgnoreCase(snew.getMasach())) {
//                 System.err.println("Sách đã tồn tại!");
//                 return;
//             }
//         }

//         boolean check = sachDAO.getInstance().Insert(snew) != 0;
//         if (check) {
//             listSach.add(snew);
//             System.out.println("Thêm sách thành công");
//         } else {
//             System.err.println("Thêm sách thất bại");
//         }
//     }
//     public String timsach(String tensach){
//         for(sachDTO s: listSach){
//             if(s.gettensach().equalsIgnoreCase(tensach)){
//                 return s.toString();
//             }
//         }
//         return "khong co";
//     }
// }
