import java.util.Scanner;

public class comprasWhile {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        Boolean condicao = true;

        while (condicao){
            
            System.out.println("Quer adicionar algo mais ao carrinho? (sim/não) -> ");
            String resposta = ler.nextLine();

            if (!resposta.equalsIgnoreCase("sim")){
                condicao = false;
            }

        }
         System.out.println("Compras finalizadas!!");
    }
}
