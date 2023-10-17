import java.util.Scanner;

public class numeroDO_WHILE {
    
        public static void main(String[] args){
    
        Scanner ler = new Scanner(System.in);
        int numero;
    
        do {
            System.out.print("Digite um número positivo: ");
            numero = ler.nextInt();
    
            if (numero <= 0) {
                System.out.println("Número inválido. Por favor, digite um número positivo.");
             }
        }
            
        while (numero <= 0);
    
        System.out.println("Número válido: " + numero);
    
        }
    }



