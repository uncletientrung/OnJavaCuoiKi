/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class bai1 extends JFrame{
    private JTextField txfn, txfx, txfresult;
    private JButton btncalc;
    public bai1(){
        setTitle("Bai1");
        setSize(400,200);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10,10));
        JPanel topP=new JPanel(new FlowLayout());
        JPanel botP=new JPanel(new GridLayout(3,2,10,10));
        JPanel footP=new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        topP.add(new JLabel("Tính biểu thức S"));
        botP.add(new JLabel("Nhập n:"));
        txfn=new JTextField();
        botP.add(txfn);
        botP.add(new JLabel("Nhập x:"));
        txfx=new JTextField();
        botP.add(txfx);
        botP.add(new JLabel("Kết quả:"));
        txfresult=new JTextField();
        botP.add(txfresult);
        btncalc=new JButton("Tính");
        JButton btnclose=new JButton("Đóng");
        footP.add(btncalc);
        footP.add(btnclose);
        
        add(topP,BorderLayout.NORTH);
        add(botP,BorderLayout.CENTER);
        add(footP,BorderLayout.SOUTH);
        
        btncalc.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    double n=Double.parseDouble(txfn.getText());
                    double x=Double.parseDouble(txfx.getText());
                    double result=tinhSn(n,x);
                    txfresult.setText(String.valueOf(result));
                }catch(Exception er){
                    JOptionPane.showMessageDialog(null, "Vui long nhap du thong tin");
                }
            }
        });
        
        
    }
    public double tinhSn(double n, double x){
        double result=0;
        for(double i=0; i<=n;i++){
            result+=Math.pow(x, i);
        }
        return  result;
    }
    public static void main(String[] args) {
        new bai1().setVisible(true);
    }
}
























