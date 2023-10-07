

import java.util.Scanner;

public class ordem {

    public static void main(String[] args) {

        int n1, n2, n3;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o n1 -> ");
        n1 = ler.nextInt();

        System.out.println("Digite o n2 -> ");
        n2 = ler.nextInt();

        System.out.println("Digite o n3 -> ");
        n3 = ler.nextInt();

        if (n1 > n2 && n1 > n3 && n2 > n3) {
            System.out.println("A ordem é -> n1, n2 e n3");
        }

        else if (n1 > n2 && n1 > n3 && n3 > n2) {
            System.out.println("A ordem é -> n1, n3 e n2");
        }

        else if (n2 > n1 && n2 > n3 && n1 > n3) {
            System.out.println("A ordem é -> n2, n1 e n3");
        }

        else if (n2 > n1 && n2 > n3 && n3 > n1) {
            System.out.println("A ordem é -> n2, n3 e n1");
        }

        else if (n3 > n2 && n3 > n1 && n2 > n1) {
            System.out.println(" A ordem é -> n3, n2 e n1");
        }

        else if (n3 > n2 && n3 > n1 && n1 > n2) {
            System.out.println(" A ordem é -> n3, n1 e n2");
        }

    }
}
