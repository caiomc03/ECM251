import javax.swing.JOptionPane;

public class A3_ex1 { 
    public static void main(String args []){
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));

        int dias = idade*365;

        System.out.println(dias);
    }
}