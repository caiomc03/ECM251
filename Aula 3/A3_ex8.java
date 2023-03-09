import javax.swing.JOptionPane;

public class A3_ex8 {
    public static void main (String[] args){
    double deg = Double.parseDouble(JOptionPane.showInputDialog("Digite um angulo em graus"));
    double rad = Math.toRadians(deg);

    double ang = Math.sin(rad);
    System.out.printf("sen = %.2f \n",ang);

    ang = Math.cos(rad);
    System.out.printf("cos = %.2f \n",ang);

    ang = Math.tan(rad);
    System.out.printf("tan = %.2f \n",ang);

    ang = Math.cos(rad);
    System.out.printf("sec = %.2f \n",1/ang);

    ang = Math.sin(rad);
    System.out.printf("cossec = %.2f \n",1/ang);

    ang = Math.tan(rad);
    System.out.printf("cotan = %.2f",1/ang);

    }
}
