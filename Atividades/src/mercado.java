
import java.util.Scanner;
public class mercado{
        public static void main(String[] args){

            String produto;
            int quantidade, valor_unitário;
            Scanner ler = new Scanner(System.in);

            System.out.println("Digite o produto que você pegou -> ");
            produto = ler.next();

            System.out.println("Quanto você produtos você pegou -> ");
            quantidade = ler.nextInt();

            System.out.println("Digite qual o valor unitário do produto -> ");
            valor_unitário = ler.nextInt();

            if (quantidade <=5){
                System.out.println("Nome do produto -> "+ (produto));
                System.out.println("Valor da compra -> "+ (quantidade * valor_unitário));
                System.out.println("Desconto de 2% ");
                System.out.println("Valor final -> " );
            }
    }
}
