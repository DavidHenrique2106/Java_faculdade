import java.util.Scanner;

public class vogalFOR {
    public static void main(String[] args){


        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma frase -> ");
        String frase = ler.nextLine();


        int vogalNaFrase = 0;

        for (int i = 0; i < frase.length(); i++) {
            char indv = frase.charAt(i);

            if (indv == 'a' || indv == 'e' || indv == 'i' || indv == 'o' || indv == 'u') {
                vogalNaFrase++;
            }
        }

        System.out.println("Número de vogais na frase digitada é -> "+ (vogalNaFrase));




    }
}
