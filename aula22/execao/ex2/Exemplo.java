package aula22.execao.ex2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exemplo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;
        boolean valido;
        do{
            try {
                System.out.println("Digite um número: ");
                num = ler.nextInt();
                valido = true;
            }
            catch (InputMismatchException e){
                System.out.println("Digite um número!");
                ler.nextInt();
                valido = false;
            }
        }while(!valido);
    }
}
