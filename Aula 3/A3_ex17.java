import javax.swing.JOptionPane;

public class A3_ex17 {

    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        double q = Math.pow(n,2);
        double r = Math.sqrt(n);

        System.out.print("O número digitado foi: "+n+"\nSeu quadrado é: "+q+"\nSua raíz quadrada é: "+r);
    }

}