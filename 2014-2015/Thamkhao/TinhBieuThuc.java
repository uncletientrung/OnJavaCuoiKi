import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TinhBieuThuc extends JFrame {

    private JTextField txtX, txtN, txtKetQua;
    private JButton btnTinh;

    public TinhBieuThuc() {
        setTitle("Tính giá trị biểu thức S(n)");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        // Các thành phần giao diện
        add(new JLabel("Nhập x:"));
        txtX = new JTextField();
        add(txtX);

        add(new JLabel("Nhập n:"));
        txtN = new JTextField();
        add(txtN);

        btnTinh = new JButton("Tính giá trị của biểu thức");
        add(btnTinh);

        txtKetQua = new JTextField();
        txtKetQua.setEditable(false);
        add(txtKetQua);

        // Sự kiện nút
        btnTinh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double x = Double.parseDouble(txtX.getText());
                    int n = Integer.parseInt(txtN.getText());
                    double result = calculateS(x, n);
                    txtKetQua.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số hợp lệ!");
                }
            }
        });
    }

    // Hàm tính giai thừa
    public static long factorial(int k) {
        long result = 1;
        for (int i = 1; i <= k; i++) {
            result *= i;
        }
        return result;
    }

    // Hàm tính biểu thức S(n)
    public static double calculateS(double x, int n) {
        double sum = 1.0;
        for (int i = 1; i <= n; i++) {
            int exponent = 2 * i;
            long fact = factorial(exponent);
            double term = Math.pow(-1, i) * Math.pow(x, exponent) / fact;
            sum += term;
        }
        return sum;
    }

    public static void main(String[] args) {
        new TinhBieuThuc().setVisible(true);
    }
}
