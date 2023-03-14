import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A3_ex5 {
 
    public static String lerTxt(String nomeArquivo, String lista[]){
        
        int i =0;
        try{
            File arquivo = new File(nomeArquivo);
            Scanner sc = new Scanner(arquivo);
            while(sc.hasNext()){
                lista[i] = sc.nextLine();
                i++;
            }
            sc.close();
            
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

        return ("1");

    }
    public static void main(String[] args){
        final String[] lista = new String[10];
        lerTxt("A3_ex5.txt",lista);
        int i =0;
        while(i<10){
            System.out.println(lista[i]);
            i++;
        }

    }
}
