import javax.swing.JOptionPane;
public class 2_2_6_EquationSolver {
    public static void main(String[] args) {
        String[] options = {"Phương trình bậc nhất một ẩn", "Hệ phương trình bậc nhất hai ẩn", "Phương trình bậc hai một ẩn"};
        int choice = JOptionPane.showOptionDialog(null, "Chọn loại phương trình cần giải:", "Giải phương trình",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if (choice == 0) {
            String inputA = JOptionPane.showInputDialog("Nhập hệ số a:");
            double a = Double.parseDouble(inputA);
            String inputB = JOptionPane.showInputDialog("Nhập hệ số b:");
            double b = Double.parseDouble(inputB);
            if (a == 0) {
                if (b == 0) {
                    JOptionPane.showMessageDialog(null, "Phương trình có vô số nghiệm.");
                } else {
                    JOptionPane.showMessageDialog(null, "Phương trình vô nghiệm.");
                }
            } else {
                double x = -b / a;
                JOptionPane.showMessageDialog(null, "Nghiệm của phương trình: x = " + x);
            }
        } else if (choice == 1) {
            String inputA11 = JOptionPane.showInputDialog("Nhập hệ số a11:");
            double a11 = Double.parseDouble(inputA11);
            String inputA12 = JOptionPane.showInputDialog("Nhập hệ số a12:");
            double a12 = Double.parseDouble(inputA12);
            String inputB1 = JOptionPane.showInputDialog("Nhập hệ số b1:");
            double b1 = Double.parseDouble(inputB1);
            String inputA21 = JOptionPane.showInputDialog("Nhập hệ số a21:");
            double a21 = Double.parseDouble(inputA21);
            String inputA22 = JOptionPane.showInputDialog("Nhập hệ số a22:");
            double a22 = Double.parseDouble(inputA22);
            String inputB2 = JOptionPane.showInputDialog("Nhập hệ số b2:");
            double b2 = Double.parseDouble(inputB2);
            double D = a11 * a22 - a21 * a12;
            double D1 = b1 * a22 - b2 * a12;
            double D2 = a11 * b2 - a21 * b1;
            if (D == 0) {
                if (D1 == 0 && D2 == 0) {
                    JOptionPane.showMessageDialog(null, "Hệ phương trình có vô số nghiệm.");
                } else {
                    JOptionPane.showMessageDialog(null, "Hệ phương trình vô nghiệm.");
                }
            } else {
                double x1 = D1 / D;
                double x2 = D2 / D;
                JOptionPane.showMessageDialog(null, "Nghiệm của hệ phương trình: x1 = " + x1 + ", x2 = " + x2);
            }
        } else if (choice == 2) {
            String inputA = JOptionPane.showInputDialog("Nhập hệ số a:");
            double a = Double.parseDouble(inputA);
            String inputB = JOptionPane.showInputDialog("Nhập hệ số b:");
            double b = Double.parseDouble(inputB);
            String inputC = JOptionPane.showInputDialog("Nhập hệ số c:");
            double c = Double.parseDouble(inputC);
            if (a == 0) {
                if (b == 0) {
                    if (c == 0) {
                        JOptionPane.showMessageDialog(null, "Phương trình có vô số nghiệm.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Phương trình vô nghiệm.");
                    }
                } else {
                    double x = -c / b;
                    JOptionPane.showMessageDialog(null, "Nghiệm của phương trình: x = " + x);
                }
            } else {
                double discriminant = b * b - 4 * a * c;
                if (discriminant > 0) {
                    double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                    double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                    JOptionPane.showMessageDialog(null, "Phương trình có hai nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2);
                } else if (discriminant == 0) {
                    double x = -b / (2 * a);
                    JOptionPane.showMessageDialog(null, "Phương trình có nghiệm kép: x = " + x);
                } else {
                    JOptionPane.showMessageDialog(null, "Phương trình vô nghiệm.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lựa chọn không hợp lệ.");
        }
    }
}