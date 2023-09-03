package Atividades.src;
import java.util.Scanner;
public class voto {
    public static void main(String[] args){

        double idade;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua idade -> ");
        idade = ler.nextDouble();

        if (idade >= 18){
            System.out.println("Você está apto(A) a votar!");
        }

        else{
            System.out.println("Você está inapto(A) a votar!");
        }
    }
}
