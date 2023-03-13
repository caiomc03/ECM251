import javax.swing.JOptionPane;

public class A3_ex7 {
    public static void main(String[] args) {

        String numero = JOptionPane.showInputDialog("Digite um numero de 5 digitos: ");
        System.out.printf("O algarismo da cada das dezenas e: " + numero.charAt(3));
    }
}
