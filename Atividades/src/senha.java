package Atividades.src;
import java.util.Scanner;

public class senha{

        public static void main(String[] args){

            double senha;
            Scanner ler = new Scanner(System.in);       
            
            System.out.println("Digite sua senha -> ");
            senha = ler.nextDouble();

            if (senha == 1234){
                System.out.println("Acesso permitido. Bem vindo(A) ");
            }

            else{
                System.out.println("Acesso negado. Tente novamente ");
            }

        }
}