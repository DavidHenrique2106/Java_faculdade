import java.util.Scanner;

public class notas {
    
        public static void main(String[] args){
            double nota;
            Scanner ler = new Scanner(System.in);

            System.out.print("Digite sua nota: ");
             nota = ler.nextDouble();
    
            if (nota >= 7.0) {
                System.out.println("Você passou direto!");
            } else if (nota >= 5.0 && nota < 7.0) {
                System.out.println("Você está em recuperação.");
            } else {
                System.out.println("Você foi reprovado.");
            }

    }
}
