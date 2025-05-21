/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author DELL
 */
public class NhanVienGUI extends JFrame{
    private JTextField txfma, txfho, txften, txfns,txfnvl,txfresult;
    private JButton btnsua, btnxoa;
    private NhanVienDAO nvDAO;

    public NhanVienGUI(){
        setTitle("NhanVienGUI");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(7,2,10,10));
        add(new JLabel("Nhập mã nv:"));
        txfma=new JTextField();
        add(txfma);
        
        add(new JLabel("Nhập họ:"));
        txfho=new JTextField();
        add(txfho);
        
        add(new JLabel("Nhập tên:"));
        txften=new JTextField();
        add(txften);
        
        add(new JLabel("Nhập ngày sinh:"));
        txfns=new JTextField();
        add(txfns);
        
        add(new JLabel("Nhập ngày vào làm:"));
        txfnvl=new JTextField();
        add(txfnvl);
        
        add(new JLabel("Kết quả:"));
        txfresult=new JTextField();
        add(txfresult);
        btnsua=new JButton("Sửa");
        btnxoa=new JButton("Xóa");
        add(btnsua);add(btnxoa);

        btnsua.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    NhanVienBUS nvBUS=new NhanVienBUS();
                    int manv=Integer.parseInt(txfma.getText());
                    String ho=txfho.getText();
                    String ten=txften.getText();
                    SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
                    Date dateNS=format.parse(txfns.getText());
                    String textdateNVL=txfnvl.getText();
                    Date dateNVL=format.parse(textdateNVL);
                    NhanVienDTO nvUpdate=new NhanVienDTO(manv,ho,ten,dateNS,dateNVL);
                    boolean result= nvBUS.SuaBUS(nvUpdate);
                    String text_result=result ? "Sửa thành công" : "Sửa thất bại";
                    txfresult.setText(text_result);
           
                }catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "Mã nhân viên phải là số nguyên!");
                } catch (ParseException pe) {
                    JOptionPane.showMessageDialog(null, "Ngày nhập sai định dạng (đúng: yyyy-MM-dd)!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ và đúng thông tin!");
                    ex.printStackTrace(); // In lỗi ra console để dễ debug
                }
            }
        });
        btnxoa.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    NhanVienBUS nvBUS=new NhanVienBUS();
                    int manv=Integer.parseInt(txfma.getText());
                    Boolean result=nvBUS.XoaBUS(manv);
                    String text_result=result ? "Xóa thành công" : "Xóa thất bại";
                    txfresult.setText(text_result);
                } catch (Exception er) {
                    JOptionPane.showMessageDialog(null,"Vui long nhap day du thong tin");
                }
            }
        });
               
    }
    public static void main(String[] args){
        new NhanVienGUI().setVisible(true);
    }
            
}
