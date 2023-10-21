import java.util.Scanner;

public class função_senha {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        String senhaCorreta = "senha123";
        int tentativasRestantes = 5;

        boolean acessoConcedido = adivinharSenha(senhaCorreta, tentativasRestantes);

        if (acessoConcedido) {
            System.out.println("Acesso concedido. Bem-vindo!");
        } 
        
        else {
            System.out.println("Acesso negado. Suas tentativas se esgotaram.");
        }
    }

    public static boolean adivinharSenha(String senhaCorreta, int tentativasRestantes) {
        Scanner ler = new Scanner(System.in);

        while (tentativasRestantes > 0) {
            System.out.println("Digite a senha: ");
            String tentativa = ler.nextLine();

            if (tentativa.equals(senhaCorreta)) {
                return true;
            } 
            
            else {
                tentativasRestantes--;
                System.out.println("Senha incorreta. Tentativas restantes: " + tentativasRestantes);
            }
        }

        return false;
    }
}



