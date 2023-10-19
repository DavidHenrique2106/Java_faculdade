import java.util.Scanner;

public class funcaoMedia {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua nota 1 -> ");
        int nota1 = ler.nextInt();
        
        System.out.println("Digite sua nota 2 -> ");
        int nota2 = ler.nextInt();

        System.out.println("Digite sua nota 3 -> ");
        int nota3 = ler.nextInt();

        double media = calcularmedia(nota1,nota2,nota3);

        System.out.println("Sua média é -> "+ (media));

    }

    public static double calcularmedia(int a, int b, int c){

        int soma = (a + b + c);
        double media = soma /3;
        return media;

    }

}
