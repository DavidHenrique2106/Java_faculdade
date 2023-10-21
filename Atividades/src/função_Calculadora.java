import java.util.Scanner;

public class função_Calculadora {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n1, n2;
        String operacao;

        System.out.println("Digite o primeiro número -> ");
        n1 = ler.nextInt();

        System.out.println("Digite o segundo número -> ");
        n2 = ler.nextInt();

        System.out.println("Digite a operação desejada -> (+), (-), (/) ou (x) -> ");
        operacao = ler.next();

        int resultado = calculadora(n1, n2, operacao);

        System.out.println("O resultado foi -> " + resultado);
    }

    public static int calculadora(int n1, int n2, String operacao) {

        if (operacao.equals("+")){
            return n1 + n2;
        } 
        
        else if (operacao.equals("-")){
            return n1 - n2;
        }
        
        else if (operacao.equals("/")){
            return n1 / n2;
        } 
        
        else if (operacao.equals("x")){
            return n1 * n2;
        } 
        
        else{
            System.out.println("Operação inexistente!");
            return 0;
        }
    }
}