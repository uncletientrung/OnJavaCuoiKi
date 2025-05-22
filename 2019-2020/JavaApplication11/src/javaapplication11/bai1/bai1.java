/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11.bai1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class bai1 extends JFrame{
    private JTextField txfx, txfn, txfresult;
    private JButton btncalc,btnreset;
    public bai1(){
        setTitle("Bài 1");
        setSize(400,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,2,10,10));
        
        add(new JLabel("Nhập x:"));
        txfx=new JTextField();
        add(txfx);
        add(new JLabel("Nhập n:"));
        txfn=new JTextField();
        add(txfn);
        add(new JLabel("Kết quả"));
        txfresult=new JTextField();
        add(txfresult);
        
        btncalc=new JButton("Tính");
        btnreset=new JButton("Reset");
        add(btncalc);add(btnreset);
        
        btncalc.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    int x=Integer.parseInt(txfx.getText());
                    int n=Integer.parseInt(txfn.getText());
                    double result=TinhSn(x,n);
                    txfresult.setText(String.valueOf(result));
                } catch (Exception er) {
                    er.printStackTrace();
                }
            }
        });
        btnreset.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txfn.setText("");
                txfresult.setText("");
                txfx.setText("");
            }
        });
        
    }
    public double TinhSn(int x,int n){
        double result=0;
        for(double i=0; i<=n;i++){
            result+=(i+1)*Math.pow(x, i);
        }
        return result;
    }
    
    
    public static void main(String[] args){
        new bai1().setVisible(true);
    }
}
