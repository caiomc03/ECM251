import javax.swing.JOptionPane;

public class A3_ex6{

    public static double calc_juros(double valor_inicial, double juros, double meses){
        double valor_final = valor_inicial*Math.pow((1+(juros/100)), meses);
        return (valor_final);
    }

    public static void main (String[] args){
        double valor_inicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor incial em reais: "));
        double juros = Double.parseDouble(JOptionPane.showInputDialog("Digite a taxa de juros mensais em %: "));
        double meses = Double.parseDouble(JOptionPane.showInputDialog("Digite o periodo em meses: "));

        double divida =calc_juros(valor_inicial, juros, meses);

        
        System.out.printf("Você deve %.2f reais",divida);
    }
}