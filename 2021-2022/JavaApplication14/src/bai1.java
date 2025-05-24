/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author DELL
 */
public class bai1 extends JFrame{
    private JTextField txfn, txfx, txfresult;
    private JButton btnTinh;
    public bai1(){
        setTitle("Bai 1");
        setSize(500,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel topP=new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel cenP=new JPanel(new GridLayout(3,3,10,10));
        JPanel botP=new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        txfx=new JTextField();
        txfn=new JTextField();
        txfresult=new JTextField();
        btnTinh=new JButton("Tính");
        JButton btnClose=new JButton("Đóng");
        
        topP.add(new JLabel(" Tính giá trị biểu thức S"));
        cenP.add(new JLabel("Nhập n: "));
        cenP.add(txfn);
        cenP.add(new JLabel("Nhập x: "));
        cenP.add(txfx);
        cenP.add(new JLabel("Kết quả: "));
        cenP.add(txfresult);
        botP.add(btnTinh);
        botP.add(btnClose);
        add(topP,BorderLayout.NORTH);
        add(cenP,BorderLayout.CENTER);
        add(botP,BorderLayout.SOUTH);
        
        btnTinh.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    int n=Integer.parseInt(txfn.getText());
                    int x=Integer.parseInt(txfx.getText());
                    double result=TinhSn(n, x);
                    txfresult.setText(String.valueOf(result+""));
                }catch(Exception er){
                    JOptionPane.showMessageDialog(null, "Vui longf nhap day du thong tin");
                }
            }
        });
        btnClose.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
    }
    
    public double TinhSn(int n, int x){
        double result=0;
        for(double i=1; i<=n;i++){
            result+=i*Math.pow(x, i-1);
        }
        return result;
    }
    public static void main(String[] args) {
        new bai1().setVisible(true);
    }
}
