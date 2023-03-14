import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class A3_ex1 {

    public static void main (String args[]) {
        int d = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia em que você nasceu:"));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês em que você nasceu:"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano em que você nasceu:"));

        LocalDate nascimento = LocalDate.of(y, m, d);
        LocalDate hoje = LocalDate.now();

        Long dias = ChronoUnit.DAYS.between(nascimento, hoje);

        System.out.print("Se passaram "+dias+" desde o dia de seu nascimento!");

    }

}