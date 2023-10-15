import java.util.Scanner;


public class conversão {
    public static void main(String[] args){


            Scanner ler = new Scanner(System.in);

            double ValorDolar = 5.08;

            System.out.println("Digite quantos você tem em Reais (R$) -> ");
            double ValorReal = ler.nextDouble();

            System.out.println("Você tem U$$ Dólares na conversão -> "+ (ValorReal / ValorDolar));

    }
}
