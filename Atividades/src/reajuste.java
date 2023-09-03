package Atividades.src;
import java.util.Scanner;

public class reajuste{

    public static void main(String[] args){

            double salario;
            Scanner ler = new Scanner(System.in);

            System.out.println("Digite seu salário -> ");
            salario = ler.nextDouble();

            if (salario <=280){
                System.out.println("Você teve um reajuste de 20%");
                System.out.println("Seu novo salário é de -> " + (salario + salario * 0.2));
            }

            else if (salario >280 && salario <=700){
                System.out.println("Você teve um reajuste de 15% ");
                System.out.println("Seu novo salário é de -> " + (salario + salario * 0.15));
            }

            else if(salario >700 && salario <=1500){
                System.out.println("Você teve um reajuste de 10% ");
                System.out.println("Seu novo salário é de -> " + (salario + salario * 0.10));
            }

            else if (salario >1500){
                System.out.println("Você teve um reajuste de 5% ");
                System.out.println("Seu novo salário é de -> " + (salario + salario * 0.05));
            }

            else{
                System.out.println("Esse salário não consta no nosso sistema!! ");
            }

       }

}