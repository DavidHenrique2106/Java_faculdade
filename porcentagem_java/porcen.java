import java.util.Scanner;

public class porcen{

    public static void main(String[] args){

        double valor, pagamento;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor do produto -> ");
        valor = ler.nextDouble();

        System.out.println("Escolha a forma de pagamento -> 1(Débito ou pix), 2(Crédito), 3(Em 2x) ou 4(Em 3x) -> ");
        pagamento = ler.nextDouble();

        if (pagamento == 1){
            System.out.println("Desconto de 10% -> " + (valor * 0.1 ));
            System.out.println("Valor final -> " + (valor * 0.9));
        }

        else if (pagamento == 2){
            System.out.println("Desconto de 5% -> " + (valor * 0.05));
            System.out.println("Valor final -> " + (valor * 0.95));
        }

        else if (pagamento == 3){
            System.out.println("O valor se manteve o mesmo -> " + (valor));
            System.out.println("Valor final -> " + (valor));
        }

        else if (pagamento == 4){
            System.out.println("Acrécimo de 5% -> " + (valor * 0.05));
            System.out.println("Valor final -> " + (valor + valor * 0.05));
        }

    }

}