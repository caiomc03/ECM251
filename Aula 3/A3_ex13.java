import javax.swing.JOptionPane;

public class A3_ex13 {

    public static void main(String[] args) {

        String data = JOptionPane.showInputDialog("Digite uma data no formato dd/mm/aa: ");
        String[] partes = data.split("/");

        String dia = partes[0];
        String mes = partes[1];
        String ano = partes[2];

        if (Integer.parseInt(ano) > 23) {
            ano = ("19"+ano);
        }
        else {
            ano = ("20"+ano);
        }

        System.out.println("Dia: " + dia);
        System.out.println("Mês: " + mes);
        System.out.println("Ano: " + ano);
    }
}