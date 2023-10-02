package Atividades.src;

import java.util.Scanner;

public class mês {
    public static void main(String[] args){


        int mes;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número entre 1 e 12 -> ");
        mes = ler.nextInt();

        switch(mes){
            case 1:
            System.out.println("Janeiro");
            break;
        }

        switch(mes){
            case 2:
            System.out.println("Fevereiro");
            break;
        }

        switch(mes){
            case 3:
            System.out.println("Março");
            break;
        }

        switch(mes){
            case 4:
            System.out.println("Abril");
            break;
        }

        switch(mes){
            case 5:
            System.out.println("Maio");
            break;
        }

        switch(mes){
            case 6:
            System.out.println("Junho");
            break;
        }

        switch(mes){
            case 7:
            System.out.println("Julho");
            break;
        }

        switch(mes){
            case 8:
            System.out.println("Agosto");
            break;
        }

        switch(mes){
            case 9:
            System.out.println("Setembro");
            break;
        }

         switch(mes){
            case 10:
            System.out.println("Outubro");
            break;
        }

        switch(mes){
            case 11:
            System.out.println("Novembro");
            break;
        }

        switch(mes){
            case 12:
            System.out.println("Dezembro");
            break;
        }

    }
}
