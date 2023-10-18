import java.util.Scanner;


public class médiaWhile {
    public static void main(String[] args){


        Scanner ler = new Scanner(System.in);


        int nota1, nota2;
        boolean passou = false;

        while (!passou){
            System.out.println("Digite a nota 1 -> ");
            nota1 = ler.nextInt();

            System.out.println("Digite a nota 2 -> ");
            nota2 = ler.nextInt();

            double media = (nota1 + nota2)/2;

            System.out.println("Sua média é -> " + (media));

            if (media >= 7){
                System.out.println("Atingiu a média!!");
                passou = true;
                break;
            }

            else{
                System.out.println("Média não atingida. Tente até passar a média!");
            }
        }   
    }
}
