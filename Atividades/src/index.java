package Atividades.src;
import java.util.Scanner;

public class index{

    
        public static void main(String[] args){

            double n1,n2,op;
            Scanner ler = new Scanner(System.in);

            System.out.println("Digite um número -> ");
            n1 = ler.nextDouble();

            System.out.println("Digite um número -> ");
            n2 = ler.nextDouble();

            System.out.println("Digite um número -> 1(+), 2(-), 3(x) ou 4(/) -> ");
            op = ler.nextDouble();

            if (op == 1){
                System.out.println("Você somou. Resultado -> " + (n1 + n2));
            }

            if (op == 2){
                System.out.println("Você subtraiu. Resultado -> " + (n1 - n2));
            }

            if (op == 3){
                System.out.println("Você multiplicou. Resultado -> " + (n1 * n2));
            }

            if (op == 4){
                System.out.println("Você dividiu. Resultado -> " + (n1 / n2));
            }

            else{
                System.out.println("Opção inválida. Escolha entre 1, 2, 3 ou 4 !");
            }

        }


}