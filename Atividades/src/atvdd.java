import java.util.Scanner;

public class atvdd {

    public static int numero(int a, int b){

        if (a > b ){
            return a;
        }

        else{
            return b;
        }


    }


    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int n1 = ler.nextInt();
        int n2 = ler.nextInt();

        
        System.out.println("O resultado do maior é -> " + numero(n1, n2));

    }
}
