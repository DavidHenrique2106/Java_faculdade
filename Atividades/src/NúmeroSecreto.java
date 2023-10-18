import java.util.Scanner;


public class NúmeroSecreto {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int NumeroCerto = 50;
        Boolean acertou = false;
        int tentativa;

        while (!acertou){
            System.out.println("Adivinhe o número secreto -> ");
            tentativa = ler.nextInt();

            if (tentativa == NumeroCerto){
                System.out.println("Parabéns, você acertou!");
                acertou = true;
                break;
            }

            else{
                System.out.println("Tente novamente -> ");
            }
        }
    }
}
