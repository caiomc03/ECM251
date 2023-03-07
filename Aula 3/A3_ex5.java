import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A3_ex5 {

    public static void lerTxt(String nomeArquivo){
        try{
            File arquivo = new File(nomeArquivo);
            Scanner sc = new Scanner(arquivo);
            while(sc.hasNext()){
                System.out.print(sc.nextLine());
            }
            sc.close();

        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        lerTxt("A3_ex5.txt");

    }
}
