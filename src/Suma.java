import javax.swing.*;

public class Suma {
    public static void main(String[] args) {
        int numOne = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero 1: "));
        int numTwo = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero 2: "));
        JOptionPane.showMessageDialog(null, "La suma de " + numOne + " + " + numTwo + " = " + suma(numOne, numTwo));
        JOptionPane.showMessageDialog(null, "Muy bien, vas excelente");
    }

    public static int suma(int a, int b) {
        return a + b;
    }
}
