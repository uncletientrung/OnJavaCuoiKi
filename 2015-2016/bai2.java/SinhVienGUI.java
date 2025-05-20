// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class SinhVienGUI extends JFrame{
//     private JTextField txfMaSv,txfHo,txfTen,txfNs,txfSex,txfResult;
//     private JButton btnThem, btnClose;
//     private SinhVienBUS svBUS=new SinhVienBUS();
//     public SinhVienGUI(){
//         setTitle("Bai2");
//         setSize(600,200);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLocationRelativeTo(null);
//         setLayout(new GridLayout(7, 2,10,10));
//         txfMaSv=new JTextField();
//         txfHo=new JTextField();
//         txfTen=new JTextField();
//         txfNs=new JTextField();
//         txfSex=new JTextField();
//         txfResult=new JTextField();
//         txfResult.setEditable(false);
//         add(new JLabel("Nhập mã SV:"));add(txfMaSv);
//         add(new JLabel("Nhập họ:"));add(txfHo);
//         add(new JLabel("Nhập tên"));add(txfTen);
//         add(new JLabel("Nhập ngày sinh"));add(txfNs);
//         add(new JLabel("Nhập giới tính"));add(txfSex);
//         add(new JLabel("Kết quả"));add(txfResult);
//         btnThem=new JButton("Thêm SV");
//         btnClose=new JButton("Đóng");
//         add(btnThem);add(btnClose);
//         btnClose.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e){
//                 System.exit(0);
//             }            
//         });
//         btnThem.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e){
//                 try{
//                     int maSv=Integer.parseInt(txfMaSv.getText());
//                     String ho=txfHo.getText();
//                     String ten=txfTen.getText();
//                     String Ns=txfNs.getText();
//                     String sex=txfSex.getText();
//                     SinhVienDTO svnew=new SinhVienDTO(maSv,ho,ten,Ns,sex);
//                     Boolean result=svBUS.ThemSinhVien(svnew);
//                     txfResult.setText(result+"");
//                 }catch(Exception er){
//                     JOptionPane.showMessageDialog(null, "Vui lòng nhập đủ thông tin");
//                 }
//             }
//         });
//     }
//     public static void main(String[] args){
//         new SinhVienGUI().setVisible(true);
//     }
// }
