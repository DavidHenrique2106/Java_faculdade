import java.util.Scanner;

public class fatorial{

    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int fatorial = 1;

        System.out.println("Digite um número -> ");
        int numero = ler.nextInt();

        for (int i = 1; i <= numero; i++){
            fatorial *=i;
        }

        System.out.println("O fatorial de "+ numero + " é " + fatorial);

        ler.close();
    }

}