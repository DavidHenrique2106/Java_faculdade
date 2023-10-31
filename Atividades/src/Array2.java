import java.util.Scanner;

public class Array2 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int capacidade = 100;

        String[] produtos = new String[capacidade];

        int quantidade = 0;

        while (true){
            System.out.println("1(adicionar item), 2(Listar produtos)");
            int escolha = ler.nextInt();

            if (escolha == 1){
                if (quantidade < capacidade){
                System.out.println("Adicionar item");
                System.out.println("Digite o nome do produto -> ");
                ler.nextLine();
                String Nomeproduto = ler.nextLine();
                produtos[quantidade] = Nomeproduto;
                quantidade++;
                System.out.println("Produto adicionado com sucesso!");

                }
            }

            else if (escolha == 2){
                System.out.println("Listar produtos");
                for (int i = 0; i < quantidade; i++)
                System.out.println((i + 1) + " -> " + produtos[i]);
            }

        }

    }
}
