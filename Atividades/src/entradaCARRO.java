import java.util.Scanner;

public class entradaCARRO {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        double entrada;

        do {
            System.out.println("Digite o valor de entrada que você deseja dar no carro -> ");
            entrada = ler.nextDouble();

            if (entrada < 5500){
                System.out.println("Infelizmente não será possível fazer o financiamento. Tente um valor mais alto!!");
            }

            else{
                System.out.println("Financiamento aprovado");
                break;
            }

        }

        while(entrada < 5500);

    }
}
