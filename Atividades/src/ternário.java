package Atividades.src;
import java.util.Scanner;
public class ternário {
    public static void main(String[] args){

        int idade = 18;
        String status;
        Scanner ler = new Scanner(System.in);

          System.out.println("Qual a sua idade -> ");
        idade = ler.nextInt();

        status = (idade >= 18) ? "Adulto" : "Menor de idade";

        System.out.println("Você é -> "+ status);



    }
}
