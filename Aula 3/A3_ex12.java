import javax.swing.JOptionPane;

public class A3_ex12 {

    public static void main(String atgs[]) {
        int date = Integer.parseInt(JOptionPane.showInputDialog("Insira uma data no formato ddmmaa"));
        String stringdate = Integer.toString(date);
        System.out.println(
                stringdate.substring(0, 2) + "/" + stringdate.substring(2, 4) + "/" + stringdate.substring(4, 6));
    }
}