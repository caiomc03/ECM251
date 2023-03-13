import javax.swing.JOptionPane;

public class A3_ex10 {
    public static void main(String args[]){
        double num = Double.parseDouble(JOptionPane.showInputDialog("Insira um numero: "));
        double base = Double.parseDouble(JOptionPane.showInputDialog("Insira a base do logaritimo: "));

        if (num<0){
            System.out.print("Esse logaritimo não pode ser resolvido, insira um numero positivo");
        }

        else{System.out.printf("O logatimo de %.2f na base %.2f é %.2f",num,base,Math.log(num)/Math.log(base));}

       
    }
}