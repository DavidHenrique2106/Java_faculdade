import java.util.Scanner;

public class atvd_while {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int nota1, nota2;
        double media;

        do {
            System.out.println("Digite a nota 1 -> ");
            nota1 = ler.nextInt();

            System.out.println("Digite a nota 2 -> ");
            nota2 = ler.nextInt();

            media = (nota1 + nota2) / 2; 

            System.out.println("Sua média foi -> " + (media));

            if (media < 7) {
                System.out.println("Você está reprovado!");
                break;
            }
            
            else {
                System.out.println("Aprovado!");
            }
        } 
        
        while (media < 7);

    }
}
