import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bai1 extends JFrame{
    private JTextField txfn, txfresult;
    private JButton btncalc;
    public bai1(){
        setTitle("Bai 1");
        setSize(400,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10,10));
        
        JPanel pCenter=new JPanel(new GridLayout(2,2,10,10));
        pCenter.add(new JLabel("Nhập n: "));
        txfn=new JTextField();
        pCenter.add(txfn);

        pCenter.add(new JLabel("Kết quả: "));
        txfresult=new JTextField();
        pCenter.add(txfresult);

        JPanel footLayout=new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        btncalc=new JButton("Tính");
        footLayout.add(btncalc);
        add(footLayout,BorderLayout.SOUTH);
        add(pCenter,BorderLayout.CENTER);

        btncalc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try {
                    int n=Integer.parseInt(txfn.getText());
                    double result=tinhSn(n);
                    txfresult.setText(String.valueOf(result));
                } catch (Exception er) {
                    JOptionPane.showMessageDialog(null, "Vui long nhap du thong tin");
                }
            }
        });
    }
    public double tinhSn(int n){
        double result=0;
        for(double i=1; i<=n;i++){
            result+=1/(i*(i+1));
        }
        return result;
    }

    public static void main(String[] args) {
        new bai1().setVisible(true);
    }
}
