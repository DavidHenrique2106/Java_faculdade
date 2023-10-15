import java.util.Scanner;


public class conversão {
    public static void main(String[] args){


            Scanner ler = new Scanner(System.in);

            double ValorDolar = 5.08;
            double ValorReal;

            System.out.println("Digite quantos você tem em Reais (R$) -> ");
            ValorReal = ler.nextDouble();

            double conversao = (ValorReal)/ValorDolar;

            System.out.println("Você tem U$$ Dólares na conversão -> "+ (conversao));

            if (conversao < 1500){
                System.out.println("Viagem indisponível. Valor mínimo não atingido");
            }

            else{
                System.out.println("Viagem aceita. Boas ferias!");
            }

    }
}
