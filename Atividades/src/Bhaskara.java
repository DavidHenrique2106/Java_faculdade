package Atividades.src;
import java.util.Scanner;

public class Bhaskara{

    public static void main(String[] args){


            Scanner ler = new Scanner(System.in);

        System.out.println("Este programa calcula as raízes de uma equação do segundo grau.");
        System.out.print("Digite o coeficiente 'a': ");

        double a = ler.nextDouble();
        System.out.print("Digite o coeficiente 'b': ");

        double b = ler.nextDouble();
        System.out.print("Digite o coeficiente 'c': ");

        double c = ler.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes da equação são: x1 = " + x1 + " e x2 = " + x2);
        } else if (delta == 0) {
            double x1 = -b / (2 * a);
            System.out.println("A equação possui uma raiz real: x1 = " + x1);
        } else {
            System.out.println("A equação não tem solução no conjunto dos reais.");
        }

        ler.close();

    }

}