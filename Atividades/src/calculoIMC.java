package Atividades.src;
import java.util.Scanner;
public class calculoIMC {
    
    public static void main(String[] args){

        double peso, altura;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu peso -> ");
        peso = ler.nextDouble();

        System.out.println("Digite sua altura -> ");
        altura = ler.nextDouble();

        double total = (peso / altura);

        if (total < 18.5){
            System.out.println("Resultado -> MAGREZA ");
        }

        else if (total > 18.5 && total < 24.9){
            System.out.println("Resultado -> NORMAL");
        }

        else if (total > 24.9 && total < 29.9){
            System.out.println("Resultado -> SOBREPESO");
        }

        else if (total > 29.9 && total < 34.9){
            System.out.println("Resultado -> OBESIDADE GRAU 1 ");
        }

        else if (total > 35.9 && total < 39.9){
            System.out.println("Resultado -> OBESIDADE GRAU 2 ");
        }

        else{
            System.out.println("Resultado -> OBESIDADE GRAU 3");
        }

    }

}
