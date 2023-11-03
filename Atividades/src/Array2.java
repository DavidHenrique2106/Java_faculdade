import java.util.Scanner;

public class Array2 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int capacidade = 100;

    String[] produtos = new String[capacidade];

    int quantidade = 0;

    while (true) {
      System.out.println("1 - Adicionar produto");
      System.out.println("2 - Listar produtos");
      System.out.println("3 - Remover produtos");
      System.out.println("4 - Sair do programa");
      int escolha = ler.nextInt();

      if (escolha == 1) {
        if (quantidade < capacidade) {
          System.out.println("Adicionar item");
          System.out.println("Digite o nome do produto -> ");
          ler.nextLine();
          String Nomeproduto = ler.nextLine();
          produtos[quantidade] = Nomeproduto;
          quantidade++;
          System.out.println("Produto adicionado com sucesso!");
        }
      } else if (escolha == 2) {
        System.out.println("Listar produtos");
        for (int i = 0; i < quantidade; i++) System.out.println(
          (i + 1) + " -> " + produtos[i]
        );
      } else if (escolha == 3) {
        if (quantidade > 0) {
          System.out.println(
            "Digite o número do produto que deseja remover da lista -> "
          );
          int RemoverProduto = ler.nextInt();

          if (RemoverProduto >= 1 && RemoverProduto <= quantidade) {
            for (int i = RemoverProduto - 1; i < quantidade - 1; i++) {
              produtos[i] = produtos[i + 1];
            }
            quantidade--;
            System.out.println("Produto removido");
          } else {
            System.out.println("Número de lista inválido.");
          }
        } else {
          System.out.println("Nenhum produto na lista para remover.");
        }
      } else if (escolha == 4) {
        System.out.println("Sair do programa");
        break;
      }
    }
  }
}
