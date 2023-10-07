
import java.util.Scanner;

public class calculadora{
    public static void main(String[] args){

        int n1,n2;
        String opção;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o número 1 -> ");
        n1 = ler.nextInt();

        System.out.println("Digite o número 2 -> ");
        n2 = ler.nextInt();

        System.out.println("Digite uma letra entre A e G");
        opção = ler.next();

        if (opção.equals( "a" ) || (opção.equals("A"))){
            System.out.println("Você somou! Resultado -> "+ (n1 + n2));
        }

        else if (opção.equals("b") || (opção.equals("B"))){
        System.out.println("Você subtraiu! Resultado -> "+ (n1-n2));
            }

        else if (opção.equals("c") || (opção.equals("C"))){
            System.out.println("Você dividiu! Resultado -> "+ (n2 / n2));
        }

        else if (opção.equals("d") || (opção.equals("D"))){
            System.out.println("Você multiplicou! Resultado -> "+ (n1 * n2) );
        }

        else if (opção.equals("e") || (opção.equals("E"))){
            System.out.println("Resto da divisão! Resultado -> "+ (n1%n2));
        }

        else if (opção.equals("f") || (opção.equals("F"))){
            System.out.println("Potenciação! Resultado -> "+ (Math.pow(n1, n2)));
        }

        else if (opção.equals("g") || (opção.equals("G"))){
            System.out.println("Raiz quadrada do segundo número! Resultado -> "+ (Math.sqrt(n2)));
        }

        else{
            System.out.println("Opção inválida! ");
        }
    }
}