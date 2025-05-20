import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorInterface extends JFrame {
    private JTextField xField, nField, resultField;
    private JLabel formulaLabel;
    private JButton tinhButton;

    public CalculatorInterface() {
        // Cài đặt frame
        setTitle("Tính Toán");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(300, 200);

        // Tạo panel cho công thức
        JPanel formulaPanel = new JPanel();
        formulaLabel = new JLabel("Biểu thức s(x) = x - x³/3! + x⁵/5! - x⁷/7! + ...");
        formulaLabel.setHorizontalAlignment(SwingConstants.CENTER);
        formulaPanel.add(formulaLabel);

        // Tạo panel cho các ô nhập liệu
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2, 10, 10));

        inputPanel.add(new JLabel("Nhập x:"));
        xField = new JTextField();
        inputPanel.add(xField);

        inputPanel.add(new JLabel("Nhập n:"));
        nField = new JTextField();
        inputPanel.add(nField);

        inputPanel.add(new JLabel("Kết quả:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        inputPanel.add(resultField);

        // Tạo panel cho nút
        JPanel buttonPanel = new JPanel();
         tinhButton = new JButton("Tính");
        JButton thoatButton = new JButton("Thoát");
        buttonPanel.add(tinhButton);
        buttonPanel.add(thoatButton);

        // Thêm các panel vào frame
        add(formulaPanel, BorderLayout.NORTH);
        add(inputPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        tinhButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e){
            int x=Integer.parseInt(xField.getText());
            int n=Integer.parseInt(nField.getText());
            double result=tinhSn(x, n);
            resultField.setText(result+"");
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
      double result=x;
      for(int i=1;i<=n;i++){
         int giaithua=tinhgiathua((2*i)+1);
         result+=Math.pow(-1,i)*Math.pow(x, (2*i)+1)/giaithua;
      }
      return result;
   }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorInterface calc = new CalculatorInterface();
            calc.setVisible(true);
        });
    }
}