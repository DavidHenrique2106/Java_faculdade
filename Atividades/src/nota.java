



import java.util.Scanner;

public class nota {
    public static void main(String[] args){

            int identifica;
            double nota1,nota2,nota3;
            Scanner ler = new Scanner(System.in);

            System.out.println("Digite seu número de identificação -> ");
            identifica = ler.nextInt();

            System.out.println("Digite sua nota 1 -> ");
            nota1 = ler.nextDouble();

            System.out.println("Digite sua nota 2 -> ");
            nota2 = ler.nextDouble();

            System.out.println("Digite sua nota 3 -> ");
            nota3 = ler.nextDouble();

            System.out.println("Sua identificação é -> " +  identifica );
            
            System.out.println("Suas notas foram -> "+ nota1);
            System.out.println("Suas notas foram -> "+ nota2);
            System.out.println("Suas notas foram -> "+ nota3);

            double me = (nota1 + nota2 + nota3)/3;
            double ma = (nota1 + 2 * nota2 + 3 * nota3 + me)/7;

            System.out.println("Sua média foi de -> "+ me);

            System.out.println("Sua média de aproveitamente foi -> "+ ma );

            if (ma>=9 && ma<10){
                System.out.println("Aprovado! conteito = A");
            }

            else if (ma>=7.5 && ma<9){
                System.out.println("Aprovado! Conceito = B");
            }

            else if (ma>=6 && ma<7.5){
                System.out.println("Aprovado! Conceito = C");
            }

            else if (ma>=4 && ma<6){
                System.out.println("Recuperação! Conceito = D");
            }

            else{
                System.out.println("Rrepovado! Conceito = E");
            }
    }
}
