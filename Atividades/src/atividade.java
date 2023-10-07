


import java.util.Scanner;

public class atividade {
    
    public static void main(String[] args){

            int a, b, c;

            Scanner ler = new Scanner(System.in);

            System.out.println("Digite o valor de A -> ");
            a = ler.nextInt();

            System.out.println("Digite o valor de B -> ");
            b = ler.nextInt();

            System.out.println("Digite o valor de C -> ");
            c = ler.nextInt();

            if (a + b <c){
                System.out.println("Os valores de A e B juntos é menor que C");
            }

            else{
                System.out.println("Os valores de A e B é maior que C");
            }



    }


}
