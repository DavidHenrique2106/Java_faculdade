public class app2 {
    public static void main(String[] args) {
        
        int[] vetorOriginal = {5, 8, 12, 3, 7, 9, 4, 10, 6, 2};

        
        int[] segundoVetor = new int[vetorOriginal.length];
        for (int i = 0; i < vetorOriginal.length; i++) {
            if (i % 2 == 0) { 
                segundoVetor[i] = vetorOriginal[i] / 2; 
            } else { 
                segundoVetor[i] = vetorOriginal[i] * 3; 
            }
        }

    
        System.out.print("Segundo vetor: ");
        for (int num : segundoVetor) {
            System.out.print(num + " ");
        }
    }
}
