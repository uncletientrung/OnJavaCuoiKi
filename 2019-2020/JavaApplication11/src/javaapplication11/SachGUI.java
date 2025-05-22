/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class SachGUI extends JFrame{
    private JTextField txfMaSach, txfTenSach, txfSoLuong, txfDonGia;
    private JButton btnThem, btnReset;
    private DefaultTableModel dataBook;
    private SachBUS sBUS=new SachBUS();
    private ArrayList<SachDTO> list_sach;
    public SachGUI(){
        setTitle("Bai2");
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2,1,10,10));
        JPanel botP=new JPanel(new GridLayout(5,2,10,10));
        String[] column={"Mã sách","Tên sách","Số lượng","Đơn giá"};
        dataBook=new DefaultTableModel(column,0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Chặn chỉnh sửa tất cả các ô
            }
        };
        JTable table=new JTable(dataBook);
        list_sach=sBUS.getListSach();
        for(SachDTO sach: list_sach){
            int masach=sach.getMasach();
            String tenSach=sach.getTensach();
            int soluong=sach.getSoluong();
            int dongia=sach.getDongia();
            dataBook.addRow(new Object[]{masach,tenSach,soluong,dongia});
        }
        JScrollPane scrollPane = new JScrollPane(table);
        
        add(scrollPane);
        botP.add(new JLabel("Nhập mã sách:"));
        txfMaSach=new JTextField();
        botP.add(txfMaSach);
        botP.add(new JLabel("Nhập tên sách:"));
        txfTenSach=new JTextField();
        botP.add(txfTenSach);
        botP.add(new JLabel("Nhập số lượng:"));
        txfSoLuong=new JTextField();
        botP.add(txfSoLuong);
        botP.add(new JLabel("Nhập đơn giá:"));
        txfDonGia=new JTextField();
        botP.add(txfDonGia);
        btnThem =new JButton("Thêm");
        btnReset=new JButton("Reset");
        botP.add(btnThem);
        botP.add(btnReset);
        add(botP);
        
        btnThem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    sBUS=new SachBUS();
                    int masach=Integer.parseInt(txfMaSach.getText());
                    String tensach=txfTenSach.getText();
                    int soluong=Integer.parseInt(txfSoLuong.getText());
                    int dongia=Integer.parseInt(txfDonGia.getText());
                    SachDTO s=new SachDTO(masach,tensach,soluong,dongia);
                    Boolean result=sBUS.themSach(s);
                    if(result){
                        dataBook.addRow(new Object[]{masach,tensach,soluong,dongia});
                    }else{
                        JOptionPane.showMessageDialog(null, "Sach da ton tai");
                    }
                } catch (Exception er) {
                    JOptionPane.showMessageDialog(null, "Vui long nhap du thong tin");
                }
            }
        });
        btnReset.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txfMaSach.setText("");
                txfTenSach.setText("");
                txfSoLuong.setText("");
                txfDonGia.setText("");
            }
        });
        
        
    }
    public static void main(String[] args){
        new SachGUI().setVisible(true);
    } 
}
