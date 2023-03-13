import javax.swing.JOptionPane;

public class A3_ex11 {
    public static void main(String args[]) {

        String primeira = JOptionPane.showInputDialog("Insira a primera frase: ");

        String segunda = JOptionPane.showInputDialog("Insira a segunda frase: ");
        String terceira = JOptionPane.showInputDialog("Insira a terceira frase: ");

        String embaralhado = segunda.substring(0, segunda.length() / 2) + terceira.substring(terceira.length() / 2)
                + segunda.substring(segunda.length() / 2) + primeira.substring(0, primeira.length() / 2)
                + terceira.substring(0, terceira.length() / 2) + primeira.substring(primeira.length() / 2);

        System.out.println(embaralhado);

    }
}