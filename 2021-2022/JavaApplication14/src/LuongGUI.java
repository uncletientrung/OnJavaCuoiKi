/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author DELL
 */
public class LuongGUI extends  JFrame{
    private JTextField txfmanv, txfthang, txfnam,txfngay,txfcongngay,txfluong,txfresult;
    private JButton btnSua,btnFind;
    private DefaultTableModel dataLuong;
    LuongBUS lBUS=new LuongBUS();
    public LuongGUI(){
        setTitle("Bai 2");
        setSize(900,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,2,10,10));
        JPanel cenP= new JPanel(new GridLayout(7,2,10,10));
        JPanel TongP= new JPanel(new BorderLayout());
        txfmanv=new JTextField();
        txfnam=new JTextField();
        txfthang=new JTextField();
        txfngay=new JTextField();
        txfcongngay=new JTextField();
        txfluong=new JTextField();
        txfresult=new JTextField();
        btnSua=new JButton("Hiệu chỉnh");
        btnFind=new JButton("Tìm");
        String[] column={"mã nv","năm","tháng","số ngày làm","công theo ngày","lương"};
        dataLuong=new DefaultTableModel(column,0);
        JTable table=new JTable(dataLuong);
        ArrayList<LuongDTO> list_l=lBUS.getListLuong();
        for(LuongDTO luong: list_l){
            int manv=luong.getManv();
            int nam=luong.getNam();
            int thang=luong.getThang();
            int songay=luong.getSongaylv();
            int congngay=luong.getSongaylv();
            int luongn=luong.getLuong();
            dataLuong.addRow(new Object[]{manv, nam, thang, songay, congngay, luongn});
        }
        JScrollPane sp=new JScrollPane(table);
        cenP.add(new Label("Nhập mã nv:"));
        cenP.add(txfmanv);
        cenP.add(new Label("Nhập năm:"));
        cenP.add(txfnam);
        cenP.add(new Label("Nhập tháng:"));
        cenP.add(txfthang);
        cenP.add(new Label("Nhập ngày:"));
        cenP.add(txfngay);
        cenP.add(new Label("Nhập công 1 ngày:"));
        cenP.add(txfcongngay);
        cenP.add(new Label("Nhập lương:"));
        cenP.add(txfluong);
        cenP.add(new Label("Kết quả:"));
        cenP.add(txfresult);
        TongP.add(cenP,BorderLayout.CENTER);
        JPanel btnP=new JPanel(new FlowLayout());
        btnP.add(btnSua);btnP.add(btnFind);
        TongP.add(cenP,BorderLayout.CENTER);
        TongP.add(btnP,BorderLayout.SOUTH);
        add(sp);
        add(TongP);
        
        btnSua.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                try{
                     lBUS=new LuongBUS();
                    int manv=Integer.parseInt(txfmanv.getText());
                    int nam=Integer.parseInt(txfnam.getText());
                    int thang=Integer.parseInt(txfthang.getText());
                    int songay=Integer.parseInt(txfngay.getText());
                    int congngay=Integer.parseInt(txfcongngay.getText());
                    int luongn=Integer.parseInt(txfluong.getText());
                    LuongDTO luong1=new LuongDTO(manv, nam, thang,songay,congngay,luongn);
                    boolean check=lBUS.Sua(luong1);
                    if (check) {
                        txfresult.setText("Sửa thành công");
                        lBUS=new LuongBUS();
                        ArrayList<LuongDTO> list=lBUS.getListLuong();
                        dataLuong.setRowCount(0);
                         for(LuongDTO luong: list){
                           int manva=luong.getManv();
                           int nama=luong.getNam();
                           int thanga=luong.getThang();
                           int songaya=luong.getSongaylv();
                           int congngaya=luong.getSongaylv();
                           int luongna=luong.getLuong();
                           dataLuong.addRow(new Object[]{manva, nama, thanga, songaya, congngaya, luongna});
                           }
                    }else{
                        txfresult.setText("mã nhân viên không tồn tại");
                    }
                }catch(Exception er){
                    JOptionPane.showMessageDialog(null, "Vui long nhap day du thong tin");
                }
            }
        });
        btnFind.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                try{
                    int nam=Integer.parseInt(txfnam.getText());
                    int thang=Integer.parseInt(txfthang.getText());
                    LocalDate current_date=LocalDate.now();
                    if (nam>current_date.getYear() || nam <=0|| thang<=0|| thang>12) {
                        JOptionPane.showMessageDialog(null, "Loi sai thong tin");
                        return;
                    }
                    FindTable(nam, thang);
                }catch(Exception er){
                    JOptionPane.showMessageDialog(null, "Vui long nhap day du thong tin");
                }
            }
        });
 
    }
        public void FindTable(int nam, int thang){
             lBUS=new LuongBUS();
             ArrayList<LuongDTO> list=lBUS.Find(nam, thang);
             dataLuong.setRowCount(0);
              for(LuongDTO luong: list){
                int manv=luong.getManv();
                int nama=luong.getNam();
                int thanga=luong.getThang();
                int songay=luong.getSongaylv();
                int congngay=luong.getSongaylv();
                int luongn=luong.getLuong();
                dataLuong.addRow(new Object[]{manv, nama, thanga, songay, congngay, luongn});
                }
             
        }
        
        public static void main(String[] args) {
        new LuongGUI().setVisible(true);
    }
    
    
}
