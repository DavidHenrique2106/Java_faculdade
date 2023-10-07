
import java.util.Scanner;
public class maior_menor{
    public static void main(String[] args){

        int n1,n2;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número 1 -> ");
        n1 = ler.nextInt();

        System.out.println("Digite um número 2 -> ");
        n2 = ler.nextInt();

        if (n1 == n2){
            System.out.println("Os números são iguais!");
        }

        else if (n1 > n2){
            System.out.println("O número 1 é maior que o segundo!");
        }

        else{
            System.out.println("O segundo é maior que o primeiro!");
        }

    }
}