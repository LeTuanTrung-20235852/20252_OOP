import javax.swing.JOptionPane;
public class 2_2_5_ArithmeticOperationsDialog {
    public static void main(String[] args) {
        String strNum1 = JOptionPane.showInputDialog("Nhập số thứ nhất:");
        double num1 = Double.parseDouble(strNum1);
        String strNum2 = JOptionPane.showInputDialog("Nhập số thứ hai:");
        double num2 = Double.parseDouble(strNum2);
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        String quotientMessage;
        if (num2 != 0) {
            double quotient = num1 / num2;
            quotientMessage = "Thương: " + quotient;
        } else {
            quotientMessage = "Thương: Không thể chia cho 0.";
        }
        String message = "Tổng: " + sum + "\n"
                       + "Hiệu: " + difference + "\n"
                       + "Tích: " + product + "\n"
                       + quotientMessage;
        JOptionPane.showMessageDialog(null, message);
    }
}