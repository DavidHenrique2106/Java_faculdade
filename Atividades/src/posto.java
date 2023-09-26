package Atividades.src;
import java.util.Scanner;
public class posto {
    public static void main(String[] args){


        double valorE = (3.24), valorG = (4.02);
        String opcao;
        int litros;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o combustível! G (gasolina) ou E (Etanol ->)");
        opcao = ler.next();

        System.out.println("Quantos litros você abasteceu? -> ");
        litros = ler.nextInt();

        double total1 = (litros * valorG);
        double total2 = (litros * valorE);

        if (opcao.equals("G") && litros < 20){
            System.out.println("total -> "+ (total1)); 
            System.out.println("Desconto de 3% ");
            System.out.println("Novo total -> "+ (total1 - total1 * 0.03));
            }

        else if (opcao.equals("G") && litros >= 20){
            System.out.println("Total -> "+ (total1));
            System.out.println("Desconto de 5%");
            System.out.println("Novo total -> "+ (total1 - total1 * 0.05));
        }
        
        else if (opcao.equals("E") && litros < 20){
            System.out.println("Total -> "+ (total2));
            System.out.println("Desconto de 4%");
            System.out.println("Novo total -> "+ (total2 - total2 * 0.04));
        }

        else if (opcao.equals("E") && litros >= 20){
        System.out.println("Total -> "+ (total2));
        System.out.println("Desconto de 6%");
        System.out.println("Novo total -> "+ (total2 - total2 * 0.06));
        }

        else{
            System.out.println("Combustível inválido!!!!");
        }

    }
}
