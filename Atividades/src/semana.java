
import java.util.Scanner;
public class semana {
    public static void main(String[] ars){

            int dia_semana;
            Scanner ler = new Scanner(System.in);

            System.out.println("Digite um número de 1 a 7 -> ");
            dia_semana = ler.nextInt();

            switch (dia_semana){
                case 1:
                System.out.println("Hoje é domingo");
                break;

                case 2:
                System.out.println("Hoje é segunda");
                break;

                case 3:
                System.out.println("Hoje é terça");
                break;

                case 4:
                System.out.println("Hoje e quarta");
                break;

                case 5:
                System.out.println("Hoje é quinta");
                break;

                case 6:
                System.out.println("Hoje é sexta");

                case 7:
                System.out.println("hoje é sábado");
                break;

                default:
                System.out.println("Dia inválido!!");
            }
    }
}
