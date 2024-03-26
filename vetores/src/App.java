public class App {

    public static void main(String[] args) {

        int[] vetorOriginal = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] vetorInverso = new int[vetorOriginal.length];
        for (int i = 0; i < vetorOriginal.length; i++) {
            vetorInverso[i] = vetorOriginal[vetorOriginal.length - 1 - i];
        }

        System.out.println("Vetor original:");
        for (int i = 0; i < vetorOriginal.length; i++) {
            System.out.print(vetorOriginal[i] + " ");
        }
        System.out.println(); 

        System.out.println("Vetor inverso:");
        for (int i = 0; i < vetorInverso.length; i++) {
            System.out.print(vetorInverso[i] + " ");
        }
        System.out.println();


    }
}
