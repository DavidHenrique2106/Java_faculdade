import java.util.Scanner;

public class FunçãoMercado {

    public void compras() {
        Scanner ler = new Scanner(System.in);

        int total = 0;

        while (true){
            System.out.println("Digite o valor das suas compras de hoje -> ");
            double compras = ler.nextDouble();

            total += compras;

            if (total < 500){
                System.out.println("Suas compras valem -> " + (total) + " Compre até chegar ou passar dos 500,00");
            }

            else{
                System.out.println("Suas compras valem "+ (total) + " Quer continuar? Digte (S ou N) -> ");
                String pergunta = ler.next();

                if (pergunta.equalsIgnoreCase("N")){
                    break;
                }
            }

        }

        System.out.println("Valor da compra -> "+ (total) );
        System.out.println("Até a próxima compra. Muito obrigado!");

        }
    

    public static void main(String[] args) {
        FunçãoMercado objeto = new FunçãoMercado();

        objeto.compras();
    }
}
