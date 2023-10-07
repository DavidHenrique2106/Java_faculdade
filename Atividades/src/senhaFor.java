import java.util.Scanner;

public class senhaFor{
    public static void main(String[] args ){

        int tentativas = 5;
        String senhaCerta = "12345", senha;

        Scanner ler = new Scanner(System.in);

        for (int i=1; i <=tentativas; i++){

        System.out.println("Digite a sua senha -> ");
        senha = ler.nextLine();

        if (senha.equals(senhaCerta)){
            System.out.println("Acesso permitido ");
            break;
        }

        else{
            System.out.println("Acesso negado. Tentativas restantes -> "+ (tentativas - i));
            if (i == tentativas){
                System.out.println("Acesso negado");
            }
        }

        }
    }
}