import java.util.Scanner;


public class senha_while {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int valorFinal = 1000;
        double valorInserido;

        do {
            System.out.println("Digite o valor da suas compras -> ");
            valorInserido = ler.nextDouble();

            if (valorInserido < valorFinal){
                System.out.println("Valor abaixo do obrigatório. Adicione mais ao carrinho!!");
            }

            else{
                System.out.println("Valor obrigatório atingido. Finalize sua compra!!");
                break;
            }

        }
             while (valorInserido < valorFinal);

        }
    }

