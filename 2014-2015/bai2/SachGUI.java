// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;
// public class SachGUI extends JFrame{
//     private JTextField txfmasach,txftensach,txfresult,txfresult2;
//     private JButton btnThem,btnTim;
//     private SachBUS sBUS;
//     public SachGUI(){
//         setTitle("bai2");
//         setSize(400,200);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLocationRelativeTo(null);
//         setLayout(new GridLayout(4,2,10,10));
//         sBUS=new SachBUS();

//         add(new JLabel("mã sách"));
//         txfmasach=new JTextField();
//         add(txfmasach);

//         add(new JLabel("tên sách"));
//         txftensach=new JTextField();
//         add(txftensach);
//         btnThem=new JButton("Thêm sách");
//         txfresult=new JTextField();
//         btnTim=new JButton("Tim sach");
//         txfresult2=new JTextField();
//         add(btnThem);
//         add(txfresult);
//         add(btnTim);
//         add(txfresult2);

//         btnThem.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e){ 
//                 try{
//                     String tensach=txftensach.getText();
//                     String masach=txfmasach.getText();
//                     sachDTO snew= new sachDTO(masach,tensach);
//                     sBUS().themSach(snew);
//                     txfresult.setText("Đã thêm sách");
//                 }catch(Exception er){
//                     System.out.println("Looix");
//                 }
//             }            
//         });
//         btnTim.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e){
//                 try{
//                     String tensach=txftensach.getText();
//                     String result=sBUS().timsach(tensach);
//                     txfresult2.setText(result);
//                 }catch(Exception er){
//                     System.out.println("Looix");
//                 }
//             }            
//         });


//     }
// }
