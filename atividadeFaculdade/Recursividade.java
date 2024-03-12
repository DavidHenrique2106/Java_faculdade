package atividadeFaculdade;

public class Recursividade {
    public static int fat(int n ){
        System.out.println("Calculado o fat de "+ n);
        if (n==1){
            return 1;
        }
        
        int resultado = n * fat(n - 1 );
        System.out.println("voltei fat de " + n);
        return resultado;
    }

    public static void main(String[] args){
        int n = 5;
        System.out.println(fat(n));
    }
}
