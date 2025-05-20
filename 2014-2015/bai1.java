import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class bai1 extends JFrame{
    private JTextField txfx,txfn,txfresult;
    private JButton btncalc;
    public bai1(){
        setTitle("Bai 1");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3,2,10,10));

        add(new Label("Nhập x"));
        txfx=new JTextField();
        add(txfx);

        add(new JLabel("Nhập n")); 
        txfn=new JTextField();
        add(txfn);

        btncalc=new JButton("Tính giá trị biểu thức");
        txfresult=new JTextField();
        add(btncalc);add(txfresult);

        btncalc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try{
                    int x=Integer.parseInt(txfx.getText());
                    int n=Integer.parseInt(txfn.getText());
                    double Sn=tinhSn(x, n);
                    txfresult.setText(Sn+"");
                }catch(Exception er){
                    JOptionPane.showMessageDialog(null, "Hãy nhập đầy đủ");
                }
            }
        });

    }
    public int tinhgiathua(int a){
        int result=1;
        for(int i=1;i<=a;i++){
            result*=i;
        }
        return result;
    }
    public double tinhSn(int x, int n){
        double result=1;
        for(int i=1;i<=n;i++){
            int giathua=tinhgiathua(2 *i);
            result+=(Math.pow(-1, i) * Math.pow(x, 2*i))/giathua;
        }
        return result;
    }
    public static void main(String[] args) {
        new bai1().setVisible(true);
    }
}   