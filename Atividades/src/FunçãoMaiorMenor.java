import java.util.Scanner;

public class FunçãoMaiorMenor {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite o número 1 -> ");
        num1 = ler.nextInt();

        System.out.println("Digite o número 2 ->");
        num2 = ler.nextInt();

        int maior = NumeroMaior(num1, num2);

        System.out.println("O maior número é ->"+ (maior));

    }

    public static int NumeroMaior(int a, int b){

        if (a > b){
            return a;
        }

        else{
            return b;
        }

    }

}
