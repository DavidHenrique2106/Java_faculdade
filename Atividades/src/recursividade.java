public class recursividade {
    public static int fat(int n) {
        if (n == 1) {
            return 1;
        }

        return  n * fat(n-1);
    }
}
