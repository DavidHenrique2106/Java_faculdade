import java.util.Scanner;

public class dataFor {
    public static void main(String[] args){


        Scanner ler = new Scanner(System.in);

        int tentativas = 5;
        String DataCorreta = "210605";

        for (int i = 1; i <= tentativas; i++){
            System.out.println("Para concluir esse cadastro é necessário sua data de nascimento!");
            System.out.println("Digite sua data de nascimento -> ");
            String DataUsuario = ler.nextLine();

            if (DataUsuario.equals(DataCorreta)){
                System.out.println("Você acertou. Parabéns!");
                break;
            }

            else{
                System.out.println("Você errou. Tentativas restantes -> "+ (tentativas - i));
                if (i == tentativas){
                    System.out.println("Você não sabe a data. Não foi possível continuar!!");
                    break;
                }
            }
        }
            ler.close();
    }
}
