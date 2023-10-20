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

        double media = calcularMedia(nota1,nota2,nota3);

        System.out.println("Sua média é -> "+ (media));

        desempenho(media);

        aprovação(media);

    }

    public static double calcularMedia(int a, int b, int c){

        int soma = (a + b + c);
        double media = soma /3;
        return media;

    }


    public static void desempenho (double media) {

        if (media >= 7.0) {
            System.out.println("Ótimo desempenho! ");
        }
        else if (media >= 5.0) {
            System.out.println("Bom desempenho! ");
        }
        else {
            System.out.println("Necessita de melhoria! ");
        }
    }
    

        public static void aprovação (Double media){

            if (media >= 7){
                 System.out.println("Aprovado! ");
            }

            else{
                System.out.println("Reprovado! ");
            }
        }
}
