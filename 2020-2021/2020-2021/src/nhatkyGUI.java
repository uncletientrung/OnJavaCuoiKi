/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author DELL
 */
public class nhatkyGUI extends JFrame{
    private JTextField txfid,txfdate,txfmucchi,txfsotien,txfghichu,txfresult;
    private JButton btnThem, btnTinh;
    public nhatkyGUI(){
        setTitle("bai2");
        setSize(600,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7,2,10,10));
        
        add(new JLabel("Nhập id:"));
        txfid=new JTextField();
        add(txfid);
        
        add(new JLabel("Nhập ngày (yyyy-MM-dd)"));
         txfdate=new JTextField();
        add(txfdate);
        
        add(new JLabel("Nhập mức chi:"));
         txfmucchi=new JTextField();
        add(txfmucchi);
        
        add(new JLabel("Nhập số tiến:"));
         txfsotien=new JTextField();
        add(txfsotien);
        
        add(new JLabel("Nhập ghi chú:"));
         txfghichu=new JTextField();
        add(txfghichu);
        
        add(new JLabel("Kết quả:"));
         txfresult=new JTextField();
        add(txfresult);
        
         btnThem=new JButton("Thêm");
         btnTinh=new JButton("Tính");
         add(btnThem);
         add(btnTinh);
        
        btnThem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    nhatkyBUS nkBUS=new nhatkyBUS();
                    int id=Integer.parseInt(txfid.getText());
                    SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
                    Date ngay=format.parse(txfdate.getText());
                    String muchi=txfmucchi.getText();
                    int sotien=Integer.parseInt(txfsotien.getText());
                    String ghichu=txfghichu.getText();
                    nhatkyDTO nknew= new nhatkyDTO(id,ngay,muchi,sotien,ghichu);
                    Boolean result=nkBUS.Them(nknew);
                    if(result){
                        txfresult.setText("Thêm thành công");
                    }else{
                       txfresult.setText("Sách đã tồn tại"); 
                    }
                }catch(Exception er){
                    JOptionPane.showMessageDialog(null,"Vui long nhap du thong tin");
                }
            }
        });
        
        btnTinh.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                nhatkyBUS nkBUS=new nhatkyBUS();
                double result= nkBUS.tongtien();
                txfresult.setText(result+""); 
            }
        });
    }
    public static void main(String[] args){
        new nhatkyGUI().setVisible(true);
    }
}
