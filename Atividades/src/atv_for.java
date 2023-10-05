package Atividades.src;
import java.util.Scanner;
public class atv_for {
    public static void main(String[] args){

        int n_estudantes, i;

        double n1, n2;

        double media;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o número de estudantes -> ");
        n_estudantes = ler.nextInt();

        for (i=1; i <=n_estudantes; i++){

            System.out.println("Digite a nota 1 -> ");
            n1 = ler.nextDouble();

            System.out.println("Digite a nota 2 -> ");
            n2 = ler.nextDouble();

            media = (n1 + n2)/2;

            System.out.println("Média doa estudantes é -> "+ (media));
            
        }

    }
}
