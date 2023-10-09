import java.util.Scanner;


public class nomeFor {
    public static void main(String[] args){


        Scanner ler = new Scanner(System.in);

        int tentativas = 3;
        String NomeCerto = "David";

        for (int i = 1; i <=tentativas; i++){
            System.out.println("Digite seu nome -> ");
            String nome = ler.nextLine(); 

            if (nome.equals(NomeCerto)){
                System.out.println("Nome correto!");
                break;
            }

            else{
                System.out.println("Nome incorreto! Tentativas restantes -> "+ (tentativas - i));
                if (i == tentativas){
                    System.out.println("Você não sabe o nome certo! Desista");
                }
            }
        }




    }
}
